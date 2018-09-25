public class student
{
	public int id;
	public int chi;
	public int math;
	public int total;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int student_num;

	public static student creat()
	{
		student p1;
		student p2;
		student head;
		int n = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			student_num = Integer.parseInt(tempVar);
		}
		p1 = p2 = new student();
		while (n < student_num)
		{
			if (n == 0)
			{
				head = p1;
			}
			if (n == student_num - 1)
			{
				p1.next = null;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.id = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.chi = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.math = Integer.parseInt(tempVar4);
			}
			p1.total = p1.chi + p1.math;
			p2 = p1;
			p1 = new student();
			p2.next = p1;
			n++;
		}
		return head;
	}

	public static void Main()
	{
		student head;
		student p;
		int i;
		int n = 0;
		int first;
		int second;
		int third;
		int firstid;
		int secondid;
		int thirdid;
		head = creat();
		first = 0;
		second = 0;
		third = 0;
		p = head;
		for (i = 1;i <= student_num;i++)
		{
			if (p.total > first)
			{
				third = second;
				second = first;
				first = p.total;
				thirdid = secondid;
				secondid = firstid;
				firstid = p.id;
			}
			else if (p.total <= first != 0 && p.total> second)
			{
				third = second;
				second = p.total;
				thirdid = secondid;
				secondid = p.id;
			}
			else if (p.total <= second != 0 && p.total> third)
			{
				third = p.total;
				thirdid = p.id;
			}
			p = p.next;
		}

		System.out.printf("%d %d\n%d %d\n%d %d\n",firstid,first,secondid,second,thirdid,third);

	}
}

