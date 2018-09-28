package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int sum;
		int max;
		int k;
		int total = 0;
		int[] t = new int[100];
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[40];
	//		int grade1;
	//		int grade2;
	//		char monitor;
	//		char western;
	//		int num;
	//	};
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(100);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					stu[i].name = tempVar2;
				}
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					stu[i].grade1 = tempVar3;
				}
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					stu[i].grade2 = tempVar4;
				}
				String tempVar5 = ConsoleInput.scanfRead();
				if (tempVar5 != null)
				{
					stu[i].monitor = tempVar5;
				}
				String tempVar6 = ConsoleInput.scanfRead();
				if (tempVar6 != null)
				{
					stu[i].western = tempVar6;
				}
				String tempVar7 = ConsoleInput.scanfRead();
				if (tempVar7 != null)
				{
					stu[i].num = tempVar7;
				}
		}

		for (i = 0;i < N;i++)
		{
			sum = 0;
			if (stu[i].grade1 > 80 && stu[i].num >= 1)
			{
				sum += 8000;
			}
			if (stu[i].grade1 > 85 && stu[i].grade2 > 80)
			{
				sum += 4000;
			}
			if (stu[i].grade1 > 90)
			{
				sum += 2000;
			}
			if (stu[i].grade1 > 85 && stu[i].western == 'Y')
			{
				sum += 1000;
			}
			if (stu[i].grade2 > 80 && stu[i].monitor == 'Y')
			{
				sum += 850;
			}
			t[i] = sum;
		}
		max = 0;
		for (i = 0;i < N;i++)
		{
			if (t[i] > max)
			{
				max = t[i];
				k = i;
			}
		}
		for (i = 0;i < N;i++)
		{
			total += t[i];
		}
		System.out.printf("%s\n%d\n%d\n",stu[k].name,max,total);
		return 0;
	}
}

