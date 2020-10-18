# 计G201 李慧娟 2020322067  
###  java第一次实验项目（10月12日）
##  阅读程序
- 用类描述计算机中CPU的速度和硬盘的容量  
- 应用程序中有4个类：PC、CPU、HardDisk和Test，其中Test是主类
- 附加要求的实现（类中属性多样化、访问权限、方法逻辑判断）  
##  实验目的
1. 掌握如何创建并实例化对象
2. 认识无参与有参构造方法
3. 明白权限修饰符的作用
##  实验过程
###  PC类
+ 定义了cpu，HD，price，ranking四个属性，且设置cpu的权限修饰为private
+ 定义了PC的无参与有参构造方法
+ 设置set、get方法来设置值与取值，定义show方法输出CPU速度与硬盘容量
+ 定义see方法来进行price与ranking两个属性的逻辑判断
###  CPU类
* 定义了speed，brand，threading三个属性
* 定义了CPU的无参与有参构造方法
* 设置set、get方法来设置值与取值
* 定义read方法来进行brand与threading两个属性的逻辑判断
###  HardDisk类
- 定义了amount，storage，price三个属性
- 定义了HardDisk的无参与有参构造方法
- 设置set、get方法来设置值与取值
- 定义freth方法来进行storage与price两个属性的逻辑判断
###  Test类（主类）
+ 创建并实例化CPU，HardDisk，PC三个对象
+ 用cpu对象调用setSpeed方法给speed属性设置值，disk对象调用setAmount方法给amount属性设置值，pc对象调用setCpu、setHD、show方法
+ 用cpu对象调用read方法、pc对象调用see方法、disk调用freth方法来进行实参的逻辑判断
##  核心方法
1. 无参与有参构造方法
```       
	CPU(){
		
	}
	CPU(int speed,String brand,int threading){
		this.speed=speed;
		this.brand=brand;
		this.threading=threading;
	}
```
2. set与get方法
```
	public void setStorage(int storage){
		this.storage = storage;
	}  
	public int getStorage(){
		return storage;
	}
```
3. CPU类中的read方法，PC类中的see方法，HardDisk类中的freth方法（逻辑判断，举一例）
```
	public void freth(int storage,float price) {
		if(storage>=500) {
			System.out.println("硬盘内存大于500G");
		}
		else if(storage<500){
			System.out.println("硬盘内存小于500G");
		}
	}
```
##  实验结果
1. 输出CPU的速度与硬盘的容量
2. 判断并输出CPU处理器品牌与线程数
3. 判断并输出PC价钱与排名
4. 判断并输出硬盘内存大小  
![alt 实验输出的语句](http://m.qpic.cn/psc?/V51PA3o90d17IF0JFyFi0lN3aB2Fw6re/bqQfVz5yrrGYSXMvKr.cqUanBrm7rtNYCftR00..QcyMrlA5uVLdFDd8y2hLizAiXVDiBv4SgBKXnx*ZUOAnLToTt*NqPr4Z1jjM4400xbI!/a&rf=albumlist&t=5)
##  实验感想
1. 认识无参与有参构造方法
2. 了解了通过设置权限修饰符来阻止对象直接访问自己的变量，而用指定的方法来访问并赋值。

