package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		char name[21];
	//	int ta;
	//	int ca;
	//	char l;
	//	char w;
	//	int p;
	//	char name0[21];
	//	}
	//	stu[101],temp;
		int[] sch = new int[101];
		int a;
		int n;
		int i;
		int j;
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
				stu[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].ta = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].ca = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].l = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].w = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].p = tempVar7;
			}
		}
		for (i = 0;i < n;i++)
		{
			sch[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].ta > 80 && stu[i].p >= 1)
			{
				sch[i] = sch[i] + 8000;
			}
			if (stu[i].ta > 85 && stu[i].ca > 80)
			{
				  sch[i] = sch[i] + 4000;
			}
			if (stu[i].ta > 90)
			{
				sch[i] = sch[i] + 2000;
			}
			if (stu[i].ta > 85 && stu[i].w == 'Y')
			{
				sch[i] = sch[i] + 1000;
			}
			if (stu[i].ca > 80 && stu[i].l == 'Y')
			{
				sch[i] = sch[i] + 850;
			}
		}
		for (i = 1;i < n;i++)
		{
			if (sch[0] < sch[i])
			{
				a = sch[i];
				sch[i] = sch[0];
				sch[0] = a;
				temp = stu[i];
				stu[i] = stu[0];
				stu[0] = temp;
			}
		}
		for (i = 0,j = 0;i < n;i++)
		{
			j = j + sch[i];
		}

		System.out.printf("%s\n",stu[0].name);
		System.out.printf("%d\n",sch[0]);
		System.out.printf("%d\n",j);
	}


}

