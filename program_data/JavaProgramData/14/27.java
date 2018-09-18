public class stu
{
	public int num;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int n;
		int a;
		int b;
		int score;
		int first = 0;
		int second = 0;
		int third = 0;
		stu head;
		stu p;
		stu p1;
		stu p2;
		stu p3;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = p = new stu();
		while (i++<n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				p.num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				b = Integer.parseInt(tempVar4);
			}
			score = a + b;
	if (score > first)
	{
				third = second;
				second = first;
				first = score;
				p3 = p2;
				p2 = p1;
				p1 = p;
	}
			else if (score > second)
			{
				third = second;
				second = score;
				p3 = p2;
				p2 = p;
			}
			else if (score > third)
			{
				third = score;
				p3 = p;
			}
			p = p.next = new stu();
		}
		System.out.printf("%d %d\n%d %d\n%d %d\n",p1.num,first,p2.num,second,p3.num,third);
	}
}

