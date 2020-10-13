package experiment;

public class PC {
	private CPU cpu;
	HardDisk HD;
	double price;//价钱
	int ranking;//排名
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
		System.out.println("CPU的速度："+cpu.getSpeed());
		System.out.println("硬盘的容量："+HD.getAmount());
	}
	protected void see(double price,int ranking) {
		if(price>=3500.0&price<=7000.0&ranking<=5) {
			System.out.println("电脑价钱适中且排名前五。");
		}else {
			if(price>7000.0) {
			    System.out.println("电脑价钱过高，根据实际情况购买。");
			}
			if(price<35000.0){
				System.out.println("电脑价钱低，质量不保证。");
			}
		}
		if(ranking>5) {
			System.out.println("电脑排名靠后。");
		}
	}
//	public static void main(String[] args) {
//		PC pc=new PC();
//		pc.see(3800.0,6);
//	}
}
