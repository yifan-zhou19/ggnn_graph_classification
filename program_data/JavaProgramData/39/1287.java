package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		int b = 0;
		int sum = 0;
		int max;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[21];
	//		int mc;
	//		int bc;
	//		char bg;
	//		char xb;
	//		int lw;
	//		int sch;
	//	}
	//	stu[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			stu[i].sch = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].mc = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].bc = tempVar4;
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
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].lw = tempVar7;
			}
			if (stu[i].mc > 80 && stu[i].lw > 0)
			{
				stu[i].sch = 8000;
				sum += 8000;
			}
			if (stu[i].mc > 85 && stu[i].bc > 80)
			{
				stu[i].sch += 4000;
				sum += 4000;
			}
			if (stu[i].mc > 90)
			{
				stu[i].sch += 2000;
				sum += 2000;
			}
			if (stu[i].mc > 85 && stu[i].xb == 'Y')
			{
				stu[i].sch += 1000;
				sum += 1000;
			}
			if (stu[i].bc > 80 && stu[i].bg == 'Y')
			{
				stu[i].sch += 850;
				sum += 850;
			}
		}
		max = stu[0].sch;
		for (i = 0;i < n;i++)
		{
			if (max < stu[i].sch)
			{
				max = stu[i].sch;
				b = i;
			}
		}
		System.out.printf("%s\n%d\n%d\n",stu[b].name,stu[b].sch,sum);
	}
}

