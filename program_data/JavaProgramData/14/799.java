public class student
{
	public int id;
	public int cs;
	public int ms;
	public int s;
	public student next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		student head;
		student p1;
		student p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (student)malloc(LEN);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.id = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.cs = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.ms = Integer.parseInt(tempVar4);
		}
		p1.s = p1.cs + p1.ms;
		head = null;
		while (p1.id != n)
		{
			m = m + 1;
			if (m == 1)
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
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.id = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.cs = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p1.ms = Integer.parseInt(tempVar7);
			}
			p1.s = p1.cs + p1.ms;
		}
		p2.next = null;
		for (i = 0;i < 3;i++)
		{
			p1 = p2 = head;
			do
			{
				p2 = p2.next;
				if (p1.s < p2.s)
				{
					p1 = p2;
				}
			}while (p2.next != null);
			System.out.printf("%d %d\n",p1.id,p1.s);
			p1.s = -1;
		}
	}
}

