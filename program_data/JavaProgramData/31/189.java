public class stu
{
	public String num = new String(new char[20]);
	 public String name = new String(new char[30]);
	 public char sex;
	 public int age;
	 public float score;
	 public String add = new String(new char[30]);
	 public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int len = 1;
	 stu p1;
	 stu p2;
	 stu head;
	 stu new;
	 stu newhead;
	 p1 = p2 = head = new stu();
	 System.out.print("\n");
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 p1.num = tempVar.charAt(0);
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
	 while (strcmp(p1.num,"end") != 0)
	 {
		 p1 = new stu();
	  String tempVar7 = ConsoleInput.scanfRead();
	  if (tempVar7 != null)
	  {
		  p1.num = tempVar7.charAt(0);
	  }
	  String tempVar8 = ConsoleInput.scanfRead(" ");
	  if (tempVar8 != null)
	  {
		  p1.name = tempVar8.charAt(0);
	  }
	  String tempVar9 = ConsoleInput.scanfRead(" ", 1);
	  if (tempVar9 != null)
	  {
		  p1.sex = tempVar9.charAt(0);
	  }
	  String tempVar10 = ConsoleInput.scanfRead(" ");
	  if (tempVar10 != null)
	  {
		  p1.age = Integer.parseInt(tempVar10);
	  }
	  String tempVar11 = ConsoleInput.scanfRead(" ");
	  if (tempVar11 != null)
	  {
		  p1.score = Float.parseFloat(tempVar11);
	  }
	  String tempVar12 = ConsoleInput.scanfRead(" ");
	  if (tempVar12 != null)
	  {
		  p1.add = tempVar12.charAt(0);
	  }
	  System.out.print("\n");
	  if (strcmp(p1.num,"end") == 0)
	  {
	  p2.next = null;
	  }
	  else
	  {
		  p2.next = p1;
	  p2 = p1;
	  len++;
	  }
	 }
	 p1 = head;
	 for (i = 0;i < len;i++)
	 {
		 p1 = p2 = head;
	 while (p1.next != null)
	 {
		   p2 = p1;
	   p1 = p1.next;
	 }
	   if (i == 0)
	   {
	   newhead = new = p1;
	   }
	   else
	   {
	   new = new.next = p1;
	   }
	   p2.next = null;
	 }
	p1 = newhead;
	for (i = 0;i < len;i++)
	{
		System.out.printf("%s %s %c %d %g %s\n",p1.num,p1.name,p1.sex,p1.age,p1.score,p1.add);
	p1 = p1.next;
	}
	}
}

