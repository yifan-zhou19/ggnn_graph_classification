package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[30];
	//		int num1;
	//		int num2;
	//		char isstu;
	//		char iswest;
	//		int paper;
	//	}
	//	stu[100];
		int n;
		int i;
		int max;
		int all = 0;
		int[] reward = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			reward[i] = 0;
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
				stu[i].num1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].num2 = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].isstu = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].iswest = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].paper = tempVar7;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].num1 > 80 && stu[i].paper >= 1)
			{
				reward[i] = reward[i] + 8000;
			}
			if (stu[i].num1 > 85 && stu[i].num2 > 80)
			{
				reward[i] = reward[i] + 4000;
			}
			if (stu[i].num1 > 90)
			{
				reward[i] = reward[i] + 2000;
			}
			if (stu[i].num1 > 85 && stu[i].iswest == 'Y')
			{
				reward[i] = reward[i] + 1000;
			}
			if (stu[i].num2 > 80 && stu[i].isstu == 'Y')
			{
				reward[i] = reward[i] + 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			all = all + reward[i];
		}
		max = reward[0];
		for (i = 1;i < n;i++)
		{
			if (max < reward[i])
			{
				max = reward[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (max == reward[i])
			{
				break;
			}
		}
		System.out.printf("%s\n%d\n%d\n",stu[i].name,reward[i],all);
	}

}

