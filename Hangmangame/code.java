import java.util.*;
import java.util.Random;
 public class Hangman {
public static void main(String[] args) {
	 		Scanner sc=new Scanner(System.in);
	 		
	 	    System.out.println("Welcome to H_A_N_G_M_A_N_G_A_M_E");
	 	    
	 	    System.out.println("Lets play the game");
	 	    
	 	    String a[]={"valimai","enemy","annatha","manadu","batchelor","master","sarkar","bigil","three","hello"};
	 	    
	 	    Random rand =new Random();
	 	    
	 	    int i=rand.nextInt(a.length);
	 	    
	 	    String S=a[i];
	 	    
            int lives=6,ch=0;
	 	    String q="";
	 	   
	 	    for(int k=0;i<S.length();i++) {
	 	    	q+='_';
	 	    	System.out.print("_"+" ");
	 	    }
	 	      
	 	    for(int j=0;j<S.length()||lives<=-1;j++)
	 	    {
	 	      int valid_char=0;
	 	      
	 	      System.out.println("");
	 	      
	 	      System.out.print("Enter Character:");
	 	      
	 	      char p=sc.next().charAt(0);
	 	      
	 	      if(p==S.charAt(ch))
	 	      {
	 	       q=q.substring(0,ch)+p+q.substring(ch+1);
	 	        valid_char++;ch++;
	 	      }
	 	      
	 	      for(int m=0;m<q.length();m++) {
	 	      System.out.print(q.charAt(m)+" ");
	 	      }
	 	     
	 	     
	 		if(valid_char==0){
	 			
	 	        if(lives==6){
	 	        System.out.println();
	 	        System.out.println("Oops it is wrong");
	 	        System.out.println("5 chances left");
	 	        System.out.println(" |----|");
	 	        System.out.println(" |    o");
	 	        System.out.println(" |");
	 	        System.out.println(" |");
	 	        System.out.println(" |");
	 	        System.out.println(" |");
	 	        System.out.println(" |");
	 	        System.out.println(" |");
	 	        }
	 	        
	 	        if(lives==5)
	 	        {
	 	        System.out.println();
	 	        System.out.println("Oops it is wrong");
	 	        System.out.println("4 chances left");
	 	        System.out.println(" |----|");
	 	        System.out.println(" |    o");
	 	        System.out.println(" |    |");
	 	        System.out.println(" |    |");
	 	        System.out.println(" |    ");
	 	        System.out.println(" |");
	 	        System.out.println(" |");
	 	        System.out.println(" |");
	 	        }
	 	        
	 	       if(lives==4)
	 	       {
	 	    	System.out.println();
	 	        System.out.println("Oops it is wrong");
	 	        System.out.println("3 chances left");
	 	        System.out.println(" |----|");
	 	        System.out.println(" |    o");
	 	        System.out.println(" |    |");
	 	        System.out.println(" |   _|");
	 	        System.out.println(" |  - |");
	 	        System.out.println(" |");
	 	        System.out.println(" |");
	 	        System.out.println(" |");
	 	       }
	 	       
	 	      if(lives==3)
	 	      {
	 	    	System.out.println();
	 	        System.out.println("Oops it is wrong");
	 	        System.out.println(" 2 chances left");
	 	        System.out.println(" |----|");
	 	        System.out.println(" |    o");
	 	        System.out.println(" |    |");
	 	        System.out.println(" |    |");
	 	        System.out.println(" |  - | -");
	 	        System.out.println(" |");
	 	        System.out.println(" |");
	 	        System.out.println(" |");
	 	      }
	 	      
	 	     if(lives==2)
	 	     {
	 	    	System.out.println();
	 	        System.out.println("Oops it is wrong");
	 	        System.out.println("1 chance left");
	 	        System.out.println(" |----|");
	 	        System.out.println(" |    o");
	 	        System.out.println(" |    |");
	 	        System.out.println(" |    |");
	 	        System.out.println(" |  - | -");
	 	        System.out.println(" |   _|");
	 	        System.out.println(" |  -  ");
	 	        System.out.println(" |");
	 	    }
	 	     
	 	    lives--;
	 	    }
	 		
	 	    if(S==q)
	 	    
	 	    	 break;
	 	    
	 	    }
	 	    
	 	    if(lives<=0) 
	 	    {
	 	     System.out.println(" ");
	 	     System.out.println("Oops it is wrong");
	         System.out.println("solli mundinchu");
	         System.out.println(" |----|");
	         System.out.println(" |    o");
	         System.out.println(" |    |");
	         System.out.println(" |    |");
	         System.out.println(" |  - | -");
	         System.out.println(" |    |");
	         System.out.println(" |  - | -");
	         System.out.println(" |");
	         }
	 	    
	         else 
	         { 
	        	 System.out.println(" ");
	         	System.out.println("Congrats,You Won the Match");
	         }
	         
	      
}
}
