package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct point
	//	{
	//		int a,b,c,d,e,f;
	//	}
	//	sz[100];
		int i = 0;
		int count = 0;
		for (i = 0;i < 100;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				sz[i].a = tempVar;
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i].b = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i].c = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				sz[i].d = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead();
			if (tempVar5 != null)
			{
				sz[i].e = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead();
			if (tempVar6 != null)
			{
				sz[i].f = tempVar6;
			}
			count++;
			if (sz[i].a == 0 && sz[i].b == 0 && sz[i].c == 0 && sz[i].d == 0 && sz[i].e == 0 && sz[i].f == 0)
			{
				break;
			}
		}

		int[] xsz = new int[100];
		for (i = 0;i < count - 1;i++)
		{
			xsz[i] = (12 - sz[i].a - 1) * 3600 + (60 - sz[i].b - 1) * 60 + (60 - sz[i].c) + 3600 * sz[i].d + 60 * sz[i].e + sz[i].f;
		}
		for (i = 0;i < count - 1;i++)
		{
			System.out.printf("%d\n",xsz[i]);
		}



		return 0;
	}


}

