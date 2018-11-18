public class Main {

    public static void main(String[] args) {
        // split
        String para = "this is, hi seaiwa";
        String[] words = para.toLowerCase().split("[ !?',;.]+");
        System.out.println(para);
        for (String s: words)
        System.out.println(s);
    }
}
