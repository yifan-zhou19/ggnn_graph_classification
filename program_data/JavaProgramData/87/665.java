package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n = 0;
		int s;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct sd
	//	{
	//		int a,b,c,d,e,f;
	//	}
	//	sj[100];
		for (n = 0;;n++)
		{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			(sj[n].a) = tempVar;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(sj[n].b) = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			(sj[n].c) = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			(sj[n].d) = tempVar4;
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			(sj[n].e) = tempVar5;
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			(sj[n].f) = tempVar6;
		}
		if (sj[n].a == 0)
		{
				break;
		}
		else
		{
		sj[n].d = sj[n].d + 11;
		sj[n].e = sj[n].e+59;
		sj[n].f = sj[n].f + 60;
		s = 3600 * (sj[n].d - sj[n].a) + 60 * (sj[n].e - sj[n].b) + sj[n].f - sj[n].c;
		System.out.printf("%d\n",s);
		}
		}
		return 0;
	}

}

