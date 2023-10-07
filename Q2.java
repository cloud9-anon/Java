import java.lang.*;
class Tank{ 
private int level;

Tank(int l){
level=l;
}
void setlevel (int l1){
level=l1;
}
int getlevel()
{
  return level;
  }
}
  
  
  public class Q2
  {
  public static void main(String[] args){
   Tank t1=new Tank(10);
   Tank t2= new Tank(20);
   System.out.println("1: t1.level = "+ t1.getlevel() + ", t2.level ="+ t2.getlevel());
   t1=t2;
   System.out.println("2: t1.level = "+ t1.getlevel() + ", t2.level ="+ t2.getlevel());
   t1.setlevel(27);
   System.out.println("3: t1.level = "+ t1.getlevel() + ", t2.level ="+ t2.getlevel());
   t2.setlevel((t1.getlevel())+ 10);
   System.out.println("4: t1.level = "+ t1.getlevel() + ", t2.level ="+ t2.getlevel());
   }
   }
