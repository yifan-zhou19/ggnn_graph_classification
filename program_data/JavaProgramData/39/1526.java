package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[50];
	//		int score1;
	//		int score2;
	//		char master;
	//		char west;
	//		int paper;
	//	};
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
		int i;
		int n;
		int[] sum = new int[100];
		int total;
		int max;
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
				stu[i].score1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].score2 = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].master = tempVar5;
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
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].score1 > 80 && stu[i].paper > 0)
			{
				sum[i] = sum[i] + 8000;
			}
			if (stu[i].score1 > 85 && stu[i].score2 > 80)
			{
				sum[i] = sum[i] + 4000;
			}
			if (stu[i].score1 > 90)
			{
				sum[i] = sum[i] + 2000;
			}
			if (stu[i].score1 > 85 && stu[i].west == 89)
			{
				sum[i] = sum[i] + 1000;
			}
			if (stu[i].score2 > 80 && stu[i].master == 89)
			{
				sum[i] = sum[i] + 850;
			}
		}
		for (i = 0,max = sum[0],total = 0;i < n;i++)
		{
			if (sum[i] >= max)
			{
				max = sum[i];
			}
			total += sum[i];
		}
		for (i = 0;i < n;i++)
		{
			if (sum[i] == max)
			{
				System.out.printf("%s\n",stu[i].name);
				break;
			}
		}
		System.out.printf("%d\n",max);
		System.out.printf("%d\n",total);
	}
}

