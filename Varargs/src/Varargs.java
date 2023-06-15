public class Varargs {
    public static void main(String[] args) {
            int wynik = add("cos tam pierwsze",10, 1, 99, 88, 0, 1);
            System.out.println(wynik);
        }
        public static int add(String text, int...numbers){
            System.out.println(text);
            int suma = 0;
            for(int i=0; i<numbers.length; i++) {
                int value = numbers[i];
                System.out.println("cyfra nr "+(i+1)+ " to "+ value);
                suma+=value;
            }
            return suma;
        }
}
