import java.util.ArrayList;

public class ArrayList {
    public static void main(String arg[]){
        
        ArrayList <String> names=new ArrayList<>();
        
        names .add("jack");
        names .add("kressley");
        names .add("alinas");
        names .add("andoy");
        names .clear();
        names.set(0, "gay");
        //names.remove("jack");
        for (int i = 0; i<names.size(); i++){
        System.out.print(names.get(i)+",");    
        System.out.println(names.size());
        System.out.println(names);
        System.out.println(names.isEmpty());
    }
    
}
}