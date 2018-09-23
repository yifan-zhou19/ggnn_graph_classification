public class stu
{
	public int num;
	public int chi;
	public int math;
	public int s;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu creat(int n)
	{
		int i;
		stu head;
		stu p1;
		stu p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (stu)malloc(LEN);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.chi = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.math = Integer.parseInt(tempVar3);
		}
		head = p1;
		for (i = 1;i < n;i++)
		{
			p1 = new stu();
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.chi = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.math = Integer.parseInt(tempVar6);
			}
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null;
		return (head);
	}
	public static void Main()
	{
		int i;
		int n;
		int t;
		int m;
		stu head;
		stu p1;
		stu p2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		p1 = head;
		for (i = 0;i < n;i++)
		{
			p1.s = p1.chi + p1.math;
			p1 = p1.next;
		}
		p1 = head;
		p2 = p1.next;
		for (i = 0;i < 3;i++)
		{
			while (p2 != null)
			{
				if (p2.s > p1.s)
				{
					t = p2.s;
					p2.s = p1.s;
					p1.s = t;
					m = p2.num;
					p2.num = p1.num;
					p1.num = m;
				}
				p2 = p2.next;
			}
			System.out.printf("%d %d\n",p1.num,p1.s);
			if (i == 2)
			{
				break;
			}
			p1 = p1.next;
			p2 = p1.next;
		}
	}
}

