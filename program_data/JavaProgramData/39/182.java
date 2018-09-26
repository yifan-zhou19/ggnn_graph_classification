package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char s[20];
	//		 int m1;
	//		 int m2;
	//		char c1;
	//		char c2;
	//		int n;
	//		int t;
	//	}
	//	stu[100],tr;

		int i;
		int j;
		int m;
		int t1 = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].s = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].m1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].m2 = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].c1 = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].c2 = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].n = tempVar7;
			}
			stu[i].t = 0;
			if (stu[i].m1 > 80 && stu[i].n > 0)
			{
				stu[i].t += 8000;
			}
			if (stu[i].m1 > 85 && stu[i].m2 > 80)
			{
				stu[i].t += 4000;
			}
			if (stu[i].m1 > 90)
			{
				stu[i].t += 2000;
			}
			if (stu[i].m2 > 80 && stu[i].c1 == 'Y')
			{
				stu[i].t += 850;
			}
			if (stu[i].m1 > 85 && stu[i].c2 == 'Y')
			{
				stu[i].t += 1000;
			}
		}
		for (i = 0;i < m - 1;i++)
		{
			for (j = i + 1;j < m;j++)
			{
			if (stu[i].t < stu[j].t)
			{
				tr = stu[i];
				stu[i] = stu[j];
				stu[j] = tr;
			}
			}
		}

		for (i = 0;i < m;i++)
		{
		  t1 += stu[i].t;
		}
		System.out.printf("%s\n%d\n%d\n",stu[0].s,stu[0].t,t1);
	}




}

