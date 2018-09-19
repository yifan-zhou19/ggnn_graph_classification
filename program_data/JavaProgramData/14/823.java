public class student
{
	public int num;
	public int chinese;
	public int math;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int m;
	public static student creat(int n)
	{
		student head;
		student p1;
		student p2;
		m = 0;
		p1 = p2 = new student();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.chinese = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.math = Integer.parseInt(tempVar3);
		}
		head = null;
		while (n-- != 0)
		{
			m = m + 1;
			if (m == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			p1 = new student();
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.chinese = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.math = Integer.parseInt(tempVar6);
			}
		}
		p2.next = null;
		return (head);
	}
			public static student del(student head, int num)
			{
				student p1;
				student p2;
				p1 = head;
				while (num != p1.num && p1.next != null)
				{
					p2 = p1;
					p1 = p1.next;
				}
				if (num == p1.num)
				{
					if (p1 == head)
					{
						head = p1.next;
					}
					else
					{
						p2.next = p1.next;
					}
					m = m - 1;
				}
				return (head);
			}
	public static int Main()
	{
		int max = 0;
		int n;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student head;
		student p1;
		student p2;
		head = creat(n);
		for (j = 0;j < 3;j++)
		{
			 p1 = head;
			p2 = head;
			max = 0;
			while (p1.next != null)
			{
				if ((p1.chinese + p1.math) > max)
				{
				max = p1.chinese + p1.math,p2 = p1;
				}
					p1 = p1.next;
			}
			System.out.printf("%d %d\n",p2.num,(p2.chinese + p2.math));
			head = del(head, p2.num);
		}
	}
}

