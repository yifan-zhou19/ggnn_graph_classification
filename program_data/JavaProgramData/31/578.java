package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct fy
	//	{
	//		char xh[100];
	//		char xm[100];
	//		char xb;
	//		int nl;
	//		float df;
	//		char dz[100];
	//		struct fy *pre;
	//	};
		fy p;
		fy node;
		int n = 1;
		for (;;)
		{
		node = new fy();
		if (n == 1)
		{
			node.pre = null;
		}
		else
		{
			node.pre = p;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			node.xh = tempVar;
		}
		if (strcmp(node.xh,"end") == 0)
		{
			break;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			node.xm = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead(" ", 1);
		if (tempVar3 != null)
		{
			node.xb = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			node.nl = tempVar4;
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			node.df = tempVar5;
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			node.dz = tempVar6;
		}
		p = node;
		n++;
		}
		for (;node.pre != null;)
		{
			node = node.pre;
			System.out.printf("%s %s %c %d %g %s\n",node.xh,node.xm,node.xb,node.nl,node.df,node.dz);
		}


	}

}

