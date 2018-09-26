public class stu
{
	public String num = new String(new char[9]);
 public String nam = new String(new char[50]);
 public char s;
 public int old;
 public double sco;
 public String add = new String(new char[18]);
 public stu next;
 public stu abv;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		stu head;
		stu p1;
		stu p2;
	 int i = 0;
	 head = null;
	 do
	 {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 p1 = (stu)malloc(LEN);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  p1.num = tempVar.charAt(0);
	  }
	  if (!strcmp(p1.num,"end"))
	  {
		  break;
	  }
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  p1.nam = tempVar2.charAt(0);
	  }
	  String tempVar3 = ConsoleInput.scanfRead(" ", 1);
	  if (tempVar3 != null)
	  {
		  p1.s = tempVar3.charAt(0);
	  }
	  String tempVar4 = ConsoleInput.scanfRead(" ");
	  if (tempVar4 != null)
	  {
		  p1.old = Integer.parseInt(tempVar4);
	  }
	  String tempVar5 = ConsoleInput.scanfRead(" ");
	  if (tempVar5 != null)
	  {
		  p1.sco = Double.parseDouble(tempVar5);
	  }
	  String tempVar6 = ConsoleInput.scanfRead(" ");
	  if (tempVar6 != null)
	  {
		  p1.add = tempVar6.charAt(0);
	  }
	  if (i == 0)
	  {
		  head = p1;
		  p1.abv = null;
	  }
	  else
	  {
		  p1.abv = p2;
	  }
	  p2 = p1;
	  i++;
	 }while (1 != 0);
	 p1 = p2;
	 do
	 {
		 if (p1.sco - (int)p1.sco == 0)
		 {
	  System.out.printf("%s %s %c %d %.0lf %s\n",p1.num,p1.nam,p1.s,p1.old,p1.sco,p1.add);
		 }
	  else
	  {
	  System.out.printf("%s %s %c %d %.1lf %s\n",p1.num,p1.nam,p1.s,p1.old,p1.sco,p1.add);
	  }
	  p1 = p1.abv;
	 }while (p1 != null);
	}

}

