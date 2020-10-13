package experiment;

public class CPU {
	int speed;//速度
	String brand;//品牌
	int threading;//线程数
	CPU(){
		
	}
	CPU(int speed,String brand,int threading){
		this.speed=speed;
		this.brand=brand;
		this.threading=threading;
	}
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int m) {
		this.speed = m;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getThreading() {
		return threading;
	}
	public void setThreading(int threading) {
		this.threading = threading;
	}
	protected void read(String brand,int threading) {
		if(brand=="intel") {
			System.out.println("您的电脑处理器是英特品牌。");
		}else {
			System.out.println("未找到您需要的处理器。");
		}
		if(threading>1) {
			System.out.println("cpu为多线程。");
		}
		else {
			System.out.println("cpu为单线程。");
		}
	}
//	public static void main(String[] args) {
//		CPU cpu=new CPU();
//		cpu.read("dd", 1);
//	}
}
