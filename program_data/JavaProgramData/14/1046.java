package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//		int chinese;
	//		int math;
	//		int sum;
	//	}
	//	stu[100000],t;

			 int n;
		int i;
		int k;

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
				stu[i].num = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].chinese = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].math = tempVar4;
			}
					  stu[i].sum = stu[i].chinese + stu[i].math;
		}

			 for (k = n - 1;k > n - 4;k--)
			 {
			for (i = 0;i < k;i++)
			{
				if (stu[i].sum >= stu[i + 1].sum)
				{
					t = stu[i];
										stu[i] = stu[i + 1];
										stu[i + 1] = t;
				}
			}
			 }

			System.out.printf("%d %d\n",stu[n - 1].num,stu[n - 1].sum);
			System.out.printf("%d %d\n",stu[n - 2].num,stu[n - 2].sum);
			System.out.printf("%d %d\n",stu[n - 3].num,stu[n - 3].sum);

		return 0;
	}

}

