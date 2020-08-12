import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！
		
		//要素数を numOfElements に格納
        Scanner sc = new Scanner(System.in);
        String numOfElementsSt = sc.nextLine();
        int numOfElements = Integer.parseInt(numOfElementsSt);
        
		//Data型のリスト inDatas に入力値を格納
        List<Data> inDatas = new ArrayList<Data>();
        for (int i = 0; i < numOfElements; i++){
            Data datas = new Data();
            String element = ""; 
            element = sc.nextLine();
			//入力値を金、銀それぞれに分割したData型に変換してリストに入れる
            datas.setData(element);
            inDatas.add(datas);
        }
		//Sort順を定義（銀の降順、同値の場合金の降順）
        Comparator<Data> dataComparator = Comparator.comparing(Data::getSilver,Comparator.reverseOrder()).thenComparing(Data::getGold,Comparator.reverseOrder());
        inDatas.sort(dataComparator);
		//Sort後の結果を出力
        for (int i = 0; i < numOfElements; i++){
            System.out.println(inDatas.get(i).getGold() + " " + inDatas.get(i).getSilver());
        }
    }
}
//金と銀それぞれをint型で持ってる
class Data {
	//変数の定義
    private int gold;
    private int silver;
    
	//コンストラクタ
    public Data(){
    }

	//入力値を半角スペース前と後で分割
    public void setData(String element){
            int index = 0;
            String goldSt ="";
            
			//頭から半角スペースまでを金の値とする
            index = element.indexOf(" ");
            goldSt = element.substring(0,index);

			//金の値の後の半角スペース以降をelementに格納
            element = element.substring(index + 1);
            index = element.indexOf(" ");
            
			//半角スペースまでを銀の値とする（銀の値の後ろに半角スペースがある場合を加味）
            String silverSt = "";
            if (index == -1){
                silverSt = element;
            }else{
                silverSt = element.substring(0,index);
            }
            gold = Integer.parseInt(goldSt);
            silver = Integer.parseInt(silverSt);
    }
    public int getGold(){
        return gold;
    }
    public int getSilver(){
        return silver;
    }
}
