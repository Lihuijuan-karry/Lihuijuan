package experiment;

public class HardDisk {
	int amount;
	int storage;//内存
	float price;//价钱
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
			System.out.println("硬盘内存大于500G");
		}
		else if(storage<500){
			System.out.println("硬盘内存小于500G");
		}
	}
//	public static void main(String[] args) {
//		HardDisk disk=new HardDisk();
//		disk.freth(500, 500);
//	}
}
