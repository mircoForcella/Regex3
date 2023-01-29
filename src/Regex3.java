public class Regex3 {
    public static void main(String[] args) {
        String str = "are you able to climb, are you able to swim or are you able to fly?";
        String replaced = str.replaceAll("(?<=\\s)are", "_XYZ");
        System.out.println(replaced);
    }
}
