package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		int a,b,c;
	//		struct stu *next;
	//		struct stu *back;
	//	};
		stu head;
		stu p1;
		stu p2;
		stu p;
		stu pmax1;
		stu pmax2;
		stu pmax3;
		int n;
		int i;
		int j;
		int max1;
		int max2;
		int max3;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		p1 = p2 = new stu();
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			p1.a = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			p1.b = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.c = tempVar4;
		}
		head = p1;
		for (i = 1;i < n;i++)
		{
			p1 = new stu();
			p2.next = p1;
			p1.back = p2;
			p2 = p1;
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				p1.a = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ");
			if (tempVar6 != null)
			{
				p1.b = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				p1.c = tempVar7;
			}
		}
		p = head;
		max1 = 0;
		for (i = 0;i < n;i++)
		{

			if (max1 < (p.b + p.c))
			{
				max1 = p.b + p.c;
				pmax1 = p;
			}
			p = p.next;
		}
		p = head;
		max2 = 0;
		for (i = 0;i < n;i++)
		{

			if (max2 < (p.b + p.c) && (p != pmax1))
			{
				max2 = p.b + p.c;
				pmax2 = p;
			}
			p = p.next;
		}
		p = head;
		max3 = 0;
		for (i = 0;i < n;i++)
		{

			if (max3 < (p.b + p.c) && (p != pmax1) && (p != pmax2))
			{
				max3 = p.b + p.c;
				pmax3 = p;
			}
			p = p.next;
		}
		System.out.printf("%ld %d\n",pmax1.a,(pmax1.b + pmax1.c));
		System.out.printf("%ld %d\n",pmax2.a,(pmax2.b + pmax2.c));
		System.out.printf("%ld %d\n",pmax3.a,(pmax3.b + pmax3.c));
		return 0;
	}
}

