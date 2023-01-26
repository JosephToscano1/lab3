import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;



public class ListTests {
    @Test
    public void testFilterNothing(){
   
            List<String> list = new ArrayList<>(); 
            list.add("apple");
            list.add("fruit");
            list.add("peaches");

            List<String> result = new ArrayList<>();

            assertEquals(result, ListExamples.filter(list, "zzz")); 

        }
    @Test
    public void testFilter(){
        List<String> list = new ArrayList<>(); 
            list.add("apple");
            list.add("fruit");
            list.add("peaches");
            list.add("appley");

            List<String> result = new ArrayList<>();
            result.add("apple");
            result.add("appley");

            assertEquals(result, ListExamples.filter(list, "apple")); 
    }
        
        

    }
    

