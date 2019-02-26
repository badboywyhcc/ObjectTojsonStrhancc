import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ArrayList courseList = new ArrayList();
        courseList.add("english");
        courseList.add("Chinese");
        courseList.add("mathematics");

        Person Rango = new Person("Rango", 175, 70,18, true,courseList);
        Person Beans = new Person("Beans", 160, 45,17, false,courseList);

        ArrayList studentList = new ArrayList();
        studentList.add(Rango);
        studentList.add(Beans);

        HashMap<String,Object> statusMap = new HashMap<String,Object>();
        statusMap.put("code", 0);
        statusMap.put("data", studentList);

        Gson gson = new Gson();
        String jsonstr = gson.toJson(statusMap);

        System.out.println("🎾trans:   "+jsonstr);
    }
}
