import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import java.util.List;


public class GutendexResponse {
    @SerializedName("results")
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public static class Book {
        private String title;
        private List<Author>  authors;

        public String getTitle() {
            return title;
        }

        public List<Author> getAuthors() {
            return authors;
        }
    }
    public static class Author {
        private String name;
        private Integer birth_year;
        private Integer death_year;

        public String getName() {
            return name;
        }

        public Integer getBirthYear() {
            return birth_year;
        }

        public Integer getDeathYear() {
            return death_year;
        }
    }


}

