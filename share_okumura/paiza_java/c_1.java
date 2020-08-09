import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String countString = sc.nextLine();
        int count = Integer.parseInt(countString);
        List<String> datas = new ArrayList<>();
        for (int i = 0; i<count; i++){
            String data = "";
            data = sc.nextLine();
            datas.add(data);
        }
        for (int i = 0; i<count; i++){
            String value = "";
            value = datas.get(i);

            String name = "";
            int index = 0;
            index = value.indexOf(" ");
            name = value.substring(0,index);

            String ageData = value.substring(index + 1);
            index = ageData.indexOf(" ");
            
            String ageSt = "";
            if (index == -1){
                ageSt = ageData;
            }else{
                ageSt = ageData.substring(0,index);
            }
            int age = Integer.parseInt(ageSt);
            age = age +1;
            System.out.println(name + " " + age);
        }

    }
}