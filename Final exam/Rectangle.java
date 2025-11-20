public class Rectangle {
    public float length;
    public float breath;

    public Rectangle(float length, float breath) {
        this.length = length;
        this.breath = breath;
    }

    public String getData() {
        String data = "Length : " + this.length + " Breath : " + this.breath;
        return data;
    }

    public void displayArea() {
        System.out.println("Area : " + length * breath);
    }

    public static void main(String[] args) {
        Rectangle obj = new Rectangle(12, 30);
        System.out.println(obj.getData());
        obj.displayArea();
    }

}
