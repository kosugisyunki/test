package jp.co.internous.action;

public class Test {


	public static void main(String[] args){

		Person ziro=new Person();

		ziro.name="木村次郎";
		ziro.age=18;
		ziro.phoneNumber="012-345-6789";
		ziro.address="abc@de.jp";



		Person hanako=new Person();

		hanako.name="鈴木花子";
		hanako.age=16;
		hanako.phoneNumber="000-0000-0000";
		hanako.address="adadkk@jiji.jp";



		Person kosugi=new Person();

		kosugi.name="小杉駿希";
		kosugi.age=27;
		kosugi.phoneNumber="1212-1212-1212";
		kosugi.address="syunki";




		System.out.print(ziro.name+"、");
		System.out.println(ziro.age);
		ziro.talk();
		ziro.walk();
		ziro.run();


		System.out.print(hanako.name+"、");
		System.out.println(hanako.age);
		hanako.talk();
		hanako.walk();
		hanako.run();


		System.out.print(kosugi.name+"、");
		System.out.println(kosugi.age);
		kosugi.talk();
		kosugi.walk();
		kosugi.run();





	}

}
