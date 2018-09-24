public class stu
{
	public int num;
public int Chi;
public int Math;
public int Sum;
public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu p1;
	public static stu p2;
	//????
	public static stu creat(int n)
	{
		stu head = null;
	int i;
	for (i = 0;i < n;i++)
	{
		p1 = new stu();

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.Chi = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.Math = Integer.parseInt(tempVar3);
		}
		p1.Sum = p1.Chi + p1.Math;
		if (i == 0)
		{
			head = p1;
			p2 = p1;
		}
		else
		{
			p2.next = p1;
		}
			p2 = p1;
	}
	p2.next = null;
	return (head);
	}

	public static stu Bigthree(stu head)
	{
		int t;
		stu max;
		stu premax;
		stu New;
		stu Newhead = null;
		for (t = 0;t < 3;t++)
		{
			premax = null;
			max = head;
			p2 = head;
			p1 = head.next;
			while (p1 != null)
			{
				if ((p1.Sum) > (max.Sum))
				{
					premax = p2;
					max = p1;
				}
				p2 = p2.next;
				p1 = p1.next;
			}
			if (max == head)
			{
				head = head.next;
			}
			else
			{
				premax.next = max.next;
			}
			max.next = null;
			if (t == 0)
			{
				Newhead = max;
			New = Newhead;
			}

			else
			{
			New = New.next = max;
			}
		}
		New.next = null;
		return (Newhead);
	}

	//???????????
	public static void output(stu head)
	{
		stu p;
		for (p = head;p != null;System.out.printf("%d %d\n",p.num,p.Sum),p = p.next)
		{
			;
		}
	}

	public static void Main()
	{
		int n;
	stu head;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
		head = creat(n);
		head = Bigthree(head);
		output(head);
	}












}

