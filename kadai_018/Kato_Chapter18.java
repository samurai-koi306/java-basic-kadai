package kadai_018;
abstract public class Kato_Chapter18{
	 public String familyName="加藤";//姓を表す
	 public String givenName;//名
     public String addres="東京都中野区〇×";  //住所
	
    public void commonIntroduce() {
    	System.out.println("名前は"+familyName+givenName+"です");
    	System.out.println("住所は"+addres);
    }
    
    abstract public void eachIntroduce(); {
    	
    }
	
    public void execIntroduce() {
    	commonIntroduce();
    	 eachIntroduce();
    	 System.out.println();
    	 
    }

	
	
	
	
}
