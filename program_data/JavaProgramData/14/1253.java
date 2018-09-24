public class stu
{
	public int id;
	public int chi;
	public int ma;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int i;
	public static int max = 0;
	public static int d;
	public static int t = 0;
	public static stu p1;
	public static stu p2;

	public static stu creat()
	{
		stu head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p2 = p1 = new stu();
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.chi = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.ma = Integer.parseInt(tempVar4);
			}
			if (i == 0)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			p1 = new stu();
		}
		p2.next = null;
		return (head);
	}

	public static void find(stu head)
	{
		while (t < 3)
		{
		p1 = head;
		for (i = 0;i < n;i++)
		{
			if (p1.chi + p1.ma > max)
			{
				max = p1.chi + p1.ma;
				d = p1.id;
			}
			p1 = p1.next;
		}
		System.out.printf("%d %d\n",d,max);
		t = t + 1;
		max = 0;
		p1 = head;
		for (i = 0;i < n;i++)
		{
			if (p1.id == d)
			{
				p1.chi = 0;
				p1.ma = 0;
			}
			p1 = p1.next;
		}
		}
	}

	public static void Main()
	{
		stu head;
		head = creat();
		find(head);
	}









}

