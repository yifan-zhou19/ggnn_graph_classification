public class data
{
	public int num;
	public int point1;
	public int point2;
	public int sum;
	public data next;
}

package <missing>;

public class GlobalMembers
{
	public static data creat(int n)
	{
		int i = 0;
		data p1;
		data p2;
		data head;
		p1 = p2 = new data();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.point1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.point2 = Integer.parseInt(tempVar3);
		}
		p1.sum = p1.point1 + p1.point2;
		head = null;
		while (i < n)
		{
			i = i + 1;
			if (i == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			p1 = new data();
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.point1 = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.point2 = Integer.parseInt(tempVar6);
			}
			p1.sum = p1.point1 + p1.point2;
		}
		p2.next = null;
		return (head);
	}
	public static data max(data head)
	{
		data p1;
		data max;
		max = head;
		p1 = head;
		do
		{
			if (p1.sum > max.sum)
			{
				max = p1;
			}
			p1 = p1.next;
		}while (p1 != null);
		return (max);
	}
	public static data del(data head, data max)
	{
		data p1;
		data p2;
		p1 = head;
		while (max != p1)
		{
			p2 = p1;
			p1 = p1.next;
		}
		if (p1 == head)
		{
			head = p1.next;
		}
		else
		{
			p2.next = p1.next;
		}
		return (head);
	}
	public static void Main()
	{
		data a;
		data b;
		data c;
		data head;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		a = max(head);
		System.out.printf("%ld %d\n",a.num,a.sum);
		head = del(head, a);
		b = max(head);
		System.out.printf("%ld %d\n",b.num,b.sum);
		c = max(del(head, b));
		System.out.printf("%ld %d\n",c.num,c.sum);
	}
}

