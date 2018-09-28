public class Student
{
	public String name = new String(new char[20]);
	public int final;
	public int evaluate;
	public char office;
	public char west;
	public int paper;
	public int money;
	public Student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		Student head;
		Student p;
		Student best;
		head = new Student();
		p = head;
		int N;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p.final = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p.evaluate = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p.office = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p.west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p.paper = Integer.parseInt(tempVar7);
			}
			p.money = 0;
			if (p.final > 80 && p.paper > 0)
			{
				p.money += 8000;
			}
			if (p.final > 85 && p.evaluate > 80)
			{
				p.money += 4000;
			}
			if (p.final > 90)
			{
				p.money += 2000;
			}
			if (p.final > 85 && p.west == 'Y')
			{
				p.money += 1000;
			}
			if (p.evaluate > 80 && p.office == 'Y')
			{
				p.money += 850;
			}
			p.next = new Student();
			p = p.next;
		}
		int all = 0;
		p = head;
		best = head;
		for (i = 0;i < N;i++)
		{
			all += p.money;
			if (p.money > best.money)
			{
				best = p;
			}
			p = p.next;
		}
		System.out.printf("%s\n%d\n%d",best.name,best.money,all);
		return 0;
	}

}

