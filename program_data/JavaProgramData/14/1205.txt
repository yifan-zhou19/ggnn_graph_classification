public class student
{
	public int num;
	public int chi;
	public int mat;
	public int all;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		student head;
		student p1;
		student p2;
		student p;
		int n;
		int i;
		int j;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			p1.chi = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			p1.mat = Integer.parseInt(tempVar4);
		}
		p1.all = p1.chi + p1.mat;
		head = p1;
		for (i = 1;i < n;i++)
		{
			if (i > 1)
			{
				p2.next = p1;
			}
			p2 = p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (student)malloc(LEN);
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.num = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				p1.chi = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.mat = Integer.parseInt(tempVar7);
			}
			p1.all = p1.chi + p1.mat;
		}
		p2.next = null;
		for (j = 0;j < 3;j++)
		{
			p = p1 = head;
			max = p.all;
			while (p.next != null)
			{
				p2 = p;
				p = p.next;
				if (p.all > max)
				{
					max = p.all;
					p1 = p2;
				}
			}
			System.out.printf("%d %d\n",p1.next.num,p1.next.all);
			if (max == head.all)
			{
				head = head.next;
			}
			else
			{
				p1.next = (p1.next).next;
			}
		}
	}
}

