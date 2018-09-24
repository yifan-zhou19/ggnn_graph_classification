public class stu
{
	public int a;
	public int b;
	public int c;
	public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int max;
		stu head;
		stu p1;
		stu p2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			if (i == 0)
			{
				head = p1 = p2 = new stu();
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					p1.a = Integer.parseInt(tempVar2);
				}
				String tempVar3 = ConsoleInput.scanfRead(" ");
				if (tempVar3 != null)
				{
					p1.b = Integer.parseInt(tempVar3);
				}
				String tempVar4 = ConsoleInput.scanfRead(" ");
				if (tempVar4 != null)
				{
					p1.c = Integer.parseInt(tempVar4);
				}
				head = p1;
				p2 = p1;
			}
			else
			{
				p1 = new stu();
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					p1.a = Integer.parseInt(tempVar5);
				}
				String tempVar6 = ConsoleInput.scanfRead(" ");
				if (tempVar6 != null)
				{
					p1.b = Integer.parseInt(tempVar6);
				}
				String tempVar7 = ConsoleInput.scanfRead(" ");
				if (tempVar7 != null)
				{
					p1.c = Integer.parseInt(tempVar7);
				}
				p2.next = p1;
				p2 = p1;
			}
		}
		p2.next = null;

		for (j = 0;j < 3;j++)
		{
			max = 0;
			p1 = head;
			for (i = 0;p1.next != null;i++)
			{
				if (p1.b + p1.c > max)
				{
					max = p1.b + p1.c;
				}
				p1 = p1.next;
			}
			p1 = head;
			for (i = 0;p1.next != null;i++)
			{
				if (p1.b + p1.c == max)
				{
					System.out.printf("%d %d\n",p1.a,max);
					p1.b = 0;
					p1.c = 0;
					p1 = p1.next;
					break;
				}
				else
				{
					p1 = p1.next;
				}
			}
		}
	}

}

