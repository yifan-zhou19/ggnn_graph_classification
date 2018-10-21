///#include<stdafx.h>

public class stu
{
	public String name = new String(new char[20]);
	public int final;
	public int rate;
	public char leader;
	public char west;
	public int paper;
	public int money;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu max;
	public static stu p1;
	public static stu p2;
	public static stu head;
	public static int prize(stu p)
	{
		p.money = 0;
		if (p.final > 80 && p.paper > 0)
		{
			p.money += 8000;
		}
		if (p.final > 85 && p.rate > 80)
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
		if (p.rate > 80 && p.leader == 'Y')
		{
			p.money += 850;
		}
		return (p.money);
	}
	public static stu create(int n)
	{

		int i = 0;

		p1 = p2 = new stu();
		head = null;
		max = p2;
		while (i < n)
		{

			if (i == 0)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p2.name = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p2.final = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p2.rate = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar4 != null)
			{
				p2.leader = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				p2.west = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p2.paper = Integer.parseInt(tempVar6);
			}
			p2.money = prize(p2);
			if (p2.money > max.money)
			{
				max = p2;
			}
			p1 = new stu();
			i++;
		}
		p2.next = null;
		return (head);
	}

	public static int sum(stu head)
	{
		stu p;
		int sum;
		p = head;
		sum = p.money;
		while (p.next != 0)
		{
			p = p.next;
			sum += p.money;
		}
		return (sum);
	}
	public static void Main()
	{
		int n;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p1 = create(n);
		System.out.printf("%s\n%d\n",max.name,max.money);
		System.out.printf("%d",sum(p1));


	}
}

