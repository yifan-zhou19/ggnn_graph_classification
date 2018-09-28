public class student
{
	public String name = new String(new char[20]);
	public int score1;
	public int score2;
	public char c1;
	public char c2;
	public int paper;
	public int money;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int N;
	public static void mon(student p)
	{
		p.money = 0;
		if ((p.score1 > 80) && (p.paper >= 1))
		{
			p.money = p.money + 8000;
		}
		if ((p.score1 > 85) && (p.score2 > 80))
		{
			p.money += 4000;
		}
		if (p.score1 > 90)
		{
			p.money += 2000;
		}
		if ((p.score1 > 85) && (p.c2 == 'Y'))
		{
			p.money += 1000;
		}
		if ((p.score2 > 80) && (p.c1 == 'Y'))
		{
			p.money += 850;
		}
	}
	public static student creat()
	{
		student head;
		student p1;
		student p2;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.name = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.score1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.score2 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar4 != null)
		{
			p1.c1 = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.c2 = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.paper = Integer.parseInt(tempVar6);
		}
		p1.next = null;
		mon(p1);
		head = p1;
		p2 = p1;
		for (i = 1;i < N;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.name = tempVar7.charAt(0);
			}
			String tempVar8 = ConsoleInput.scanfRead(" ");
			if (tempVar8 != null)
			{
				p1.score1 = Integer.parseInt(tempVar8);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				p1.score2 = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar10 != null)
			{
				p1.c1 = tempVar10.charAt(0);
			}
			String tempVar11 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar11 != null)
			{
				p1.c2 = tempVar11.charAt(0);
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p1.paper = Integer.parseInt(tempVar12);
			}
			p1.next = null;
			mon(p1);
			p2.next = p1;
			p2 = p1;
		}
		return (head);
	}
	public static void f(student head)
	{
		int max;
		int sum = 0;
		String name = new String(new char[20]);
		student p;
		max = head.money;
		name = head.name;
		for (p = head;p != null;p = p.next)
		{
			sum += p.money;
			if (p.money > max)
			{
				max = p.money;
				name = p.name;
			}
		}
		System.out.printf("%s\n%d\n%d\n",name,max,sum);
	}
	public static int Main()
	{
		student head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		head = creat();
		f(head);
	}



}

