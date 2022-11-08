package vinay;

import java.util.*;

class Gusser{
	int guessNum;
	int guessNum() {
		Scanner sc=new Scanner(System.in);
		System.out.println("gusser please guess the number by guesser ");
		 guessNum=sc.nextInt();
		 if(guessNum>=0&&guessNum<=10) {
			 System.out.println("the number is in range you can proceed the game further ");
		 }
		 else {
			 System.out.println("the number is not in range so game is exiting ");
			 System.exit(0);
			 
		 }
		return guessNum;
	}
}
class Player{
	int guessNum1;
	int guessNum2;
	int guessNum3;
	int guessNum1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("please guess the number by player 1");
		 guessNum1=sc.nextInt();
		return guessNum1;
	}
	int guessNum2() {
		Scanner sc=new Scanner (System.in);
		System.out.println("please enter the number player 2");
		guessNum2=sc.nextInt();
		return guessNum2;
	}
	int guessNum3() {
		Scanner sc=new Scanner (System.in);
		System.out.println("please enter the number player 3");
		guessNum3=sc.nextInt();
		return guessNum3;
	}
}
class umpire{
	int guessNumGusser;
	int guessPlayer1;
	int guessPlayer2;
	int guessPlayer3;
	void collectFromGusser(){
		Gusser g=new Gusser();
		 guessNumGusser=g.guessNum();
		
	}
	void collectFromPlayer() {
		Player p1=new Player();
		 guessPlayer1=p1.guessNum1();
		Player p2=new Player();
		 guessPlayer2=p2.guessNum2();
		Player p3=new Player();
	 guessPlayer3=p3.guessNum3();
	}
	void compare() {
		if(guessNumGusser==guessPlayer1) {
		if(guessNumGusser==guessPlayer2&&guessNumGusser==guessPlayer3) {
			System.out.println("all p[layers won the match ");
			
		}
		else if(guessNumGusser==guessPlayer2) {
			System.out.println("player 1 and Player 2 won");
		}
		else if(guessNumGusser==guessPlayer3) {
			System.out.println("player 1 and player 3 won");
		}
		else {
			System.out.println("player 1 won ");
		}}
		else if(guessNumGusser==guessPlayer2) {
			if(guessNumGusser==guessPlayer3) {
				System.out.println("player 2 and player 3 won ");
			}
			else {
			System.out.println("player 2 won ");
		}}
		
		else if(guessNumGusser==guessPlayer3) {
			System.out.println("player 3 won ");
			
		}
		else {
			System.out.println("all players lost the game ");
		}
	}
}

public class GusserGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName="vinaypalleda@gmail.com";
		String password="Palleda@4077";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("plesae enter user name ");
		String s=sc.next();
		System.out.println("please enter the password ");
		String s1=sc.next();
		if(s.equalsIgnoreCase(userName)&&s1.equals(password)) {
			System.out.println("user name and password  are  correct please begin the game  ");
			
		}
		else {
			System.out.println("username and passwrod are not correct please try again");
			System.exit(0);
		}
		
		umpire u=new umpire();
		u.collectFromGusser();
		u.collectFromPlayer();
		u.compare();
		
	

}
}
