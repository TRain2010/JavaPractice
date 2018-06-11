package com.company.model;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Datasourse {
    public static final String DATA_NAME = "music.db";
    public static final String CONNECTION_STRING = "jdbc:sqlite:C:\\Users\\T-Rain\\Documents\\GitHub\\JavaPractice\\" + DATA_NAME;

    // albums table
    public static final String TABLE_ALBUMS = "albums";
    public static final String COLUMN_ALBUM_ID = "_id";
    public static final String COLUMN_ALBUM_name = "name";
    public static final String COLUMN_ALBUM_artist = "artist";

    // artists table
    public static final String TABLE_ARTISTS = "artists";
    public static final String COLUMN_ARTIST_ID = "_id";
    public static final String COLUMN_ARTIST_NAME = "name";
    public static final int INDEX_ARTIST_ID = 1;
    public static final int INDEX_ARTIST_NAME = 2;

    // songs table
    public static final String TABLE_SONGS = "songs";
    public static final String COLUMN_SONGS_ID = "_id";
    public static final String COLUMN_SONGS_TRACK = "track";
    public static final String COLUMN_SONGS_TITLE = "title";
    public static final String COLUMN_SONGS_ALBUM = "album";

    // query order
    public static final int NO_ORDER = 0;
    public static final int ASC_ORDER = 1;
    public static final int DEC_ORDER = 2;

    private Connection conn;

    public boolean open() {
        try {
            conn = DriverManager.getConnection(CONNECTION_STRING);
            return true;
        } catch (SQLException e) {
            System.out.println("Can't open data: " + e.getMessage());
            return false;
        }
    }

    public boolean close() {
        try {
            conn.close();
            return true;
        } catch (SQLException e) {
            System.out.println("Can't close data: " + e.getMessage());
            return false;
        }
    }

    public List<Artists> queryArtist(int queryOrder) {
        StringBuilder sb = new StringBuilder("SELECT * FROM ");
        sb.append(TABLE_ARTISTS);
        if (queryOrder != NO_ORDER) {
            sb.append(" ORDER BY ");
            sb.append(COLUMN_ARTIST_NAME);
            sb.append(" COLLATE NOCASE ");
            if (queryOrder == DEC_ORDER)
                sb.append("DESC");
            else
                sb.append("ASC");
        }


        try (Statement statement = conn.createStatement();
        ResultSet result = statement.executeQuery(sb.toString())) {
            List<Artists> artists = new ArrayList<>();
            while (result.next()) {
                Artists tmp = new Artists();
                tmp.set_id(result.getInt(INDEX_ARTIST_ID));
                tmp.setName(result.getString(INDEX_ARTIST_NAME));
                artists.add(tmp);
            }
            return artists;

        } catch (SQLException e) {
            System.out.println("Query Failed : " + e.getMessage());
            return null;
        }
    }


}
