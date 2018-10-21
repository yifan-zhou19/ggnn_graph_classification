public class student
{
	public int num;
	public int yu;
	public int shu;
	public int he;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student create(int n)
	{
		student head;
		student p1;
		student p2;
		int i;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = (student)malloc(len);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.num = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.yu = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.shu = Integer.parseInt(tempVar3);
		}
		p1.he = p1.yu + p1.shu;
		p1.next = null;

		head = p1;
		p2 = p1;
		for (i = 1;i <= n - 1;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(len);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.yu = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.shu = Integer.parseInt(tempVar6);
			}
			p1.he = p1.yu + p1.shu;
			p1.next = null;
			p2.next = p1;
			p2 = p1;
		}
		return head;
	}

	public static student max(student head)
	{
		student p;
		student m;
		m = head;
		p = head.next;
		while (p != null)
		{
			if (p.he > m.he)
			{
				m = p;
			}
			p = p.next;
		}
		return m;
	}

	public static void Main()
	{
		int n;
		int i;
		student head;
		student m;
		student create = new student(int n);
		student max = new student(struct student * head);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = create(n);
		for (i = 1;i <= 3;i++)
		{
			m = max(head);
			System.out.printf("%d %d\n",m.num,m.he);
			m.he = -1;
		}
	}


}

