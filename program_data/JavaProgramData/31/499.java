public class student
{
   public String num = new String(new char[30]);
   public String name = new String(new char[40]);
   public String sex = new String(new char[2]);
   public int age;
   public float score;
   public String add = new String(new char[50]);
   public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat()
	{
	  student head;
	  student p1;
	  student p2;
	  n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  p1 = p2 = (student) malloc(LEN);
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  p1.num = tempVar.charAt(0);
	  }
	  head = null;
	  while (strcmp(p1.num,"end") != 0)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.sex = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p1.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			p1.score = Float.parseFloat(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			p1.add = tempVar6.charAt(0);
		}
		n++;
		if (n == 1)
		{
			p2.next = null;
		}
		else
		{
			p1.next = p2;
		}
		p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student) malloc(LEN);
		String tempVar7 = ConsoleInput.scanfRead();
		if (tempVar7 != null)
		{
			p1.num = tempVar7.charAt(0);
		}
	  }
	  head = p2;

	  return (head);
	}
	public static void print(student head)
	{
	  student p;
	  p = head;
	  if (head != 0)
	  {
		  do
		  {
			  System.out.printf("%s %s %s %d %g %s\n",p.num,p.name,p.sex,p.age,p.score,p.add);
			  p = p.next;
		  }while (p != 0);
	  }
	}
	public static void Main()
	{
		student head;
		head = creat();
		print(head);
	}
}

