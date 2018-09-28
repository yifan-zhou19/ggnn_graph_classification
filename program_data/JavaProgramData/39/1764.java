package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[21];
	//	int score1;
	//	int score2;
	//	char q1;
	//	char q2;
	//	int paper;
	//	};
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(101);
		//struct student*p;
		int p;
		int n;
		int i;
		int[] money = new int[101];
		int max = 0;
		int sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (p = 0;p < n;p++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(stu[p].name) = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(stu[p].score1) = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				(stu[p].score2) = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				(stu[p].q1) = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				(stu[p].q2) = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				(stu[p].paper) = tempVar7;
			}
		}
		for (i = 0;i < n;i++)
		{
			money[i] = 0;
		}
		i = 0;
		for (p = 0;p < n;p++)
		{
			if (stu[p].score1 > 80 && stu[p].paper > 0)
			{
				money[i] += 8000;
			}
		if (stu[p].score1 > 85 && stu[p].score2 > 80)
		{
			money[i] += 4000;
		}
		if (stu[p].score1 > 90)
		{
			money[i] += 2000;
		}
		if (stu[p].score1 > 85 && stu[p].q2 == 'Y')
		{
			money[i] += 1000;
		}
		if (stu[p].score2 > 80 && stu[p].q1 == 'Y')
		{
			money[i] += 850;
		}
		if (money[i] > money[max])
		{
			max = i;
		}
		sum += money[i];
		i++;
		}
		System.out.printf("%s\n%d\n%d",stu[max].name,money[max],sum);

	}
}

