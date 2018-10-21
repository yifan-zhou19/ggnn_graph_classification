package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[30],gb,west;
	//		int sco1,sco2,paper,money;
	//	}
	//	stu[100];
		int n;
		int i;
		int sum = 0;
		int max = 0;
		String maxs = new String(new char[30]);
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
				stu[i].sco1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].sco2 = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].gb = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].paper = tempVar7;
			}
			stu[i].money = 0;
			if (stu[i].sco1 > 80 && stu[i].paper >= 1)
			{
				stu[i].money += 8000;
			}
			if (stu[i].sco1 > 85 && stu[i].sco2 > 80)
			{
				stu[i].money += 4000;
			}
			if (stu[i].sco1 > 90)
			{
				stu[i].money += 2000;
			}
			if (stu[i].sco1 > 85 && stu[i].west == 'Y')
			{
				stu[i].money += 1000;
			}
			if (stu[i].sco2 > 80 && stu[i].gb == 'Y')
			{
				stu[i].money += 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum += stu[i].money;
			if (stu[i].money > max)
			{
				max = stu[i].money;
				maxs = stu[i].name;
			}
		}
		System.out.printf("%s\n%ld\n%ld",maxs,max,sum);
	}
}

