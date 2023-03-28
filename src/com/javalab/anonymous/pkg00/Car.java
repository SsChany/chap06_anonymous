package com.javalab.anonymous.pkg00;

public class Car {
	// 필드 선언 // 필드 선언 (타이어 클래스 타입을 필드로 갖게됨)
	private Tire tire1 = new Tire();

	private Tire tire2 = new Tire() { // 상속관계를 구현중이시랍니다
		@Override
		public void roll() {	// 이런식으로도 자식 객체가 태어납니다 이것이 바로? [익명 자식객체]
			System.out.println("익명 자식 타이어 객체1이 굴러갑니다.");
		}

	}; // ;이 반드시 들어가야 함.

	// 메소드 선언
	public void run1() {
		tire1.roll();
		tire2.roll();	// 자식 오버라이드 된 메소드 호출
	}
	// 메소드 내에서 익명 구현 객체 생성
	public void run2() {
		Tire tire = new Tire() {	// 메소드 안에쓰는거 지역변수 혹은 로컬변수다 
			@Override
			public void roll() {
				System.out.println("익명 자식 객체2가 굴러갑니다.");
			}
		};
		tire.roll();
	}
	// 다형성 구현 (매개변수의 다형성) ㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋㅋ
	public void run3(Tire tire) {
		tire.roll();
	}
}