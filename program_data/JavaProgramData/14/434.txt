public class stu
{
	public int ID;
	public int ch;
	public int ma;
	public int sum;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		stu head;
		stu p1;
		stu p2;
		stu a;
		stu b;
		stu c;
		stu t;
		int n;
		int i = 0;
		a = b = c = p1 = p2 =  new stu();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.ID = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.ch = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p1.ma = Integer.parseInt(tempVar4);
		}
		p1.sum = p1.ch + p1.ma;
		head = null;
		while (i < n - 1)
		{
			i++;
			p1.sum = p1.ch + p1.ma;
			if (i == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			if (p1.sum > a.sum)
			{
				c = b;
				b = a;
				a = p2;
			}
			else if (p1.sum > b.sum)
			{
				c = b;
				b = p2;
			}
			else if (p1.sum > c.sum)
			{
				c = p2;
			}
			p1 =  new stu();
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.ID = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.ch = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.ma = Integer.parseInt(tempVar7);
			}
		}
		p2.next = null;
		System.out.printf("%d %d\n%d %d\n%d %d\n",a.ID,a.sum,b.ID,b.sum,c.ID,c.sum);
		return 0;
	}

}

