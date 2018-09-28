public class stu
{
	public String no = new String(new char[20]);
	public char sx;
	public String nm = new String(new char[30]);
	public String rm = new String(new char[20]);
	public String mk = new String(new char[10]);
  public int age;
  public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		stu p1;
		stu p2;
		stu head;
	   int i;
	   void output(struct stu * p,struct stu * p2);
	   for (i = 0;;i++)
	   {
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		   p1 = (stu)malloc(L);

		  if (i == 0)
		  {
			  head = p1;
		  }
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  p1.no = tempVar.charAt(0);
		  }
		  if (strcmp(p1.no,"end") == 0)
		  {
			  break;
		  }
		  else
		  {
			  if (i == 0)
			  {
				  head = p1;
			  }
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 p1.nm = tempVar2.charAt(0);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar3 != null)
		 {
			 p1.sx = tempVar3.charAt(0);
		 }
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 p1.age = Integer.parseInt(tempVar4);
		 }
		 String tempVar5 = ConsoleInput.scanfRead();
		 if (tempVar5 != null)
		 {
			 p1.mk = tempVar5.charAt(0);
		 }
		 String tempVar6 = ConsoleInput.scanfRead();
		 if (tempVar6 != null)
		 {
			 p1.rm = tempVar6.charAt(0);
		 }
		if (i == 0)
		{
			head.next = null;
			p2 = head;
		}
		else
		{
		p2.next = p1;
		p2 = p1;
		p2.next = null;
		}
		  }
	   }
	   output(head, head);
	}
	public static void output(stu p, stu p2)
	{
	  if (p.next != null)
	  {
		  output(p.next, p2);
	  }
	  System.out.printf("%s %s %c %d %s %s",p.no,p.nm,p.sx,p.age,p.mk,p.rm);
	  if (p != p2)
	  {
		  System.out.print("\n");
	  }

	}
}

