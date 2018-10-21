public class stdnt
{
public String num = new String(new char[20]);
public String name = new String(new char[20]);
public char gndr;
public int age;
public double score;
public String adrs = new String(new char[30]);
public stdnt next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static stdnt creat()
	{
	stdnt p1;
	stdnt p2 = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	p1 = (stdnt)malloc(LEN);
	for (n = 0;;n++)
	{
		if (n == 0)
		{
			p1.next = null;
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
		else
		{
			p2 = p1;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.name = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			p1.gndr = tempVar3.charAt(0);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p1.age = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			p1.score = Double.parseDouble(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.adrs = tempVar6.charAt(0);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (stdnt)malloc(LEN);
		p1.next = p2;
	}
	return p1.next;
	}

	public static void output(stdnt p)
	{
	while (p != 0)
	{
		  System.out.printf("%s %s %c %d %g %s\n",p.num,p.name,p.gndr,p.age,p.score,p.adrs);
		  p = p.next;
	}
	}

	public static int Main()
	{
	stdnt p;
	p = creat();
	output(p);

	}

}

