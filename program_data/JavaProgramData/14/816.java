public class student
{
	public int num;
	public int yuwen;
	public int math;
	public int total;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int m;
	public static int n;
	public static int k;
	public static student creat()
	{
		student head;
		student p1;
		student p2;
		student p3;
		m = 0;
		head = null;
		while (m < n)
		{
		m = m + 1;
		p1 = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.yuwen = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.math = Integer.parseInt(tempVar3);
		}
		p1.total = p1.yuwen + p1.math;
		p2 = head;
		if (m == 1)
		{
			head = p1;
			p1.next = null;
		}
		else
		{
			k = 0;
			while (p1.total <= p2.total != 0 && p2.next != 0 && k <= 3)
			{
				p3 = p2;
				p2 = p2.next;
				k++;
			}
			if (p1.total > p2.total && k <= 3)
			{
				if (head == p2)
				{
					head = p1;
				}
				else
				{
					p3.next = p1;
				}
				p1.next = p2;
			}
			else
			{
				p2.next = p1;
				p1.next = null;
			}
		}
		}
		return (head);
	}

	public static void Main()
	{
		student head;
		student p;
		student px;
		int t1 = 0;
		int t2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat();
		p = head;
		while (t1 < 3)
		{
			System.out.printf("%d %d\n",p.num,p.total);
			p = p.next;
			t1++;
		}
	}
}

