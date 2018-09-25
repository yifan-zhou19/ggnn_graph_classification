public class student
{
	public int num;
	public int c;
	public int m;
	public int sum;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student head;
		student p0;
		student p;
		student q;
		head = new student();
		head.next = null;
		for (i = 0;i < n;i++)
		{
			q = new student();
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				q.num = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				q.c = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				q.m = Integer.parseInt(tempVar4);
			}
			q.sum = q.c + q.m;
			q.next = null;
			p0 = head;
			p = p0.next;
			j = 0;
			while (p != null && q.sum <= p.sum)
			{
				p0 = p;
				p = p.next;
				j++;
				if (j > 3)
				{
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
					goto A;
				}
			}
			p0.next = q;
			q.next = p;
//C++ TO JAVA CONVERTER TODO TASK: There are no gotos or labels in Java:
	A:
	continue;
		}
		p = head.next;
		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",p.num,p.sum);
			p = p.next;
		}
	}
}

