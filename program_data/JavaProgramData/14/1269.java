package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int m;
		int n;
		int max;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		int xh;
	//		int yw;
	//		int sx;
	//		int zf;
	//		struct stu *next;
	//	};
		stu p1;
		stu p2;
		stu head;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p2 = head = p1 = new stu();
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
		for (i = 1;i < n;i++)
		{
			p1 = new stu();
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
		}
		for (j = 0;j < 3;j++)
		{
			p1 = head;
			max = 0;
			for (i = 0;i < n;i++)
			{
				max = max > p1.zf?max:p1.zf;
				p1 = p1.next;
			}
			p1 = head;
			for (i = 0;i < n;i++)
			{
				if (max == p1.zf)
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

