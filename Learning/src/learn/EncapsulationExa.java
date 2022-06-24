package learn;

public class EncapsulationExa implements B,Learn21,Simpleinterface {
	
	int a;
	String name;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	@Override
	public void getB() {
			System.out.println("hi im implementd B");	
	}
	@Override
	public int learn213(int a, int b) {
	 
		System.out.println("hi implemented learn");
		return 20+30;
	}
	@Override
	public void getInterfacedetails() {
		System.out.println("hi implemente simple interfacse");
	}
	public static void main(String[] args) {
		EncapsulationExa en = new EncapsulationExa();
		en.setA(12);
		en.setName("lakshmi");
		System.out.println(en.getA());
		System.out.println(en.getName());
		en.getInterfacedetails();
		en.getB();
		en.getA();
	}
	
	
	@Override
	public void getBankNo() {
		
		System.out.println("a7676ghfgdgd");
	}
	
	
	@Override
	public void getBankAccount() {
		
		System.out.println("a7676ghfgdgd");
		
	}
	@Override
	public void getOk(int x) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void getStatic() {
		// TODO Auto-generated method stub
		
	}

}
