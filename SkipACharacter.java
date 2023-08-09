public class SkipACharacter {
    public static void main(String[] args) {
        String str = "airplane";
        skipper("", str);

    }

    static void skipper(String p, String up) {
        if (up.length() == 0) {

            System.out.println(p);
            return;

        } else {
            char curr = up.charAt(0);
            if (curr != 'a') {
                p = p + curr;
            }

            up = up.substring(1);

            skipper(p, up);
        }
    }
}
