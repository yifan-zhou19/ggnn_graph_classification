//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

public class student
{
	public String name = new String(new char[100]);
	public int ascore;
	public int bscore;
	public char leader;
	public char xibu;
	public int papernum;
	public int money;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int num;
	public static int total = 0;
	public static int Main()
	{
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		student creat = new student();
		student pt;
		student p;
		student flagp;
		pt = creat();
		p = pt;
		int max = pt.money;
		for (;;)
		{
			if (max <= p.money)
			{
				max = p.money;
			}
			if (p.next == null)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto part2;
			}
			p = p.next;
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	part2:
		p = pt;
		for (;;)
		{
			if (max == p.money)
			{
				flagp = p;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto part1;
			}
			if (p.next == null)
			{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
				goto part1;
			}
			p = p.next;
		}
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	part1:
	;
		System.out.printf("%s\n%d\n%d",flagp.name,flagp.money,total);
		return 0;
	}

	public static student creat()
	{
		student head;
		student p1;
		student p2;
		n = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.name = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.ascore = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.bscore = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar4 != null)
		{
			p1.leader = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar5 != null)
		{
			p1.xibu = tempVar5.charAt(0);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.papernum = Integer.parseInt(tempVar6);
		}
		head = null;
		p1.money = 0;
		if (p1.ascore > 80 && p1.papernum >= 1)
		{
				p1.money += 8000;
		}
			if (p1.ascore > 85 && p1.bscore > 80)
			{
				p1.money += 4000;
			}
			if (p1.ascore > 90)
			{
				p1.money += 2000;
			}
			if (p1.ascore > 85 && p1.xibu == 'Y')
			{
				p1.money += 1000;
			}
			if (p1.bscore > 80 && p1.leader == 'Y')
			{
				p1.money += 850;
			}
			total = p1.money;
		while (n != num - 1)
		{
			n = n + 1;
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			p1.money = 0;
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.name = tempVar7.charAt(0);
			}
			String tempVar8 = ConsoleInput.scanfRead(" ");
			if (tempVar8 != null)
			{
				p1.ascore = Integer.parseInt(tempVar8);
			}
			String tempVar9 = ConsoleInput.scanfRead(" ");
			if (tempVar9 != null)
			{
				p1.bscore = Integer.parseInt(tempVar9);
			}
			String tempVar10 = ConsoleInput.scanfRead(" ", 1);

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


