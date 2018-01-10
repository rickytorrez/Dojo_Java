import java.util.HashMap;

public class MapOfTheHashmatique {
    static HashMap<String, String> trackList = new HashMap<>();


    public static void getTrack(){
        for (String key : trackList.keySet()){ 
            System.out.println(key + " | Lyrics : " + trackList.get(key));
        }
    }

    public static void main(String[]args) {

        trackList.put("Free Falling", "I am free falling");
        trackList.put("Killing me Softly", "Slowly, dying inside slowly");
        trackList.put("After the Storm" , "There'll come a time you'll see");

        getTrack();
    }
}