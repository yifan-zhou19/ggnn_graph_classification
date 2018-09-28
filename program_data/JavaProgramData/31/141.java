public class stu
{
	public String num = new String(new char[10]);
 public String name = new String(new char[20]);
 public char sex;
 public int age;
 public float score;
 public String add = new String(new char[30]);
 public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static stu create()
	{
	 stu head;
	 stu p1;
	 stu p2;
	 n = 1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p1 = (stu)malloc(LEN);
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
	 p1.next = null;
	 head = p1;
	 p2 = p1;
	  do
	  {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		  p1 = (stu)malloc(LEN);
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			p1.num = tempVar7.charAt(0);
		}
		if (strcmp(p1.num,"end") == 0)
		{
			 p1 = null;
			 break;
		}
		else
		{
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
		 p1.next = null;
		 p2.next = p1;
		 p2 = p1;
		 n++;
		}
	  }while (1 != 0);
	  return head;
	}
	public static stu del(stu head)
	{
		stu p;
		stu ppre;
		p = head;
		while (p != null && p.next != null)
		{
			ppre = p;
			p = p.next;
		}
		System.out.printf("%s %s %c %d %g %s\n", p.num,p.name,p.sex,p.age,p.score,p.add);
		ppre.next = null;
		p = null;
		return head;
	}
	public static void Main()
	{
		stu head;
		int i;
		head = create();
		for (i = 0;i < n;i++)
		{
		  head = del(head);
		}
	}

}

