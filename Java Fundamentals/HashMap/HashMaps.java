import java.util.HashMap;
import java.util.Set;
public class HashMaps{
    public static void defineHash(){
        HashMap<String,String> trackList = new HashMap<String,String>();
        trackList.put("Courtesy Call","It's dangerous in the club");
        trackList.put("Till i Collapse","Till i collapse in this land ");
        trackList.put("Hero","I Need a Hero to save me ");
        trackList.put("IN the end","One thing it doesn't ever matter how hard u try");
        System.out.println(trackList.get("Courtesy Call"));
        Set <String> keys = trackList.keySet();
        for (String key : keys){
            System.out.println("This is the Track: " + key + " This is the Track Lyrics " + trackList.get(key) );
        }
    }   
}