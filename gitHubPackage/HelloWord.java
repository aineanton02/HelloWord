public class HelloWord {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        System.out.println(sumar(12,22));
        System.out.println(restar(12,22));
    }
    public static int sumar(int x,int y){
        return x+y;
    }
    public static int restar(int x,int y){
        return x-y;
    }
}