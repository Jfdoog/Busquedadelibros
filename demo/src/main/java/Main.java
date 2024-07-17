
import  java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GutendexClient client = new GutendexClient();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter search query: ");
        String query = scanner.nextLine();

        try {
            GutendexResponse response = client.searchBooks(query);
            System.out.println("Response from Gutendex API:");
            for (GutendexResponse.Book book : response.getBooks()){
                System.out.println("Title" + book.getTitle());
                System.out.println("Authors:");
                for (GutendexResponse.Author author : book.getAuthors()){
                    System.out.println(author.getName() + " ");
                }
                System.out.println(" \n ");
            }
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }


}
