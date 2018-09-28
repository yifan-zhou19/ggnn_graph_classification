public class student
{
	public String a = new String(new char[20]);
	public String b = new String(new char[40]);
	public char c;
	public int d;
	public float e;
	public String f = new String(new char[20]);
	public student before;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student hh()
	{
		student p1;
		student p2;
		student head;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.a = tempVar.charAt(0);
		}
		head = null;
		while (strcmp(p1.a,"end"))
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.b = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar3 != null)
			{
				p1.c = tempVar3.charAt(0);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.d = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.e = Float.parseFloat(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.f = tempVar6.charAt(0);
			}
			n = n + 1;
			if (n == 1)
			{
				p1.before = null;
			}
			else
			{
				p1.before = p2;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.a = tempVar7.charAt(0);
			}
		};
		head = p2;
		return (head);
	}
	public static void Main()
	{
		student p;
		p = hh();
		while (p != null)
		{
			System.out.printf("%s %s %c %d %g %s\n",p.a,p.b,p.c,p.d,p.e,p.f);
			p = p.before;
		};
	}
}

