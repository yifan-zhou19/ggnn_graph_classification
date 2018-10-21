public class stu
{
	public int num;
	public int score1;
	public int score2;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static stu creat()
	{
		int n;
		int i = 1;
		stu head;
		stu p1;
		stu p2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (stu)malloc(len);
		head = null;
		while (i <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p1.num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				p1.score1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				p1.score2 = Integer.parseInt(tempVar4);
			}
			if (i == 1)
			{
				head = p1;
			}
			else
			{
				p2 = p1;
			}
			if (i != n)
			{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
				p1 = p2.next = (stu)malloc(len);
			}
			else
			{
				p1.next = null;
			}
			i++;
		}
		return (head);
	}
	public static void turn(stu head)
	{
		int t = 1;
		int r = 1;
		int a;
		stu q1;
		stu q2;
		stu p3;
		stu p1;
		stu p2;
		for (q1 = p3 = p2 = head;q1.next != null,t <= 3;t++)
		{
			a = 0;
			for (q2 = p1 = q1.next,r = 1;q2 != null;q2 = q2.next,r++)
			{

				if ((q1.score1 + q1.score2) < (q2.score1 + q2.score2))
				{
					 q1 = q2;
					 p2 = p1;
					 a = 1;
				}
				if (r != 1)
				{
					p1 = p1.next;
				}
			}
			System.out.printf("%ld %d\n",q1.num,q1.score1 + q1.score2);
			if (a == 1)
			{
				p2.next = q1.next;
				q1 = head;
			}
			else
			{
				q1 = p3.next;
				p3 = q1;
			}
		}
	}
	public static void Main()
	{
		stu ip;
		ip = creat();
		turn(ip);
	}
}

