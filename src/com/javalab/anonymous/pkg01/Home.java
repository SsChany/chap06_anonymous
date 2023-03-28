package com.javalab.anonymous.pkg01;

public class Home {
	// 필드에 익명 구현 객체 대입
	private RemoteControl rc = new RemoteControl() {	

		@Override
		public void turnOn() {			//익명 구현 객체 생성해서 부모타입에 받음
			System.out.println("TV를 켭니다.");	
		}

		@Override
		public void turnOff() {			//익명 구현 객체 생성해서 부모타입에 받음
			System.out.println("TV를 끕니다.");
		}
	}; // end 익명 구현 객체

	// 메소드 (필드이용)
	public void use1() {
		rc.turnOn();
		rc.turnOff();
	}

	// 메소드 (로컬 변수 이용)
	public void use2() {
		// 로컬 변수에 익명 구현 객체 대입
		RemoteControl rc = new RemoteControl() {	// 인터페이스는 객체생성이 안됨 그냥 이름임

			@Override
			public void turnOn() {
				System.out.println("에어컨을 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("에어컨을 끕니다.");
			}
		};
		rc.turnOn();
		rc.turnOff();
	}

	// 메소드 (매개변수 이용)
	public void use3(RemoteControl rc) {
		rc.turnOn();
		rc.turnOff();
	}
}
