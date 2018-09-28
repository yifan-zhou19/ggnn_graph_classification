package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] sum = new int[100];
		int b;
		int total;
		int max;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int score;
	//		int p;
	//		char leader;
	//		char w;
	//		int paper;
	//	}
	//	stu[100];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].score = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].p = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].leader = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].w = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].paper = tempVar7;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum[i] = 0;
			if (stu[i].score > 80 && stu[i].paper > 0)
			{
				sum[i] = sum[i] + 8000;
			}
			if (stu[i].score > 85)
			{
				if (stu[i].p > 80)
				{
					sum[i] = sum[i] + 4000;
				}
				if (stu[i].w == 'Y')
				{
					sum[i] = sum[i] + 1000;
				}
			}
			if (stu[i].score > 90)
			{
				sum[i] = sum[i] + 2000;
			}
			if (stu[i].leader == 'Y' && stu[i].p > 80)
			{
				sum[i] = sum[i] + 850;
			}
		}
		total = sum[0];
		max = sum[0];
		b = 0;
		for (i = 1;i < n;i++)
		{
			if (max < sum[i])
			{
				max = sum[i];
				b = i;
			}
			total = total + sum[i];
		}
		System.out.printf("%s\n%d\n%d",stu[b].name,sum[b],total);
	}
}

