public class info
{
	public int num;
	public int chin;
	public int math;
	public info next;
}

package <missing>;

public class GlobalMembers
{
	public static info create(int n)
	{
		int i;
		info head;
		info p1;
		info p2;
		p1 = new info();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.chin = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.math = Integer.parseInt(tempVar3);
		}
		p1.next = null;
		head = p1;
		p2 = p1;
		i = 1;
		do
		{
			p1 = new info();
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.chin = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.math = Integer.parseInt(tempVar6);
			}
			p1.next = null;
			p2.next = p1;
			p2 = p1;
			i++;
		}while (i < n);
		return (head);
	}
	public static void arrange(info head)
	{
		int m;
		int no1;
		int no2;
		int no3;
		info p;
		p = head;
		m = 0;
		while (p != null)
		{
		if (p.chin + p.math > m)
		{
			m = p.chin + p.math;
			no1 = p.num;
		}
		p = p.next;
		}
		System.out.printf("%d %d\n",no1,m);
		m = 0;
		p = head;
		no2 = p.num;
		while (p != null)
		{
		if (p.chin + p.math > m && p.num != no1)
		{
			m = p.chin + p.math;
			no2 = p.num;
		}
		p = p.next;
		}
		System.out.printf("%d %d\n",no2,m);
		m = 0;
		p = head;
		no3 = p.num;
		while (p != null)
		{
		if (p.chin + p.math > m && p.num != no1 && p.num != no2)
		{
			m = p.chin + p.math;
			no3 = p.num;
		}
		p = p.next;
		}
		System.out.printf("%d %d\n",no3,m);
	}
	public static int Main()
	{
		int n;
		info head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = create(n);
		arrange(head);
	}

}

