public class student
{
	public String name = new String(new char[20]);
	public int score1;
	public int score2;
	public String leader = new String(new char[2]);
	public String west = new String(new char[2]);
	public int paper;
	public int money;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat(int n)
	{
		student head;
		student p1;
		student p2;
		int i;
		p1 = p2 = new student();
		head = p1;
		for (i = 0;i < n;i++)
		{
			p2 = p1;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.name = tempVar.charAt(0);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.score1 = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.score2 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.leader = tempVar4.charAt(0);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.west = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.paper = Integer.parseInt(tempVar6);
			}
			{
				p1.money = 0;
				if (p1.score1 > 80 && p1.paper != 0)
				{
					p1.money = p1.money + 8000;
				}
				if (p1.score1 > 85 && p1.score2 > 80)
				{
					p1.money = p1.money + 4000;
				}
				if (p1.score1 > 90)
				{
					p1.money = p1.money + 2000;
				}
				if (p1.score1 > 85 && (strcmp(p1.west,"Y") == 0))
				{
					p1.money = p1.money + 1000;
				}
				if (p1.score2 > 80 && (strcmp(p1.leader,"Y") == 0))
				{
					p1.money = p1.money + 850;
				}
		}
			p1 = new student();
			p2.next = p1;
		}
		p2.next = null;
		return (head);
	}
	public static void print(student head)
	{
		student p1;
		int max;
		int all = 0;
		p1 = head;
		max = p1.money;
		do
		{
			if (p1.money > max)
			{
				max = p1.money;
			}
			all = all + p1.money;
			p1 = p1.next;
		} while (p1.next != null);
		if (p1.money > max)
		{
			max = p1.money;
		}
		all = all + p1.money;
		p1 = head;
		for (;p1.next != null;)
		{
			if (p1.money == max)
			{
				System.out.printf("%s\n%d\n",p1.name,p1.money);
				break;
			}
			p1 = p1.next;
		}
		System.out.printf("%d",all);
	}
	public static void print1(student head)
	{
		student p1;
		p1 = head;
		do
		{
			System.out.printf("%s %d %d %s %s %d %d\n",p1.name,p1.score1,p1.score2,p1.leader,p1.west,p1.paper,p1.money);
			p1 = p1.next;
		} while (p1 != null);
	}
	public static void Main()
	{
		int n;
		student head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		/*print1(head);*/
		print(head);
	}
}

