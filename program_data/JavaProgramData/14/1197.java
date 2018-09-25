public class student
{
	public int num;
	public int ch;
	public int ma;
	public int sum;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int N;
	public static int n;

	public static student creat()
	{
		student head;
		student p1;
		student p2;
		n = 0;
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
			p1.ch = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.ma = Integer.parseInt(tempVar3);
		}
		p1.sum = p1.ch + p1.ma;
		head = null_Renamed;
		while (n < N - 1)
		{
			n = n + 1;
			if (n == 1)
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
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				p1.num = Integer.parseInt(tempVar4);
			}
			String tempVar5 = ConsoleInput.scanfRead(" ");
			if (tempVar5 != null)
			{
				p1.ch = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.ma = Integer.parseInt(tempVar6);
			}
			p1.sum = p1.ch + p1.ma;
		}
		p2.next = null_Renamed;
		return (head);
	}

	public static void Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		student head;
		student p1;
		student p2;
		head = creat();
		p1 = head.next;
		p2 = p1.next;
		void sort(struct student * p3,struct student * p4);
		sort(head, p1);
		sort(p1, p2);
		sort(p2, p2.next);
		p2.next = null_Renamed;
		p1 = head;
		while (p1 != null_Renamed)
		{
			System.out.printf("%d %d\n",p1.num,p1.sum);
			p1 = p1.next;
		}
	}

	public static void sort(student p3, student p4)
	{
		int k;
		while (p4 != null_Renamed)
		{
			if (p3.sum < p4.sum)
			{
				k = p3.num;
				p3.num = p4.num;
				p4.num = k;
				k = p3.sum;
				p3.sum = p4.sum;
				p4.sum = k;
			}
			p4 = p4.next;
		}
	}
}

