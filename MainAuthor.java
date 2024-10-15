public class MainAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("tan tai", "tai@gmail.com", 't');
        System.out.println(a1);
        System.out.println("name is: "+a1.getName());
        System.out.println("email is: "+a1.getEmail());
        System.out.println("gender is: "+a1.getGender());


    }
}
