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
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		char xh[100];
	//		char xm[100];
	//		char xb;
	//		int nl;
	//		float df;
	//		char dz[100];
	//		struct stu *af;
	//		struct stu *bf;
	//	};
		stu p1;
		stu p2;
		stu head;
		head = p2 = p1 = new stu();
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p1.xh = tempVar;
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			p1.xm = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			p1.xb = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			p1.nl = tempVar4;
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			p1.df = tempVar5;
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			p1.dz = tempVar6;
		}
		p1.bf = 0;
		for (i = 1;;i++)
		{
			p1 = new stu();
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				p1.xh = tempVar7;
			}
			if (strcmp(p1.xh,"end") == 0)
			{
				head = p2;
				break;
			}
			String tempVar8 = ConsoleInput.scanfRead();
			if (tempVar8 != null)
			{
				p1.xm = tempVar8;
			}
			String tempVar9 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar9 != null)
			{
				p1.xb = tempVar9;
			}
			String tempVar10 = ConsoleInput.scanfRead(" ");
			if (tempVar10 != null)
			{
				p1.nl = tempVar10;
			}
			String tempVar11 = ConsoleInput.scanfRead(" ");
			if (tempVar11 != null)
			{
				p1.df = tempVar11;
			}
			String tempVar12 = ConsoleInput.scanfRead(" ");
			if (tempVar12 != null)
			{
				p1.dz = tempVar12;
			}
			p2.af = p1;
			p1.bf = p2;
			p2 = p1;
		}
		p1 = head;
		for (j = 0;j < i;j++)
		{
			System.out.printf("%s %s %c %d %g %s\n",p1.xh,p1.xm,p1.xb,p1.nl,p1.df,p1.dz);
			p1 = p1.bf;
		}
	}
}

