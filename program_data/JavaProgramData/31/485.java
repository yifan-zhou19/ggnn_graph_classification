public class stu
{
  public String num = new String(new char[50]);
  public String name = new String(new char[50]);
  public char sex;
  public int age;
  public float score;
  public String add = new String(new char[50]);
  public stu forward;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n = 0;
	   stu head;
	   stu p1;
	   stu p2;
	   head = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	   p1 = p2 = (stu)malloc(LEN);
	   while (true)
	   {
		   n++;
	   if (n == 1)
	   {
		   head = p1;
		   head.forward = null;
	   }
	   else
	   {
		   p1.forward = p2;
	   }
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   p1.num = tempVar.charAt(0);
	   }
		  if (strcmp(p1.num,"end") == 0)
		  {
			  break;
		  }

	   String tempVar2 = ConsoleInput.scanfRead(" ");
	   if (tempVar2 != null)
	   {
		   p1.name = tempVar2.charAt(0);
	   }
	   String tempVar3 = ConsoleInput.scanfRead(" ", 1);
	   if (tempVar3 != null)
	   {
		   p1.sex = tempVar3.charAt(0);
	   }
	   String tempVar4 = ConsoleInput.scanfRead(" ");
	   if (tempVar4 != null)
	   {
		   p1.age = Integer.parseInt(tempVar4);
	   }
	   String tempVar5 = ConsoleInput.scanfRead(" ");
	   if (tempVar5 != null)
	   {
		   p1.score = Float.parseFloat(tempVar5);
	   }
	   String tempVar6 = ConsoleInput.scanfRead(" ");
	   if (tempVar6 != null)
	   {
		   p1.add = tempVar6.charAt(0);
	   }
	   p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	   p1 = (stu)malloc(LEN);
	   }

	   stu p;
	   p = p2;
	   if (p.forward != null)
	   {
		 do
		 {
		 System.out.printf("%s %s %c %d %g %s\n",p.num,p.name,p.sex,p.age,p.score,p.add);
		 p = p.forward;
		 }while (p != null);

	   }

	}
}

