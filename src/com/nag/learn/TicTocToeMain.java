package com.nag.learn;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicTocToeMain {

	public static boolean gameFlag=true;
	public static void main(String[] args) throws IOException {

		System.out.println("You are Playing Tic Toc Toe Game !!");
		System.out.println("This game is two player mode !!");
		System.out.println("Please enter the co ordinate values for every position !!");
		System.out.println("");
		System.out.println("");
		printGame(new int[3][3]);
		
		BufferedReader br = null;
		int player1_X[][] = new int[3][3];
		br = new BufferedReader(new InputStreamReader(System.in));
		String x;
		String y;
		int counter_1=0;
		int counter_2=0;
		do{
			boolean coPlayers = false;
			player1: do{
				System.out.println("Enter X position for player 1");
				x =  br.readLine();
				System.out.println("Enter Y Position for player 1");
				y = br.readLine();
				coPlayers = compareCoPlayers(player1_X,Integer.parseInt(x),Integer.parseInt(y));
			 	if(coPlayers){
		  			System.out.println("please enter different values");
		  			continue player1;
		  		}else{
		  			player1_X[Integer.parseInt(x)][Integer.parseInt(y)] = 1;
		  			break player1;
		  		}
			 }while(coPlayers);
				++counter_1;
				if(counter_1>2){
					gameResult(counter_1, player1_X);
				}
			 printGame(player1_X);
			 coPlayers = false;
			 player2: do{
				 System.out.println("Enter X position for player 2");
			 	 x =  br.readLine();
			 	 System.out.println("Enter Y Position for player 2");
			 	 y = br.readLine();
			 	 
			 	coPlayers = compareCoPlayers(player1_X,Integer.parseInt(x),Integer.parseInt(y));
			 	if(coPlayers){
		  			System.out.println("please enter different values");
		  			continue player2;
		  		}else{
		  			player1_X[Integer.parseInt(x)][Integer.parseInt(y)] = 2;
		  			break player2;
		  		}
			 }while(coPlayers);
			 ++counter_2;
			 printGame(player1_X);
			 
			 if(counter_2 >2){
				 gameResult(counter_1, player1_X);
			 }
		}while(counter_1 <= 8);
			
	}
	
	public static boolean compareCoPlayers(int player1_X[][],int x,int y){
		boolean flag = false;
		for(int i=0; i<=2;i++){
			if(player1_X[x][y] == 1){
				flag = true;
			}else{
				flag = false;
			}
		}
		return flag;
	}
	public static boolean compareCoPlayers_1(int player1_X[][],int x,int y){
		boolean flag = false;
		for(int i=0; i<=2;i++){
			if(player1_X[x][y] == 2){
				flag = true;
			}else{
				flag = false;
			}
		}
		return flag;
	}
	
	public static void printGame(int x[][]){
		
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x.length;j++){
				if(x[i][j]==1){	
					System.out.print(x[i][j]);
					System.out.print("   ");
				}else if(x[i][j]==2){
					System.out.print(x[i][j]);
					System.out.print("   ");
				}else{
					System.out.print("O");
					System.out.print("   ");
				}
				
			}
			System.out.println("");
		}
	}
	
	public static String gameResultRows(int player1_X[][]){
		System.out.println("gameresult");
		int counter_1 = 0;
		int counter_2 = 0;
		String message ="";
		for(int i=0; i<player1_X.length;i++){
			for(int j=0;j<player1_X.length;j++){
				if(player1_X[i][j]== 1){
					++counter_1;
					continue;
				}else if(player1_X[i][j]== 2){
					++counter_2;
					continue;
				}
			}
			if(counter_1 == 3 ){
				return "1";
			}else if(counter_2 == 3 ){
				return "2";
			}else{
				counter_1 = 0;
				counter_2 = 0;
			}
		}
		return message;
	}
	public static String gameResultColumns(int player1_X[][]){
		System.out.println("gameresult");
		int counter_1 = 0;
		int counter_2 = 0;
		String message ="";
		for(int i=0; i<player1_X.length;i++){
			for(int j=0;j<player1_X.length;j++){
				if(player1_X[j][i]== 1){
					++counter_1;
					continue;
				}else if(player1_X[j][i]== 2){
					++counter_2;
					continue;
				}
			}
			if(counter_1 == 3){
				return "1";
			}else if(counter_2 == 3){
				return "2";
			}else{
				counter_1 = 0;
				counter_2 = 0;
			}
		}
		return message;
	}
	
	public static String gameResultCross(int player1_X[][]){
		System.out.println("gameresult");
		int counter_1 = 0;
		int counter_2 = 0;
		String message ="";
		for(int i=0; i<player1_X.length;i++){
			for(int j=0;j<player1_X.length;j++){
				 if(i==j && player1_X[i][j]==1){
					++counter_1;
					continue;
				}else if(i==j && player1_X[i][j]==2){
					++counter_2;
					continue;
				}
			}
		}
			if(counter_1 == 3){
				return "1";
			}else if(counter_2 == 3){
				return "2";
			}else{
				counter_1 = 0;
				counter_2 = 0;
			}
		return message;
	}
	
	public static String gameResultCrossOpp(int player1_X[][]){
		System.out.println("gameresult");
		int counter_1 = 0;
		int counter_2 = 0;
		String message ="";
		int j=player1_X.length;
		for(int i=0; i<player1_X.length;i++){
			j--;
			if(player1_X[i][j]==1){
				++counter_1;
				continue;
			}else if(player1_X[i][j]==2){
				++counter_2;
				continue;
			}
		}
			if(counter_1 == 3){
				return "1";
			}else if(counter_2 == 3){
				return "2";
			}else{
				counter_1 = 0;
				counter_2 = 0;
			}
		return message;
	}
	
	public static void gameResult(int counter, int player1_X[][]){
		
		 String result = gameResultRows(player1_X);
		 if("".equals(result)){
			 result = gameResultColumns(player1_X);
			 if("".equals(result)){
				 result = gameResultCross(player1_X);
				 if("".equalsIgnoreCase(result)){
					 result = gameResultCrossOpp(player1_X);
					 if("".equals(result)){
						 System.out.println("counter_1 ::"+counter);
						 if(counter < 5){
						
						 }else{
							 System.out.println("Match Drawn!!");
							 System.exit(0);
						 }
					 }else{
						 System.out.println("Player "+ result +" is winner !!");
						 System.exit(0);
					 }
				 }else{
					 System.out.println("Player "+ result +" is winner !!");
					 System.exit(0);
				 }
			 }else{
				 System.out.println("Player "+ result +" is winner !!");
				 System.exit(0);
			 }
		 }else {
			 System.out.println("Player "+ result +" is winner !!");
			 System.exit(0);
		 }
	}

}
