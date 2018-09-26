package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		char s[50],c,d;
	//		int a,b,e,m;
	//	}
	//	stu[500];
		int n;
		int i;
		int max = 0;
		int all = 0;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			stu[i].m = 0;
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].s = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].a = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].b = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].c = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].d = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].e = tempVar7;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].a > 80 && stu[i].e > 0)
			{
				stu[i].m = stu[i].m + 8000;
			}
			if (stu[i].a > 85 && stu[i].b > 80)
			{
				stu[i].m = stu[i].m + 4000;
			}
			if (stu[i].a > 90)
			{
				stu[i].m = stu[i].m + 2000;
			}
			if (stu[i].a > 85 && stu[i].d == 'Y')
			{
				stu[i].m = stu[i].m + 1000;
			}
			if (stu[i].b > 80 && stu[i].c == 'Y')
			{
				stu[i].m = stu[i].m + 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			all = all + stu[i].m;
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].m > max)
			{
				max = stu[i].m;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].m == max)
			{
				System.out.printf("%s\n%d\n",stu[i].s,stu[i].m);
				max = -1;
			}

		}
		System.out.printf("%d\n",all);
	}

















}

