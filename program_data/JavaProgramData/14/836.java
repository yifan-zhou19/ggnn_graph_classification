public class student
{
	public int num;
	public int chi;
	public int math;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static student creat(int n)
	{
		student head;
		student p1;
		student p2;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
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
		for (i = 2;i <= n;i++)
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
		return head;
	}

	public static void Main()
	{
		student head;
		student p;
		student p1;
		student p2;
		student p3;
		int n;
		int m1;
		int m2;
		int m3;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat(n);
		p = head;
		m1 = m2 = m3 = 0;
		if (head != null)
		{
			do
			{
				k = p.chi + p.math;
				if (k > m1)
				{
					m1 = k;
					p1 = p;
				}
				p = p.next;
			} while (p != null);
			p = head;
			do
			{
				k = p.chi + p.math;
				if ((k > m2) && (p != p1))
				{
					m2 = k;
					p2 = p;
				}
				p = p.next;
			} while (p != null);
			p = head;
			do
			{
				k = p.chi + p.math;
				if ((k > m3) && (p != p1) && (p != p2))
				{
					m3 = k;
					p3 = p;
				}
				p = p.next;
			} while (p != null);
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",p1.num,m1,p2.num,m2,p3.num,m3);
	}
}

