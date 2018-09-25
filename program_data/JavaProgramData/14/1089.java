public class student
{
	public int num;
	public int ch;
	public int math;
	public int total;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int t;
	public static student creat()
	{
		student head;
		student p1;
		student p2;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		head = p1 = p2 = (student)malloc(LEN);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.ch = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p1.math = Integer.parseInt(tempVar4);
		}
		p1.total = p1.ch + p1.math;
		for (i = 2;i <= n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.num = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.ch = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.math = Integer.parseInt(tempVar7);
			}
			p1.total = p1.ch + p1.math;
			p2.next = p1;
			p2 = p1;

		}
		p2.next = null;
		return (head);
	}

	public static void print(student head)
	{
		student p;
		int max;
		p = head;
		max = p.total;
		p = p.next;
		while (p.next != null)
		{
			if (p.total > max)
			{
				max = p.total;
				t = p.num;
			}
			p = p.next;
		}
		System.out.printf("%d %d\n",t,max);
	}

	public static student del(student head, int a)
	{
		student p1;
		student p2;
		p1 = head;
		while (a != p1.num && p1.next != null)
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
		student head1;
		student head2;
		student head3;
		head1 = creat();
		print(head1);
		head2 = del(head1, t);
		print(head2);
		head3 = del(head2, t);
		print(head3);
	}

}

