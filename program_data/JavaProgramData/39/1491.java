public class stu
{
	public String name = new String(new char[21]);
	public int final;
	public int comment;
	public String leader = new String(new char[2]);
	public String west = new String(new char[2]);
	public int paper;
	public stu next;
	public int total;
}

package <missing>;

public class GlobalMembers
{
	public static stu head;
	public static stu p1;
	public static stu p2;
	public static void Main()
	{
		int n;
		int i;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			p1 = new stu();
			if (i == 0)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.name = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.final = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.comment = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.leader = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.west = tempVar6.charAt(0);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.paper = Integer.parseInt(tempVar7);
			}
		}
		p2.next = null;
		for (p1 = head;p1 != null;p1 = p1.next)
		{
			p1.total = 0;
			if (p1.final > 80 && p1.paper != 0)
			{
				p1.total += 8000;
			}
			if (p1.final > 85 && p1.comment > 80)
			{
				p1.total += 4000;
			}
			if (p1.final > 90)
			{
				p1.total += 2000;
			}
			if (p1.final > 85 && p1.west.charAt(0) == 'Y')
			{
				p1.total += 1000;
			}
			if (p1.comment > 80 && p1.leader.charAt(0) == 'Y')
			{
				p1.total += 850;
			}
		}
		max = head.total;
		for (p1 = head.next;p1 != null;p1 = p1.next)
		{
			max = max > p1.total != 0?max:p1.total;
		}
		for (p1 = head;p1 != null;p1 = p1.next)
		{
			if (p1.total == max)
			{
				break;
			}
		}
		System.out.printf("%s\n%d\n",p1.name,max);
		max = 0;
		for (p1 = head;p1 != null;p1 = p1.next)
		{
			max += p1.total;
		}
		System.out.printf("%d\n",max);
	}
}

