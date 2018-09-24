package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int xh;
	//		int yw;
	//		int sx;
	//		int zf;
	//		struct student *next;
	//	};
		int i;
		int j;
		int k;
		int n;
		int m;
		int max;
		student p1;
		student p2;
		student head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		head = p1 = p2 = new student();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.xh = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.yw = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.sx = tempVar4;
		}
		p1.zf = p1.yw + p1.sx;
		for (i = 2;i <= n;i++)
		{
			p1 = new student();
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.xh = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.yw = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p1.sx = tempVar7;
			}
			p1.zf = p1.yw + p1.sx;
			p2.next = p1;
			p2 = p1;
			if (i == n)
			{
				p1.next = 0;
			}
		}
		p1 = head;
		for (i = 1;i <= 3;i++)
		{
			p1 = head;
			max = 0;
			for (j = 1;j <= n;j++)
			{
				max = max > p1.zf?max:p1.zf;
				p1 = p1.next;
			}
			//printf("%d\n",max);
			p1 = head;
			for (j = 1;j <= n;j++)
			{
				if (p1.zf == max)
				{
					System.out.printf("%d %d\n",p1.xh,p1.zf);
					p1.zf = 0;
					break;

				}
				p1 = p1.next;
			}
		}

	}
}

