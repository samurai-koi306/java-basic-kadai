package kadai_026;
import java.util.HashMap;
import java.util.Scanner;
public class Jyanken_Chapter26{
	public String getmyChoice(){
		Scanner scanner=new Scanner(System.in);
	
		while (true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			String input=scanner.next();
			
			if((input.equals("r")) ||(input.equals("s"))||(input.equals("p"))) {
				scanner.close();
				return input;
			}else{
				System.out.println("正しくありません");
		      	continue;
			}
		}
			}
			public String getRandom(){
				String[]janken= {"r","s","p"};
				String Random=janken[(int)Math.floor(Math.random()*3)];
				return Random;
			
				}
			 public void playGame(String me,String you){
			    	HashMap<String,String>game=new HashMap<String,String>();
			        game.put("r", "グー");
			        game.put("s", "チョキ");
			        game.put("p", "パー");
			       System.out.println("自分の手は"+game.get(me)+"対戦相手の手は"+game.get(you));
			       
			       
			       
			       
			        if((me.equals("r")&&you.equals("r")) || (me.equals("s")&&you.equals("s")) || (me.equals("p")&&you.equals("p"))) {			        	System.out.println("あいこです");
			        	System.out.println("あいこです");
			        	}else if((me.equals("r")&&you.equals("s") || me.equals("s")&&you.equals("p") || me.equals("p")&&you.equals("r"))) {
			        		System.out.println("自分の勝ちです");
			            }else {
			            	System.out.println("自分の負けです");
			            }
			      
			        	
		
			        
			        
			       }
				
				
				
			
			
			
		
		
		
	}
	
