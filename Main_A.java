import java.util.Random;
import java.util.Scanner;

class Question {
    String quiz;
    String answer;
    int score;
    String[] choice;

    Question(String group, int i) {
        if (group.equals("animal")) {
            if (i == 1) {
                score = 1;
                quiz = "งูชนิดใด มีพิษร้ายแรงมากสุด";
                answer = "งูทะเล";
                choice = new String[]{"งูทะเล", "งูทะเลทราย", "งูเห่า", "งูทางมะพร้าว"};
            } else if (i == 2) {
                score = 1;
                quiz = "สัตว์ตัวใด คือสัตว์เลี้ยงบ้าน";
                answer = "สุนัข";
                choice = new String[]{"แมวน้ำ", "สุนัข", "หมาป่า", "ช้าง"};
            } else if (i == 3) {
                score = 3;
                quiz = "แมลงวัน มีอายุไขตั้งแต่ไข่จนเต็มวัย กี่วัน";
                answer = "10 วัน";
                choice = new String[]{"1 วัน", "5 วัน", "7 วัน", "10 วัน"};
            } else if (i == 4) {
                score = 2;
                quiz = "วัว มีตัวสีอะไร";
                answer = "ขาว ดำ";
                choice = new String[]{"เขียว แดง", "ขาว เหลือง", "ขาว ดำ", "ดำ ส้ม"};
            } else if (i == 5) {
                score = 2;
                quiz = "สัตว์ชนิดใดสายตาดี มองหาเหยื่อจากที่สูงได้";
                answer = "นก";
                choice = new String[]{"สุนัข", "งู", "มด", "นก"};
            } else if (i == 6) {
                score = 1;
                quiz = "สัตว์ชนิดใดคือสัตว์ปีก";
                answer = "ไก่";
                choice = new String[]{"หนู", "งู", "กระต่าย", "ไก่"};
            } else if (i == 7) {
                score = 3;
                quiz = "ยีราฟ มีกระดูกคอกี่ชิ้น";
                answer = "7 ชิ้น";
                choice = new String[]{"6 ชิ้น", "7 ชิ้น", "14 ชิ้น", "17 ชิ้น"};
            }
        } else if (group.equals("food")) {
            // เพิ่มคำถามและตัวเลือกในกลุ่มอาหาร
        } else if (group.equals("history")) {
            // เพิ่มคำถามและตัวเลือกในกลุ่มประวัติศาสตร์
        }
    }
}



public class Main_A
{
  public static final int SIZE = 8 ;
  public static int front = -1;
  public static int rear = -1;
  public static int count = 6 ;
  public static Random random = new Random();
  public static int playerAnswer = 0;
  
  public static String[] name = new String[SIZE] ;
  public static String[] avatar = new String[SIZE] ;
  
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    int menu = 0 ;
    int press ;
    String button = "";
    int select = 0 ;
  
    String mode = "Kiddo" ;
    String group = "Animal" ;
    int round = 10 ;
  
    int GAME = 1 ;
  
    while(GAME != 0)
    {
        clearScreen();
        if(menu==0)
        {
          press = 99 ;
          while(true)
          {
            clearScreen();
            System.out.printf("       ⢀⡀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀\n");
            System.out.printf("       ⢻⣿⡗⢶⣤⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣠⣄   \n");
            System.out.printf("       ⠀⢻⣇⠀⠈⠙⠳⣦⣀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣀⣤⠶⠛⠋⣹⣿⡿  \n");
            System.out.printf("       ⠀⠀⠹⣆⠀⠀⠀⠀⠙⢷⣄⣀⣀⣀⣤⣤⣤⣄⣀⣴⠞⠋⠉⠀⠀⠀⢀⣿⡟⠁  \n");
            System.out.printf("       ⠀⠀⠀⠙⢷⡀⠀⠀⠀⠀⠉⠉⠉⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⣠⡾⠋⠀⠀   \n");
            System.out.printf("       ⠀⠀⠀⠀⠈⠻⡶⠂⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢠⣠⡾⠋⠀⠀⠀⠀   \n");
            System.out.printf("       ⠀⠀⠀⠀⠀⣼⠃⠀⢠⠒⣆⠀⠀⠀⠀⠀⠀⢠⢲⣄⠀⠀⠀⢻⣆⠀⠀⠀⠀⠀   \n");
            System.out.printf("       ⠀⠀⠀⠀⢰⡏⠀⠀⠈⠛⠋⠀⢀⣀⡀⠀⠀⠘⠛⠃⠀⠀⠀⠈⣿⡀⠀⠀⠀⠀  \n");
            System.out.printf("       ⠀⠀⠀⠀⣾⡟⠛⢳⠀⠀⠀⠀⠀⣉⣀⠀⠀⠀⠀⣰⢛⠙⣶⠀⢹⣇⠀⠀⠀⠀  \n");
            System.out.printf("       ⠀⠀⠀⠀⢿⡗⠛⠋⠀⠀⠀⠀⣾⠋⠀⢱⠀⠀⠀⠘⠲⠗⠋⠀⠈⣿⠀⠀⠀⠀  \n");
            System.out.printf("       ⠀⠀⠀⠀⠘⢷⡀⠀⠀⠀⠀⠀⠈⠓⠒⠋⠀⠀⠀⠀⠀⠀⠀⠀⠀⢻⡇⠀⠀⠀   \n");
            System.out.printf("       ⠀⠀⠀⠀⠀⠈⡇⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⢸⣧⠀⠀⠀    \n");
            System.out.printf(" -+--------------------------------------------+- \n");
            System.out.printf("          Super Very Hardest Question !! \n");
            System.out.printf(" -+--------------------------------------------+- \n");
            System.out.printf("      ( 1 )  Start \n");
            System.out.printf("      ( 2 )  Rules \n");
            System.out.printf("      ( 3 )  Exit..\n");
            System.out.printf(" -+--------------------------------------------+- \n");
            System.out.printf(" Enter any key to continue ... ");
            button = input.next();
            if(button.equals("1")) 
            {
              menu=1;
              break;
            }
          }
        }
        else if(menu==1)
        {
          press = 99 ;
          while(true)
          {
            clearScreen();
            System.out.printf(" -+--------------------------------------------+- \n");
            System.out.printf("                Rule Setting  \n");
            System.out.printf(" -+--------------------------------------------+- \n");
            System.out.printf("    \n"); 
            System.out.printf("             Mode  <= (1) =>  [%s] \n",mode);
            System.out.printf("            Group  <= (2) =>  [%s] \n",group);
            System.out.printf("            Round  <= (3) =>  [%d]   \n",round);
            System.out.printf("  [a] back                             [d] next\n"); 
            System.out.printf(" -+--------------------------------------------+- \n");
            System.out.printf("        Rule : Choose your room setting !!\n");
            System.out.printf(" -+--------------------------------------------+- \n");
            System.out.printf(" Enter any key to continue ... ");
            button = input.next();
            if(button.equals("1")) {
              menu=2;
              break;
            }
            else if(button.equals("a")) {
              menu=0;
              break;
            }
            else if(button.equals("d")) {
              menu=3;
              break;
            }
            else if (button.equals("2")) {
            menu = 5;
            break;
            }
            else continue ;
          }
        }
        else if(menu==2)
        {
          press = 99 ;
          while(true)
          {
            clearScreen();
            if (select == 0)
            {
              mode = "Kiddo" ;
              System.out.printf(" -+--------------------------------------------+- \n");
              System.out.printf("             Mode: K I D D O \n");
              System.out.printf(" -+--------------------------------------------+- \n");
              System.out.printf("        ⠀⠀⠀⠀⠀⠀⠀    ⠀⠀\n");
              System.out.printf("              ㅤ  ∧＿∧     banana  ⠀⠀⠀⠀⠀⠀⠀    ⠀⠀\n");
              System.out.printf("                (　･∀･)      nanaba!⠀⠀⠀⠀⠀⠀    ⠀⠀\n");
              System.out.printf("              　(　つ┳⊃       nabana!!⠀⠀⠀⠀⠀    ⠀⠀\n");
              System.out.printf("              ε(_)へ⌒ヽﾌ        ⠀⠀⠀⠀⠀⠀⠀    ⠀⠀\n");
              System.out.printf("               (　　(　･ω･)        ⠀⠀⠀⠀⠀⠀⠀    ⠀⠀\n");
              System.out.printf("               ◎―◎   ⊃  ⊃        ⠀⠀⠀⠀⠀⠀⠀    ⠀⠀\n");
              System.out.printf("   [a] back⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀          [d] next⠀    \n");
              System.out.printf(" -+--------------------------------------------+- \n");
              System.out.printf("    You have 3 Heart | 1 Question per round\n");
              System.out.printf(" -+--------------------------------------------+- \n");
            }
            else if (select == 1)
            {
              mode = "Bigboy" ;
              System.out.printf(" -+--------------------------------------------+- \n");
              System.out.printf("             Mode: B I G B O Y \n");
              System.out.printf(" -+--------------------------------------------+- \n");
              System.out.printf("        ⠀⠀⠀⠀⠀⠀⠀    ⠀⠀\n");
              System.out.printf("        ⠀  ⠀   (\\__/)                          \n");
              System.out.printf("               (•ㅅ•)      Don’t talk to\n");
              System.out.printf("          ＿＿ノヽ ノ＼＿      me or my son\n");
              System.out.printf("         /　`/ ⌒ Ｙ⌒ Ｙ  ヽ     ever again.\n");
              System.out.printf("        ( 　(三ヽ人　 / 　|  \n");
              System.out.printf("        |　ﾉ⌒＼ ￣￣ヽ   ノ   \n");
              System.out.printf("        ヽ＿＿＿＞､＿ _／⠀⠀⠀⠀  \n");
              System.out.printf("             ｜( 王 ﾉ〈   (\\__/)⠀⠀⠀  \n");
              System.out.printf("             /ﾐ`ー―彡  \\  (•ㅅ•)⠀⠀⠀⠀  \n");
              System.out.printf("            / ╰    ╯    \\ /    \\>⠀⠀⠀   \n");
              System.out.printf("   [a] back⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀          [d] next⠀    \n");
              System.out.printf(" -+--------------------------------------------+- \n");
              System.out.printf("    You have 2 Heart | 1 Question per round\n");
              System.out.printf(" -+--------------------------------------------+- \n");
            }
            else if (select == 2)
            {
              mode = "God" ;
              System.out.printf(" -+--------------------------------------------+- \n");
              System.out.printf("             Mode: G O D  \n");
              System.out.printf(" -+--------------------------------------------+- \n");
              System.out.printf("      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀\n");
              System.out.printf("      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ la la la !   ⠀⠀\n");
              System.out.printf("•.,¸,.•*`•.,¸¸,.•*``╭━━━━━━━━━━━━━╮        \n");
              System.out.printf("•.,¸,.•*¯`•.,¸,.•*¯ |::::::::/\\___/\\    ⠀⠀⠀  \n");
              System.out.printf("•.,¸,.•*¯`•.,¸,.• ᓚ|::::::::(// owo/)⠀⠀   \n");
              System.out.printf("•.,¸,.•¯`•.,¸,.•*¯•.,し-----し-----Ｊ⠀⠀    \n");
              System.out.printf("       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀\n");
              System.out.printf("      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀\n");
              System.out.printf("   [a] back⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀          [d] next⠀    \n");
              System.out.printf(" -+--------------------------------------------+- \n");
              System.out.printf("    You have 1 Heart | 2 Question per round\n");
              System.out.printf(" -+--------------------------------------------+- \n");
            }
            System.out.printf(" Enter any key to continue ... ");
            button = input.next();
            if(button.equals("a")) 
            {
              select -= 1 ;
              if(select<0) select=2 ;
            }
            else if(button.equals("d")) 
            {
              select += 1 ;
              if(select>2) select=0 ;
            }
            else if(button.equals("s"))
            {
              menu=1;
              break;
            }
          }
        }
        else if(menu==3)
        {
          while(true)
          {
            clearScreen();
            System.out.printf(" -+--------------------------------------------+- \n");
            System.out.printf("                Player Setting \n");
            System.out.printf(" -+--------------------------------------------+- \n");
            System.out.printf("        ⠀⠀⠀⠀⠀⠀⠀    ⠀⠀\n");
            System.out.printf("           [ Name ]         [ Avatar ] \n");
            for(int i=0;i<rear+1;i++){
              System.out.printf("        (%d) %-15s - %s - \n",i+1,name[i],avatar[i]);
            }
            if(rear+1<count){
              System.out.printf("        [x] - add player -\n");
            }
            System.out.printf("        ⠀⠀⠀⠀⠀⠀⠀    ⠀⠀\n");
            System.out.printf("  [a] back                            [d] next\n");
            System.out.printf(" -+--------------------------------------------+- \n");
            System.out.printf("          Rule : Maximum 6 players\n");
            System.out.printf(" -+--------------------------------------------+- \n");
            System.out.printf(" Enter any key to continue ... ");
            button = input.next();
            // Menu ตั้งชื่อและเลือกตัวละคร // 
            if(button.equals("x")) 
            {
              if ((front == 0 && rear == count - 1) || (rear == (front - 1) % (count - 1))) 
              {
                System.out.printf("\n Player Queue is Full!! ");
                pressEnterToContinue();
              }
              else
              {
                System.out.printf("\n Enter Player#%d's name : ",rear+2);
                String str = input.next();
                String str2 = Select_Charecter(rear+2);
                enQueue(str,str2);
              }
            }
            else if (button.equals("d")) {
              menu = 4;
              break;
            }
          }
        }
        else if(menu==4)
        {
          while(true)
          {
            display();
            
            System.out.printf("\n Enter any key to continue ... ");
            button = input.next();
            if (button.equals("f")) 
            {
              String groupSelected = mode.toLowerCase();
              int questionNumber = Main.random.nextInt(3) + 1; // สุ่มคำถามจาก 1 ถึง 3 (ให้แก้ตามจำนวนคำถามในแต่ละกลุ่ม)
              
              // เรียกใช้เมทอด askQuestion โดยส่งกลุ่มและหมายเลขคำถามที่สุ่มได้
              askQuestion(groupSelected, questionNumber);
            }
          }
        }
        else if(menu==5)
        {
          press = 99;
          while (true) {
            clearScreen();
            if (select == 0)
            {
              mode = "Animal" ;
              System.out.printf(" -+--------------------------------------------+- \n");
              System.out.printf("             Mode: A N I M A L \n");
              System.out.printf(" -+--------------------------------------------+- \n");
              System.out.printf("        ⠀⠀⠀⠀⠀⠀⠀    ⠀⠀\n");
              System.out.printf("              ㅤ  ∧＿∧     banana  ⠀⠀⠀⠀⠀⠀⠀    ⠀⠀\n");
              System.out.printf("                (　･∀･)      nanaba!⠀⠀⠀⠀⠀⠀    ⠀⠀\n");
              System.out.printf("              　(　つ┳⊃       nabana!!⠀⠀⠀⠀⠀    ⠀⠀\n");
              System.out.printf("              ε(_)へ⌒ヽﾌ        ⠀⠀⠀⠀⠀⠀⠀    ⠀⠀\n");
              System.out.printf("               (　　(　･ω･)        ⠀⠀⠀⠀⠀⠀⠀    ⠀⠀\n");
              System.out.printf("               ◎―◎   ⊃  ⊃        ⠀⠀⠀⠀⠀⠀⠀    ⠀⠀\n");
              System.out.printf("   [a] back⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀          [d] next⠀    \n");
              System.out.printf(" -+--------------------------------------------+- \n");
              System.out.printf("    You have 3 Heart | 1 Question per round\n");
              System.out.printf(" -+--------------------------------------------+- \n");
            }
            else if (select == 1)
            {
              mode = "Food" ;
              System.out.printf(" -+--------------------------------------------+- \n");
              System.out.printf("             Mode: F O O D \n");
              System.out.printf(" -+--------------------------------------------+- \n");
              System.out.printf("        ⠀⠀⠀⠀⠀⠀⠀    ⠀⠀\n");
              System.out.printf("        ⠀  ⠀   (\\__/)                          \n");
              System.out.printf("               (•ㅅ•)      Don’t talk to\n");
              System.out.printf("          ＿＿ノヽ ノ＼＿      me or my son\n");
              System.out.printf("         /　`/ ⌒ Ｙ⌒ Ｙ  ヽ     ever again.\n");
              System.out.printf("        ( 　(三ヽ人　 / 　|  \n");
              System.out.printf("        |　ﾉ⌒＼ ￣￣ヽ   ノ   \n");
              System.out.printf("        ヽ＿＿＿＞､＿ _／⠀⠀⠀⠀  \n");
              System.out.printf("             ｜( 王 ﾉ〈   (\\__/)⠀⠀⠀  \n");
              System.out.printf("             /ﾐ`ー―彡  \\  (•ㅅ•)⠀⠀⠀⠀  \n");
              System.out.printf("            / ╰    ╯    \\ /    \\>⠀⠀⠀   \n");
              System.out.printf("   [a] back⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀          [d] next⠀    \n");
              System.out.printf(" -+--------------------------------------------+- \n");
              System.out.printf("    You have 2 Heart | 1 Question per round\n");
              System.out.printf(" -+--------------------------------------------+- \n");
            }
            else if (select == 2)
            {
              mode = "History" ;
              System.out.printf(" -+--------------------------------------------+- \n");
              System.out.printf("             Mode: H I S T O R Y  \n");
              System.out.printf(" -+--------------------------------------------+- \n");
              System.out.printf("      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀\n");
              System.out.printf("      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀ la la la !   ⠀⠀\n");
              System.out.printf("•.,¸,.•*`•.,¸¸,.•*``╭━━━━━━━━━━━━━╮        \n");
              System.out.printf("•.,¸,.•*¯`•.,¸,.•*¯ |::::::::/\\___/\\    ⠀⠀⠀  \n");
              System.out.printf("•.,¸,.•*¯`•.,¸,.• ᓚ|::::::::(// owo/)⠀⠀   \n");
              System.out.printf("•.,¸,.•¯`•.,¸,.•*¯•.,し-----し-----Ｊ⠀⠀    \n");
              System.out.printf("       ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀\n");
              System.out.printf("      ⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀    ⠀⠀\n");
              System.out.printf("   [a] back⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀          [d] next⠀    \n");
              System.out.printf(" -+--------------------------------------------+- \n");
              System.out.printf("    You have 1 Heart | 2 Question per round\n");
              System.out.printf(" -+--------------------------------------------+- \n");
            }
            System.out.printf(" Enter any key to continue ... ");
            button = input.next();
            if(button.equals("a")) 
            {
              select -= 1 ;
              if(select<0) select=2 ;
            }
            else if(button.equals("d")) 
            {
              select += 1 ;
              if(select>2) select=0 ;
            }
            else if(button.equals("s"))
            {
              menu=1;
              break;
            }
          }
        }
    }
  }
  
  public static String Select_Charecter(int p)
  {
    String button ;
    int select = 0 ;
    String face = "Hoot" ;

    Scanner input = new Scanner(System.in);
      while(true)
      {
          clearScreen();
          System.out.printf(" -+--------------------------------------------+- \n");
          System.out.printf("           Player#%d Select Avater :)\n",p);
          System.out.printf(" -+--------------------------------------------+- \n");
          if (select == 0)
          {
            face = "Hoot" ;
            System.out.printf("    \n"); 
            System.out.printf("    \n"); 
            System.out.printf("                   ,__,__,  \n");
            System.out.printf("                   ( o,o )  \n");
            System.out.printf("           <- [a]   (   )   [d] ->  \n");
            System.out.printf("                   -''-''-   \n");
            System.out.printf("                                     [s] select \n"); 
          }
          else if (select == 1)
          {
            face = "Chicken" ;
            System.out.printf("                   \n") ; 
            System.out.printf("                      \\\\      \n") ;
            System.out.printf("                      (o)>     \n") ;
            System.out.printf("                   \\\\_//)   \n") ;
            System.out.printf("           <- [a]   \\_/_)   [d] -> \n") ;
            System.out.printf("                     _|_     \n") ;
            System.out.printf("                                     [s] select \n"); 
          }
          else if (select == 2)
          {
            face = "Dog" ;
            System.out.printf("                    \n") ; 
            System.out.printf("                     /\\_\n") ;
            System.out.printf("                    (  @\\_ \n") ;
            System.out.printf("                    /     O \n") ;
            System.out.printf("           <- [a]  /  (__/  [d] -> \n") ;
            System.out.printf("                  /   / U  \n") ;
            System.out.printf("                                     [s] select \n"); 
          }
          else if (select == 3)
          {
            face = "Rabbit" ;
            System.out.printf("                 \n") ; 
            System.out.printf("                            \n") ;
            System.out.printf("                              \n") ;
            System.out.printf("                    /\\_/\\      \n") ;
            System.out.printf("           <- [a]  ( o.o )  [d] -> \n") ;
            System.out.printf("                    > ^ <   \n") ;
            System.out.printf("                                     [s] select \n"); 
          }
          else if (select == 4)
          {
            face = "Rabbit" ;
            System.out.printf("               \n") ; 
            System.out.printf("                            \n") ;
            System.out.printf("                              \n") ;
            System.out.printf("                    (\\_(\\      \n") ;
            System.out.printf("           <- [a]   (-.-)   [d] -> \n") ;
            System.out.printf("                     >^<    \n") ;
            System.out.printf("                                     [s] select \n"); 
          }
          System.out.printf(" -+--------------------------------------------+- \n");
          System.out.printf("    Tip : Avatar doesn't make you smarter :p\n");
          System.out.printf(" -+--------------------------------------------+- \n");
          System.out.printf(" Enter any key to continue ... ");
          button = input.next();
          if(button.equals("a")) 
          {
              select -= 1 ;
              if(select<0) select=4 ;
          }
          else if(button.equals("d")) 
          {
              select += 1 ;
              if(select>4) select=0 ;
          }
          else if (button.equals("s"))
          {
            return face ;
          }
        }
  }

  public static void teacher(String talk)
  {

  }
  
  public static void clearScreen()
  {
    System.out.print("\033[H\033[2J");
    System.out.flush();
  } 

  private static void pressEnterToContinue()
  { 
    try
    {
      System.in.read();
    }
    catch(Exception e)
    {}
  }

  public static void enQueue(String str,String face) 
  {
    if ((front == 0 && rear == count - 1) || (rear == (front - 1) % (count - 1))) 
    {
      System.out.printf("\n Player Queue is Full!! ");
      pressEnterToContinue();
    }
    
    if (front == -1)
      front = rear = 0;
    else if (rear == count - 1)
      rear = 0;
    else
      rear++;
    
    avatar[rear] = face ;
    name[rear] = str ;
  }
  
  public static void deQueue() 
  {
    if (front == -1) 
    {
      System.out.printf("\nPlayer Queue is Empty!!");
      return;
    }
    if (front == rear)
      front = rear = -1;
    else if (front == SIZE - 1)
      front = 0;
    else
      front++;
  }

  public static void display() 
  {
    if (front == -1) {
        System.out.printf("\nPlayer Queue is Empty!!!");
    }
    int i;
    System.out.printf("  Queue:  \n    [ ");
    if (rear >= front) {
        for (i = front; i <= rear; i++) {
            System.out.printf("%s ", name[i]);
            if (i < rear)
                System.out.printf("-> ");
        }
    } else {
        for (i = front; i < SIZE; i++) {
            System.out.printf("%s ", name[i]);
            if (i < SIZE - 1)
                System.out.printf("-> ");
        }
        for (i = 0; i <= rear; i++) {
            System.out.printf("%s ", name[i]);
            if (i < rear)
                System.out.printf("-> ");
        }
    }
    System.out.printf(" ] \n");
  }



  
  public static void askQuestion(String group, int questionNumber)
  {
    Question currentQuestion = new Question(group, questionNumber);

    // ตรวจสอบว่า currentQuestion.choice และ currentQuestion.answer ไม่เป็น null
    if (currentQuestion.choice == null || currentQuestion.answer == null) {
      System.out.println("Error: Unable to load the question. Please check the question data.");
      return;
    }
  
    // แสดงคำถามและตัวเลือก
    System.out.println("Question: " + currentQuestion.quiz);
    for (int i = 0; i < currentQuestion.choice.length; i++) {
      System.out.println(i + 1 + ". " + currentQuestion.choice[i]);
    }
    
    // รอรับคำตอบจากผู้เล่นและประมวลผลคำตอบ
    System.out.print("Enter your answer (1-" + currentQuestion.choice.length + "): ");
    Scanner input = new Scanner(System.in);
    int playerAnswer = input.nextInt();
  
    // เช็คคำตอบ
    if (playerAnswer >= 1 && playerAnswer <= currentQuestion.choice.length) 
    {
      String playerChoice = currentQuestion.choice[playerAnswer - 1];
      if (playerChoice.equalsIgnoreCase(currentQuestion.answer)) {
        System.out.println("Correct! You earned " + currentQuestion.score + " points.");
      } else {
        System.out.println("Wrong! The correct answer is: " + currentQuestion.answer);
      }
    }
  }
}