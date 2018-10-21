package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int score;
	//		int grade;
	//		char ganbu;
	//		char west;
	//		int paper;
	//		int money;
	//	};
		int a;
		int i;
		int j;
		int n;
		int sum;
		char c;
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
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
				stu[i].grade = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(null, 1);
			if (tempVar5 != null)
			{
				c = tempVar5.charAt(0);
			}
			String tempVar6 = ConsoleInput.scanfRead(null, 1);
			if (tempVar6 != null)
			{
				stu[i].ganbu = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(null, 1);
			if (tempVar7 != null)
			{
				c = tempVar7.charAt(0);
			}
			String tempVar8 = ConsoleInput.scanfRead(null, 1);
			if (tempVar8 != null)
			{
				stu[i].west = tempVar8;
			}
			String tempVar9 = ConsoleInput.scanfRead(null, 1);
			if (tempVar9 != null)
			{
				c = tempVar9.charAt(0);
			}
			String tempVar10 = ConsoleInput.scanfRead();
			if (tempVar10 != null)
			{
				stu[i].paper = tempVar10;
			}
			stu[i].money = 0;
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (stu[i].score > 80 && stu[i].paper >= 1)
			{
				stu[i].money = stu[i].money + 8000;
			}
			if (stu[i].score > 85 && stu[i].grade > 80)
			{
				stu[i].money = stu[i].money + 4000;
			}
			if (stu[i].score > 90)
			{
				stu[i].money = stu[i].money + 2000;
			}
			if (stu[i].score > 85 && stu[i].west == 'Y')
			{
				stu[i].money = stu[i].money + 1000;
			}
			if (stu[i].grade > 80 && stu[i].ganbu == 'Y')
			{
				stu[i].money = stu[i].money + 850;
			}
		}
		j = 0;
		a = stu[0].money;
		sum = stu[0].money;
		for (i = 1;i <= n - 1;i++)
		{
			if (stu[i].money > a)
			{
				j = i;
				a = stu[i].money;
			}
			sum = sum + stu[i].money;
		}
		System.out.printf("%s\n%d\n%d\n",stu[j].name,a,sum);
	}
}

