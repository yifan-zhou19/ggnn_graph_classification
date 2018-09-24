public class stu
{
	public int xh;
	public int yw;
	public int sx;
	public int all;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static stu a;
	public static stu b;
	public static stu c;
	public static stu q = new stu();
	public static stu t = new stu();
	public static stu r = new stu();
	public static stu creat()
	{
		stu head;
		stu p1;
		stu p2;
		int i;
		p1 = p2 = new stu();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.xh = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.yw = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.sx = Integer.parseInt(tempVar3);
		}
		p1.all = p1.yw + p1.sx;
		head = p1;
		a = b = c = head;
		for (i = 1;i < n;i++)
		{
			p2.next = p1;
			p2 = p1;
			p1 = new stu();
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.xh = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.yw = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.sx = Integer.parseInt(tempVar6);
			}
			p1.all = p1.yw + p1.sx;
			if (p1.all > a.all)
			{
				c = b;
				b = a;
				a = p1;
			}
			else
			{

				if (p1.all > b.all)
				{
					c = b;
					b = p1;
				}
				else
				{
					if (p1.all > c.all)
					{
						c = p1;
					}
				}
			}

		}
		p2.next = null;
		return head;
	}

	public static void Main()
	{

		stu p;
		a = q;
		b = t;
		c = r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p = creat();
		System.out.printf("%d %d\n%d %d\n%d %d\n",a.xh,a.all,b.xh,b.all,c.xh,c.all);
	}



}

