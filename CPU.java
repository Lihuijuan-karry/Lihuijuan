package experiment;

public class CPU {
	int speed;//�ٶ�
	String brand;//Ʒ��
	int threading;//�߳���
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
			System.out.println("���ĵ��Դ�������Ӣ��Ʒ�ơ�");
		}else {
			System.out.println("δ�ҵ�����Ҫ�Ĵ�������");
		}
		if(threading>1) {
			System.out.println("cpuΪ���̡߳�");
		}
		else {
			System.out.println("cpuΪ���̡߳�");
		}
	}
//	public static void main(String[] args) {
//		CPU cpu=new CPU();
//		cpu.read("dd", 1);
//	}
}
