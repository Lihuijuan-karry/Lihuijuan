package experiment;

public class PC {
	private CPU cpu;
	HardDisk HD;
	double price;//��Ǯ
	int ranking;//����
	PC(){
		
	}
	PC(CPU cpu,HardDisk HD,double price,int ranking){
		this.cpu=cpu;
		this.HD=HD;
		this.price=price;
		this.ranking=ranking;
	}
	public void setCpu(CPU c) {
		this.cpu = c;
	}
	public void setHD(HardDisk h) {
		this.HD = h;
	}
	
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public void show() {
		System.out.println("CPU���ٶȣ�"+cpu.getSpeed());
		System.out.println("Ӳ�̵�������"+HD.getAmount());
	}
	protected void see(double price,int ranking) {
		if(price>=3500.0&price<=7000.0&ranking<=5) {
			System.out.println("���Լ�Ǯ����������ǰ�塣");
		}else {
			if(price>7000.0) {
			    System.out.println("���Լ�Ǯ���ߣ�����ʵ���������");
			}
			if(price<35000.0){
				System.out.println("���Լ�Ǯ�ͣ���������֤��");
			}
		}
		if(ranking>5) {
			System.out.println("������������");
		}
	}
//	public static void main(String[] args) {
//		PC pc=new PC();
//		pc.see(3800.0,6);
//	}
}
