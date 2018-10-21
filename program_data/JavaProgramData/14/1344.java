package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//		int score_1;
	//		int score_2;
	//		int sum;
	//	};
		student[] stu = tangible.Arrays.initializeWithDefaultstudentInstances(n);
		int i;
		int j;
		int t;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				stu[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].score_1 = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].score_2 = tempVar4;
			}
			stu[i].sum = stu[i].score_1 + stu[i].score_2;
		}
		for (j = 0;j <= 2;j++)
		{
			for (i = n - 1;i > 0 + j;i--)
			{
			if (stu[i].sum > stu[i - 1].sum)
			{
				t = stu[i].sum,stu[i].sum = stu[i - 1].sum,stu[i - 1].sum = t;
				t = stu[i].num,stu[i].num = stu[i - 1].num,stu[i - 1].num = t;
			}
			}
		}
		for (i = 0;i <= 2;i++)
		{
		System.out.printf("%d %d\n",stu[i].num,stu[i].sum);
		}
	}
}

