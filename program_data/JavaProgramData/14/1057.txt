public class student
{
	public int num;
	public int chinese;
	public int math;
	public int total;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;
	public static student creat(int n)
	{
		student head;
		student p1;
		student p2;
		int i;
		if (n == 0)
		{
			head = null;
			return (head);
		}
		else
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				p1.chinese = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.math = Integer.parseInt(tempVar3);
			}
			p1.next = null;
			head = p1;
			p2 = p1;
			for (i = 1;i < n;i++)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p1 = (student)malloc(LEN);
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					p1.num = Integer.parseInt(tempVar4);
				}
				String tempVar5 = ConsoleInput.scanfRead(" ");
				if (tempVar5 != null)
				{
					p1.chinese = Integer.parseInt(tempVar5);
				}
				String tempVar6 = ConsoleInput.scanfRead(" ");
				if (tempVar6 != null)
				{
					p1.math = Integer.parseInt(tempVar6);
				}
				p1.next = null;
				p2.next = p1;
				p2 = p1;
			}
			return (head);
		}

	}
	public static void top3(student head)
	{
		student p;
		student p1;
		int max = 0;
		p = head;
		do
		{
			p.total = (p.chinese) + (p.math);
			if ((p.total) > max)
			{
				max = p.total;
				p1 = p;
			}
			p = p.next;
		}while (p != null);
		System.out.printf("%d %d\n",p1.num,p1.total);
		p1.total = 0;
		p = head;
		max = 0;
		do
		{
			if ((p.total) > max)
			{
				max = p.total;
				p1 = p;
			}
			p = p.next;
		}while (p != null);
		System.out.printf("%d %d\n",p1.num,p1.total);
		p1.total = 0;
		p = head;
		max = 0;
		do
		{
			if ((p.total) > max)
			{
				max = p.total;
				p1 = p;
			}
			p = p.next;
		}while (p != null);
		System.out.printf("%d %d\n",p1.num,p1.total);
		p1.total = 0;
		max = 0;

	}
	public static void Main()
	{
		student head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		top3(head);
	}
}

