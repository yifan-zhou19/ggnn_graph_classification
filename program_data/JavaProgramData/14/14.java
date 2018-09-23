public class stu
{
	public int num;
public int y;
public int s;
public int t;
public stu next;
}

package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		stu head;
		stu p1;
		stu p2;
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p2 = (stu)malloc(L);
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.num = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.y = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.s = Integer.parseInt(tempVar4);
		}
		head = p1;
		for (i = 1;i < n;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
			p1 = (stu) malloc(L);
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.num = Integer.parseInt(tempVar5);
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.y = Integer.parseInt(tempVar6);
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p1.s = Integer.parseInt(tempVar7);
			}
			p1.t = p1.y + p1.s;
			p2.next = p1;
			p2 = p1;
		}
		p2.next = null;
		int k = 0;
		while (k < 3)
		{
			p2 = head;
			for (;p2 != 0;p2 = p2.next)
			{
				for (p1 = p2.next;p1 != 0;)
				{
					if (p2.t < p1.t)
					{
						break;
					}
					 else
					 {
						 p1 = p1.next;
					 }
				}
				if (p1 == 0)
				{
					System.out.printf("%ld %d\n",p2.num,p2.t);
					break;
				}
			}
			k = k + 1;
			p2.t = 0;
		}
	}
}

