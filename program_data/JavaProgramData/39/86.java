public class student
{
	public String name = new String(new char[20]);
	public int final;
	public int ping;
	public char gan;
	public char xi;
	public int paper;
	public int money;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i = 0;
		int max = 0;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student head;
		student p;
		student x;
		head = p = new student();
		p.money = 0;
		while (i++<n)
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
				p.ping = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p.gan = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				p.xi = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p.paper = Integer.parseInt(tempVar7);
			}
			if (p.final > 80 && p.paper > 0)
			{
				p.money += 8000;
			}
			if (p.final > 85 && p.ping > 80)
			{
				p.money += 4000;
			}
			if (p.final > 90)
			{
				p.money += 2000;
			}
			if (p.final > 85 && p.xi == 'Y')
			{
				p.money += 1000;
			}
			if (p.ping > 80 && p.gan == 'Y')
			{
				p.money += 850;
			}
			if (p.money > max)
			{
				max = p.money;
				x = p;
			}
			sum += p.money;
			p = p.next = new student();
			p.money = 0;
		}
		System.out.printf("%s\n%d\n%d\n",x.name,max,sum);
	}
}

