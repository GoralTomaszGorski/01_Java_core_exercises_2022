public class toString {
    public static void main(String[] args) {

        Course course1 = new Course("JAVA", "Super kurs dla najmłodszych", 4011.00);
        Course course2 = new Course("HTML", "Super kurs dla tych co lubia okienka", 4011.00);
        Course course3 = new Course("PHP", "Nie dla Marcina", 450.11);

        System.out.println(course1.getName()+" "+course1.getDescription()+" "+course1.getPrice());
        System.out.println(course2.getName()+" "+course2.getDescription()+" "+course2.getPrice());
        System.out.println(course3.getName()+" "+course3.getDescription()+" "+course3.getPrice());

        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);
    }
}
