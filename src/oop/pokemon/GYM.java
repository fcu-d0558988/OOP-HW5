package oop.pokemon;

public class GYM {
	public static void fight(Pokemon p1,Pokemon p2){
		double p=Math.random();
		if(p>=0){
			System.out.println("Winner is p1:"+p1.getName());
			System.out.println("p1's name="+p1.getName());
			int ccp=p1.getCp();
			ccp+=500;
			System.out.println("p1's cp="+ccp);
		}
		else{
			System.out.println("Winner is p2:"+p2.getName());
			System.out.println("p2's name="+p2.getName());
			int ccp=p2.getCp();
			ccp+=500;
			System.out.println("p2's cp="+ccp);
		}
		
	}

}
