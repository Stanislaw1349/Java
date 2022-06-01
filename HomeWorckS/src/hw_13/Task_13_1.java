package hw_13;

import java.util.ArrayList;
import java.util.List;
// Задача №1
//
//Создать лист и добавить в него следующие слова:
//White.
//Tan.
//Yellow.
//Orange.
//Red.
//Pink.
//Purple.
//Blue.
//Затем удалить из этого списка все цвета в которых встречается буква “l”
public class Task_13_1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("White");
        list.add("Tan");
        list.add("Yellow");
        list.add("Orange");
        list.add("Red");
        list.add("Pink");
        list.add("Purple");
        list.add("Blue");

        System.out.println(list);

        //list.removeIf(p -> p.contains("l"));

        for (int i = list.size() - 1 ; i >= 0; i--){
            if (list.get(i).contains("l")){
                list.remove(i);
            }
        }
        System.out.println(list);



    }
}
