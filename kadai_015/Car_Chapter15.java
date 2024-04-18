package kadai_015;

public class Car_Chapter15 {
	private int gear;
	private int speed;
	
	public  Car_Chapter15 (int gear,int speed) {
		this.gear=gear;
		this.speed=speed;
		}
	public void gearchange(int afterGear) {
		switch (afterGear) {
		case 1 ->this.speed=10;
		case 2 ->this.speed=20;
		case 3 ->this.speed=30;
		case 4 ->this.speed=40;
		case 5 ->this.speed=50;
		default->this.speed=10;
		}
		
		System.out.println("ギア"+this.gear+"から"+afterGear+"に変わりました");
		this.gear =afterGear;
	}
	
		public void run() {
			System.out.println("速度は"+this.speed+"kmです");
		}
		
		
		
	}
