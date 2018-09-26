public class Student
{
	public String num = new String(new char[50]);
	public String name = new String(new char[50]);
	public char x;
	public int age;
	public float score;
	public String ad = new String(new char[50]);
	public Student next;
}

package <missing>;

public class GlobalMembers
{
	public static Student create()
	{
		Student head;
		Student p1;
		Student p2;
		int n = 0;
		final String end = "end\0";
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (Student)malloc(LEN);
		p2 = p1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			p1.x = tempVar3.charAt(0);
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
			p1.ad = tempVar6.charAt(0);
		}
		head = null;
		for (;;)
		{
		 n = n + 1;
		 if (n == 1)
		 {
			 head = p1;
		 }
		 else
		 {
			 p1.next = head;
		 }
		 head = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		 p1 = (Student)malloc(LEN);

		 String tempVar7 = ConsoleInput.scanfRead();
		 if (tempVar7 != null)
		 {
			 p1.num = tempVar7.charAt(0);
		 }
		 if (strcmp(p1.num,end) == 0)
		 {
			 break;
		 }
		 String tempVar8 = ConsoleInput.scanfRead();
		 if (tempVar8 != null)
		 {
			 p1.name = tempVar8.charAt(0);
		 }
		 String tempVar9 = ConsoleInput.scanfRead(" ", 1);
		 if (tempVar9 != null)
		 {
			 p1.x = tempVar9.charAt(0);
		 }
		 String tempVar10 = ConsoleInput.scanfRead();
		 if (tempVar10 != null)
		 {
			 p1.age = Integer.parseInt(tempVar10);
		 }
		 String tempVar11 = ConsoleInput.scanfRead();
		 if (tempVar11 != null)
		 {
			 p1.score = Float.parseFloat(tempVar11);
		 }
		 String tempVar12 = ConsoleInput.scanfRead();
		 if (tempVar12 != null)
		 {
			 p1.ad = tempVar12.charAt(0);
		 }
		}
		p2.next = null;
		return (head);
	}
	public static void print(Student head)
	{
		Student p;
		p = head;
		while (p != null)
		{
			System.out.printf("%s %s %c %d %g %s\n",p.num,p.name,p.x,p.age,p.score,p.ad);
			p = p.next;
		};

	}
	public static int Main()
	{
		Student pt;
		pt = create();
		print(pt);

	}





}

