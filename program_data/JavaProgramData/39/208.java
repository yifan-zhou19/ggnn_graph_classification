package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//	char name[100];
	//	int marka;
	//	int markb;
	//	char ganbu;
	//	char xibu;
	//	int c;
	//	}
	//	stu[100];
		int n;
		int i;
		int j;
		int max;
		int sum = 0;
		int[] money = new int[100];
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
				stu[i].marka = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].markb = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].ganbu = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xibu = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].c = tempVar7;
			}

		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].marka > 80 && stu[i].c > 0)
			{
				money[i] = money[i] + 8000;
			}
			if (stu[i].marka > 85 && stu[i].markb > 80)
			{
				money[i] = money[i] + 4000;
			}
			if (stu[i].marka > 90)
			{
				money[i] = money[i] + 2000;
			}
			if (stu[i].marka > 85 && stu[i].xibu == 'Y')
			{
				money[i] = money[i] + 1000;
			}
			if (stu[i].markb > 80 && stu[i].ganbu == 'Y')
			{
				money[i] = money[i] + 850;
			}
		}
		max = 0;
		for (i = 1;i < n;i++)
		{
			if (money[i] > money[max])
			{
				max = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + money[i];
		}
		System.out.printf("%s\n",stu[max].name);
		System.out.printf("%d\n",money[max]);
		System.out.printf("%d\n",sum);










	}
}

