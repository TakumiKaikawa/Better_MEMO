import java.util.ArrayList;

public class Memory{

    static ArrayList<String> list = new ArrayList<>();

// データをArrayListに保存するメソッド
    public static void save(String data){
        list.add(data);
    }
}