package experiment;

public class HardDisk {
	int amount;
	int storage;//�ڴ�
	float price;//��Ǯ
	HardDisk() {
		
	}
	HardDisk(int amount,int storage,float price){
		this.amount=amount;
		this.storage=storage;
		this.price=price;
	}
	public int getAmount() {
		return amount;
	}
	
	public int getStorage() {
		return storage;
	}
	public void setStorage(int storage) {
		this.storage = storage;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void freth(int storage,float price) {
		if(storage>=500) {
			System.out.println("Ӳ���ڴ����500G");
		}
		else if(storage<500){
			System.out.println("Ӳ���ڴ�С��500G");
		}
	}
//	public static void main(String[] args) {
//		HardDisk disk=new HardDisk();
//		disk.freth(500, 500);
//	}
}
