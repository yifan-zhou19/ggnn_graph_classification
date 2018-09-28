package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int p = 0;
		int sum = 0;
		int q;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[200];
	//		int c1, c2, wx, wa;
	//		char bg, xb;
	//	}
	//	stu[101];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0 ; i <= n - 1; i++)
		{
			stu[i].wa = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].c1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].c2 = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].bg = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xb = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].wx = tempVar7;
			}
	//			printf("%s %d %d %c %c %d\n", stu[i].name , stu[i].c1 , stu[i].c2 ,  stu[i].bg , stu[i].xb , stu[i].wx);
			if (stu[i].c1 > 80 && stu[i].wx != 0)
			{
				stu[i].wa = stu[i].wa + 8000;
			}
			if (stu[i].c1 > 85 && stu[i].c2 > 80)
			{
				stu[i].wa = stu[i].wa + 4000;
			}
			if (stu[i].c1 > 90)
			{
				stu[i].wa = stu[i].wa + 2000;
			}
			if (stu[i].c1 > 85 && stu[i].xb == 'Y')
			{
				stu[i].wa = stu[i].wa + 1000;
			}
			if (stu[i].c2 > 80 && stu[i].bg == 'Y')
			{
				stu[i].wa = stu[i].wa + 850;
			}
			if (stu[i].wa > p)
			{
				p = stu[i].wa;
				q = i;
			}
			sum = sum + stu[i].wa;
	//			printf("wa%d\n %d\n" , stu[i].wa , q);
		}
		System.out.printf("%s\n%d\n%d\n", stu[q].name, stu[q].wa, sum);

		return (0);

	}
}

