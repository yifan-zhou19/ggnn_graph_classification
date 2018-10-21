package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int sut = 0;
		int sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char na[21];
	//		int sc;
	//		int op;
	//		char ga;
	//		char we;
	//		int nu;
	//		int su;
	//	}
	//	stu[100];
		for (i = 0;i < 100;i++)
		{
			stu[i].su = 0;
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].na = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].sc = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].op = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(null, 1);
			if (tempVar5 != null)
			{
				stu[i].ga = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(null, 1);
			if (tempVar6 != null)
			{
				stu[i].we = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].nu = tempVar7;
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((stu[i].sc > 80) && (stu[i].nu > 0))
			{
				stu[i].su += 8000;
			}
			if ((stu[i].sc > 85) && (stu[i].op > 80))
			{
				stu[i].su += 4000;
			}
			if (stu[i].sc > 90)
			{
				stu[i].su += 2000;
			}
			if ((stu[i].sc > 85) && (stu[i].we == 'Y'))
			{
				stu[i].su += 1000;
			}
			if ((stu[i].op > 80) && (stu[i].ga == 'Y'))
			{
				stu[i].su += 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sut < stu[i].su)
			{
				k = i;
				sut = stu[i].su;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum += stu[i].su;
		}
		System.out.printf("%s\n%d\n%d\n",stu[k].na,sut,sum);
	}
}

