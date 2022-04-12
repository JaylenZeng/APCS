import core.data.*;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        DataSource ds = DataSource.connect("https://data.austintexas.gov/api/views/9t4d-g238/rows.xml").load();
    }
}
