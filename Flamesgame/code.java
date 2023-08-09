import java.util.*;
import java.util.random.*;
public class Anagrams {
static void print(char board[][]) {
	for(int i=0;i<board.length;i++) {

		 for(int j=0;j<board[0].length;j++) {
			     if(j!=2)
					System.out.print(board[i][j]+"|");
			     else
			    	 System.out.print(board[i][j]);
				}
				if(i!=2)
				System.out.print("\n_|_|_\n");
				else
			    System.out.print("\n | | \n");
			}
}
static int game(int pos,char board[][],String user){
	char c='x';
	if(user=="player1")
		c='x';
	else if(user=="player2")
		c='o';
	switch(pos) {
	case 1:
		if(board[0][0]=='x'||board[0][0]=='o') {
			return 0;
		}
		else
		board[0][0]=c;
		break;
	case 2:
		if(board[0][1]=='x'||board[0][1]=='o') {
			return 0;
		}
		else
		board[0][1]=c;
		break;
	case 3:
		if(board[0][2]=='x'||board[0][2]=='o') {
			return 0;
		}
		else
		board[0][2]=c;
		break;
	case 4:
		if(board[1][0]=='x'||board[1][0]=='o') {
			return 0;
		}
		else
		board[1][0]=c;
		break;
	case 5:
		if(board[1][1]=='x'||board[1][1]=='o') {
			return 0;
		}
		else
		board[1][1]=c;
		break;
	case 6:
		if(board[1][2]=='x'||board[1][2]=='o') {
			return 0;
		}
		else
		board[1][2]=c;
		break;
	case 7:
		if(board[2][0]=='x'||board[2][0]=='o') {
			return 0;
		}
		else
		board[2][0]=c;
		break;
	case 8:
		if(board[2][1]=='x'||board[2][1]=='o') {
			return 0;
		}
		else
		board[2][1]=c;
		break;
	case 9:
		if(board[2][2]=='x'||board[2][2]=='o') {
			return 0;
		}
		else
		board[2][2]=c;
		break;
	}
	return 1;

}

public static int winner(char[][] board) {
	int xwinldia=0,owinldia=0,xwinrdia=0,owinrdia=0;
	int xwinc=0,owinc=0;
	int xwinr=0,owinr=0;
	for(int i=0;i<board.length;i++) {
		xwinr=0;
		xwinc=0;
		owinr=0;
		owinc=0;
		for(int j=0;j<board[0].length;j++) {
			if(i==j) {
				if(board[i][j]=='x') {
					xwinldia++;
				}
				else if(board[i][j]=='o') {
					owinldia++;
				}
			}//left diagonal checking probability
		  if(j+1==3+i)
		  {
			  if(board[i][j]=='x') {
					xwinrdia++;
				}
				else if(board[i][j]=='o') {
					owinrdia++;
				}  
		  }//right diagonal checking probability
		  if(board[i][j]=='x') {
			  xwinr++;
		  }
		  else if(board[i][j]=='o') {
			  owinr++;
		}//row wise
		  
		  if(board[j][i]=='x') {
			  xwinc++;
		  }
		  else if(board[j][i]=='o') {
			  owinc++;
		  }
	} 
     if(xwinr==3||xwinc==3) {
    	 return 1;
    	
     }
     else if(owinr==3||owinc==3) {
    	 return 2;
     }
     
		}
	if(xwinldia==3||xwinrdia==3) {
		return 1;
	}
	else if(owinldia==3||owinrdia==3) {
		
		return 2;
	}
	return 0;
}
	
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.print("Welcome to the game,TIC TAC TOE\n_|_|_\n_|_|_\n | | \n");
char board[][]= {{' ',' ',' '},{' ',' ',' '},{' ',' ',' '}};
int pos,opppos,prob,key=0;
while(true){
	key++;
	System.out.print("player1 turn\nEnter your position from 1-9:");
	pos=sc.nextInt();
	game(pos,board,"player1");
	print(board);
	System.out.print("player2 turn\nEnter your position from 1-9:");
	opppos=sc.nextInt();
	game(opppos,board,"player2");
	print(board);
	if(key>2) {
	prob=winner(board);
	if(prob==1) {
		System.out.print("Congrats!,you Won");
		break;
	}
	else if(prob==2) {
		System.out.print("Sorry!,You lost\n Better luck next time");
		break;
	}}
	if(key>4) {
		prob=winner(board);
		if(prob==1) {
			System.out.print("Congrats!,you Won");
			break;
		}
		else if(prob==2) {
			System.out.print("Sorry!,You lost\n Better luck next time");
			break;
		}
		
		else {
			System.out.print("The match is draw");
			break;
		}
	}
	}
}
}

	  
