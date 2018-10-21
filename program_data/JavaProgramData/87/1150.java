package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct ti
	//	{
	//		int h1,f1,m1,h2,f2,m2;
	//	}
	//	a;
		int i;
		int j;
		int k;
		int e;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a.h1 = tempVar;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a.f1 = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a.m1 = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a.h2 = tempVar4;
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			a.f2 = tempVar5;
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			a.m2 = tempVar6;
		}
		while (true)
		{
			if (a.h1 == 0 && a.f1 == 0 && a.m1 == 0 && a.h2 == 0 && a.f2 == 0 && a.m2 == 0)
			{
				break;
			}
			sum = (a.h2 + 12 - a.h1) * 3600 + (a.f2 - a.f1) * 60 + a.m2 - a.m1;
			System.out.printf("%d\n",sum);
			   String tempVar7 = ConsoleInput.scanfRead();
			   if (tempVar7 != null)
			   {
				   a.h1 = tempVar7;
			   }
			   String tempVar8 = ConsoleInput.scanfRead();
			   if (tempVar8 != null)
			   {
				   a.f1 = tempVar8;
			   }
			   String tempVar9 = ConsoleInput.scanfRead();
			   if (tempVar9 != null)
			   {
				   a.m1 = tempVar9;
			   }
			   String tempVar10 = ConsoleInput.scanfRead();
			   if (tempVar10 != null)
			   {
				   a.h2 = tempVar10;
			   }
			   String tempVar11 = ConsoleInput.scanfRead();
			   if (tempVar11 != null)
			   {
				   a.f2 = tempVar11;
			   }
			   String tempVar12 = ConsoleInput.scanfRead();
			   if (tempVar12 != null)
			   {
				   a.m2 = tempVar12;
			   }
		}
	return 0;
	}

}

