package kr.co.softsoldesk.beans;

public class SoldeskTV implements TV{

	public SoldeskTV() {
		System.out.println("===> SoldeskTV 객체 생성");
	}
	
	@Override
	public void powerOn() {
		System.out.println("SoldeskTV 켜기");
		
	}

	@Override
	public void powerOff() {
		System.out.println("SoldeskTV 끄기");
		
	}

	@Override
	public void volumeUP() {
		System.out.println("SoldeskTV 볼륨 올리기");
		
	}

	@Override
	public void volumeDown() {
		System.out.println("SoldeskTV 볼륨 내리기");
		
	}
	
	
	
}
