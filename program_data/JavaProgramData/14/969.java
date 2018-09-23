public class student
{
	public int num;
	public int chi;
	public int math;
	public int sum;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int n;

	public static void Main()
	{
		student creat = new student();
		student head;
		student p;
		student q1;
		student q2;
		student q3;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = creat();
		p = head;
		a = 0;
		while (p != null)
		{
			if (p.sum > a)
			{
				a = p.sum;
				q1 = p;
			}
			p = p.next;
		}
		p = head;
		a = 0;
		while (p != null)
		{
			if (p.sum > a && p != q1)
			{
				a = p.sum;
				q2 = p;
			}
			p = p.next;
		}
		p = head;
		a = 0;
		while (p != null)
		{
			if (p.sum > a && p != q1 && p != q2)
			{
				a = p.sum;
				q3 = p;
			}
			p = p.next;
		}
		System.out.printf("%d %d\n",q1.num,q1.sum);
		System.out.printf("%d %d\n",q2.num,q2.sum);
		System.out.printf("%d %d\n",q3.num,q3.sum);
	}

	public static student creat()
	{
		student head;
		student p1;
		student p2;
		int i;
		head = null;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				p1.num = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.chi = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				p1.math = Integer.parseInt(tempVar3);
			}
			p1.sum = p1.chi + p1.math;
			if (i == 0)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
		}
		p2.next = null;
		return (head);
	}
}

