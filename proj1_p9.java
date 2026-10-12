
import java.util.Scanner;
import java.util.*; 
import javax.swing.*;

public class proj1_p9 {
    
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_BLACK = "\u001B[30m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";        //color
public static final String ANSI_BLUE = "\u001B[34m";
public static final String ANSI_PURPLE = "\u001B[35m";
public static final String ANSI_CYAN = "\u001B[36m";
public static final String ANSI_WHITE = "\u001B[37m";


public static int goalx(){
    Random rnd=new Random();
    int randx=rnd.nextInt(29);
    return randx;
}
public static int goaly(){
    Random rnd=new Random();
    int randy=rnd.nextInt(49);
    return randy;
}

    public static void main(String[] args) {
        
        Scanner A=new Scanner (System.in);
       
        char [][] ground = new char [30][50];
        int i,j;
        
        
        /*border*/

        for (i=0;i<=29;i++){
            for(j=0;j<=49;j++){
                if((i==0 || i==29)||(j==0 || j==49)){
                    ground[i][j]='#';
                }
                else{
                        ground[i][j]=' ';
                        
                    
                }
            }
        }
        int x=28;
        int y=1;
        ground[x][y]='@';
        
        /*(6*6)*/

        for (i=2;i<=7;i++){
            for(j=1;j<=6;j++){
                 ground[i][j]='#';
            }
        }

        for (i=22;i<=27;i++){
            for(j=1;j<=6;j++){
                 ground[i][j]='#';
            }
        }

        for(i=11;i<=16;i++){
            for(j=42;j<=47;j++){
                 ground[i][j]='#';
            }   
        }

        for(i=23;i<=28;i++){
            for(j=43;j<=48;j++){
                 ground[i][j]='#';
            }   
        }

        /*(1*8)*/
        for(i=1;i<=9;i++){
          for(j=9;j<=9;j++){
               ground[i][j]='#';
          }   
        }

        for(i=20;i<=29;i++){
          for(j=9;j<=9;j++){
               ground[i][j]='#';
          }   
        }

        for(i=21;i<=21;i++){
          for(j=41;j<=49;j++){
               ground[i][j]='#';
          }   
        }

        for(i=7;i<=7;i++){
          for(j=41;j<=49;j++){
               ground[i][j]='#';
          }   
        }

        for(i=12;i<=12;i++){
          for(j=20;j<=28;j++){
               ground[i][j]='#';
          }   
        }
        /*(6*10)*/

        for(i=11;i<=15;i++){
          for(j=2;j<=12;j++){
               ground[i][j]='#';
          }   
        }

        for(i=1;i<=5;i++){
          for(j=32;j<=41;j++){
               ground[i][j]='#';
          }   
        }
       /*(3*3)*/
       for(i=11;i<=13;i++){
          for(j=15;j<=17;j++){
               ground[i][j]='#';
          }   
        }

        for(i=26;i<=29;i++){
          for(j=15;j<=17;j++){
               ground[i][j]='#';
          }   
        }

        for(i=26;i<=29;i++){
          for(j=20;j<=22;j++){
               ground[i][j]='#';
          }   
        }

        for(i=26;i<=29;i++){
          for(j=30;j<=32;j++){
               ground[i][j]='#';
          }   
        }

        for(i=26;i<=29;i++){
          for(j=33;j<=35;j++){
               ground[i][j]='#';
          }   
        }

        for(i=22;i<=24;i++){
          for(j=30;j<=32;j++){
               ground[i][j]='#';
          }   
        }
        for(i=15;i<=17;i++){
          for(j=30;j<=32;j++){
               ground[i][j]='#';
          }   
        }

        for(i=15;i<=17;i++){
          for(j=16;j<=18;j++){
               ground[i][j]='#';
          }   
        }

        for(i=20;i<=22;i++){
          for(j=16;j<=18;j++){
               ground[i][j]='#';
          }   
        }

        for(i=1;i<=3;i++){
          for(j=11;j<=13;j++){
               ground[i][j]='#';
          }   
        }

        for(i=5;i<=7;i++){
          for(j=11;j<=13;j++){
               ground[i][j]='#';
          }   
        }
        
        for(i=3;i<=5;i++){
          for(j=47;j<=49;j++){
               ground[i][j]='#';
          }   
        }

        /*(2*2)*/

        for(i=22;i<=23;i++){
          for(j=11;j<=12;j++){
               ground[i][j]='#';
          }   
        }

        for(i=12;i<=14;i++){
          for(j=22;j<=23;j++){
               ground[i][j]='#';
          }   
        }
        
        for(i=3;i<=4;i++){
          for(j=43;j<=44;j++){
               ground[i][j]='#';
          }   
        }
        
        /*(1*1)*/
        ground[3][45]='#';
        ground[3][46]='#';
        ground[12][13]='#';
        ground[12][14]='#';
        ground[10][9]='#';
        
        /*(1*5)*/
        for(i=16;i<=20;i++){
          for(j=3;j<=3;j++){
               ground[i][j]='#';
          }   
        }
        

        /*(9*9)*/
        for(i=2;i<=10;i++){
          for(j=20;j<=28;j++){
               ground[i][j]='#';
          }   
        }

        for(i=15;i<=24;i++){
          for(j=20;j<=28;j++){
               ground[i][j]='#';
          }   
        }

        /*(4*4)*/
        for(i=8;i<=10;i++){
            for(j=36;j<=39;j++){
                ground[i][j]='#';
            }
        }

        for(i=13;i<=16;i++){
            for(j=36;j<=39;j++){
                ground[i][j]='#';
            }
        }

        for(i=18;i<=21;i++){
            for(j=36;j<=39;j++){
                ground[i][j]='#';
            }
        }
        
         
        /*goal rand*/
        
        int randx=0;
        int randy=0;
        while(true){
            randx=goalx();
            randy=goaly();
            System.out.println(randx);
            System.out.println(randy);
            if(ground[randx][randy]!='#'){
                break;
            }
        }
        
        ground[randx][randy]='*';
        
        


        int life=3;
        int goal=0;
        
         /*run maze*/   
       
        for (i=0;i<=29;i++){
            for(j=0;j<=49;j++){
                if((char)ground[i][j]=='@'){
                    System.out.print(ANSI_BLUE);
                    System.out.print(ground[i][j]);
                    System.out.print(ANSI_BLACK);  
                }
                else if((char)ground[i][j]=='*'){
                    System.out.print(ANSI_RED);
                    System.out.print(ground[i][j]);
                    System.out.print(ANSI_BLACK);  
                }
                else{
                    System.out.print(ground[i][j]);
                }
            }
            System.out.println();
        }
        
        /*Runtime Stsrt Time*/
        long startTime = System.currentTimeMillis();
        
        while((life>=1) && (goal!=1) ){ 
            System.out.println("Please enter the direction(A,R,L,W):");
            String way=A.next(); 
            /*main switch*/
            switch(way){
                case "A":
                     /*moving conditions*/
                    if((char)ground[x-1][y]=='#'){
                        life=life-1;
                        System.out.println(ground[x-1][y]);
                        System.out.println("you can't move in this way");
                    }
                    else if((char)ground[x-1][y]=='*'){
                        
                        /**/
                        ground[x-1][y]=ground[x][y];
                        ground[x][y]=' ';
                        System.out.println(ground[x][y]);
                        x=x-1;
                        
                        System.out.println("you reached the goal");
                        goal=1;
                    }
                    else{
                        ground[x-1][y]=ground[x][y];
                        ground[x][y]=' ';
                        System.out.println(ground[x][y]);
                        x=x-1;
                    }
                    
                    /*maze*/
                    
                    for(i=0;i<=29;i++){
                        for(j=0;j<=49;j++){
                            if(((i>=x-4)&&(i<=x+4)) && ((j>=y-4) && (j<=y+4))){

                                System.out.print(ground[i][j]);

                            }
                             else{
                            System.out.print("?");
                            }
                        }
                        System.out.println();
                    }
                
    
                    
                    
                    break; 
                case "R":
                    /*moving conditions*/
                    if((char)ground[x][y+1]=='#'){
                        life=life-1;
                        System.out.println("you can't move in this way");
                    }
                    else if((char)ground[x][y+1]=='*'){
                        
                        /**/
                        ground[x][y+1]=ground[x][y];
                        ground[x][y]=' ';
                        System.out.println(ground[x][y]);
                        y=y+1;
                        
                        System.out.println("you reached the goal");
                        goal=1;
                    }
                    else{
                        ground[x][y+1]=ground[x][y];
                        ground[x][y]=' ';
                        System.out.println(ground[x][y]);
                        y=y+1;
                        
                        
                    }
                    
                    /*maze*/
                    
                    for(i=0;i<=29;i++){
                        for(j=0;j<=49;j++){
                            if(((i>=x-4)&&(i<=x+4)) && ((j>=y-4) && (j<=y+4))){

                                System.out.print(ground[i][j]);

                            }
                             else{
                            System.out.print("?");
                            }
                        }
                        System.out.println();
                    }
                    
                    break;
                case "L":
                     /*moving conditions*/
                    if((char)ground[x][y-1]=='#'){
                        life=life-1;
                        System.out.println("you can't move in this way");
                    }
                    else if((char)ground[x][y-1]=='*'){
                        /**/
                        ground[x][y-1]=ground[x][y];
                        ground[x][y]=' ';
                        System.out.println(ground[x][y]);
                        y=y-1;
                        
                        System.out.println("you reached the goal");
                        goal=1;
                    }
                    else{
                        ground[x][y-1]=ground[x][y];
                        ground[x][y]=' ';
                        System.out.println(ground[x][y]);
                        y=y-1;
                    }
                    
                    /*maze*/
                    
                    for(i=0;i<=29;i++){
                        for(j=0;j<=49;j++){
                            if(((i>=x-4)&&(i<=x+4)) && ((j>=y-4) && (j<=y+4))){

                                System.out.print(ground[i][j]);

                            }
                             else{
                            System.out.print("?");
                            }
                        }
                        System.out.println();
                    }
                    
                    break;
                case "D":
                     /*moving conditions*/
                    if((char)ground[x+1][y]=='#'){
                        life=life-1;
                        System.out.println("you can't move in this way");
                    }
                    else if((char)ground[x+1][y]=='*'){
                        
                        /**/
                        ground[x+1][y]=ground[x][y];
                        ground[x][y]=' ';
                        System.out.println(ground[x][y]);
                        x=x+1;
                        
                        System.out.println("you reached the goal");
                        goal=1;
                    }
                    else{
                        ground[x+1][y]=ground[x][y];
                        ground[x][y]=' ';
                        System.out.println(ground[x][y]);
                        x=x+1;
                    }
                    
                    /*maze*/
                    
                    for(i=0;i<=29;i++){
                        for(j=0;j<=49;j++){
                            if(((i>=x-4)&&(i<=x+4)) && ((j>=y-4) && (j<=y+4))){

                                System.out.print(ground[i][j]);

                            }
                             else{
                            System.out.print("?");
                            }
                        }
                        System.out.println();
                    }
                    
                    break;
                default:
                    System.out.println("Please enter a valid input");
                    break; 
            }
        }
        
        /*Runtime End Time*/
        long endTime = System.currentTimeMillis();
        
        /*winning*/
        
        System.out.println("you wone");
        System.out.print("LIFE:");
        System.out.print(life);
        System.out.println();
        long programTime = endTime - startTime;
        System.out.println('\n' + "Time: " + programTime/1000);
        
                 
                 
        




       



        /*run maze*/   
       
//        for (i=0;i<=29;i++){
//            for(j=0;j<=49;j++){
//                if((char)ground[i][j]=='@'){
//                    System.out.print(ANSI_BLUE);
//                    System.out.print(ground[i][j]);
//                    System.out.print(ANSI_BLACK);  
//                }
//                else if((char)ground[i][j]=='*'){
//                    System.out.print(ANSI_RED);
//                    System.out.print(ground[i][j]);
//                    System.out.print(ANSI_BLACK);  
//                }
//                else{
//                    System.out.print(ground[i][j]);
//                }
//            }
//            System.out.println();
//        }
        
//        System.out.println();
        
//        for(i=0;i<=29;i++){
//            for(j=0;j<=49;j++){
//                if(((i>=x-4)&&(i<=x+4)) && ((j>=y-4) && (j<=y+4))){
//                   
//                            System.out.print(ground[i][j]);
//                       
//                }
//                else{
//                    System.out.print("?");
//                }
//            }
//            System.out.println();
//        }
        
    }
    
}
