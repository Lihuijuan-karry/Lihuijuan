package experiment;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CPU cpu=new CPU();
		HardDisk disk=new HardDisk();
		cpu.setSpeed(2200);
		disk.setAmount(200);
		PC pc=new PC();
		pc.setCpu(cpu);
		pc.setHD(disk);
		pc.show();
		cpu.read("dd", 1);
		pc.see(3800.0,6);
		disk.freth(500, 500);
	}

}
