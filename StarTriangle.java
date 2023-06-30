package basics;

public class StarTriangle {
    private int width;

    public StarTriangle(int width) {
        this.width = width;
    }

    public String toString() {
        String triangle = "";
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++) {
                triangle += "[*]";
            }
            triangle += "\n";
        }
        return triangle;
    }

    public static void main(String[] args) {
        StarTriangle small = new StarTriangle(3);
        System.out.println(small.toString());
    }



}
