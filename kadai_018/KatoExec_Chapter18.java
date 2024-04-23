package kadai_018;
public class KatoExec_Chapter18{
	 public static void main(String[] args) {
		 
		 KatoTaro_Chapter18 taro=new KatoTaro_Chapter18();
		 taro.givenName="太郎";
		 KatoIchiro_Chapter18 ichiro=new KatoIchiro_Chapter18();
		 ichiro.givenName="一郎";
		 KatoHanako_Chapter18 hanako=new KatoHanako_Chapter18();
		 hanako.givenName="花子";
		 
		 taro.setGivenName();
		 taro.execIntroduce();
		 System.out.println();
		 ichiro.setGivenName();
		 ichiro.execIntroduce();
		 System.out.println();
		 hanako.setGivenName();
		 hanako.execIntroduce();
		 System.out.println();
		 
		 
		 
	 }
	
	
	
	
}