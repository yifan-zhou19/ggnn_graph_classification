package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num;
	//	 int chi;
	//	 int math;
	//	}
	//	stu[100000];

		int n;
		int i;
		int j;
		int mid;

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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].chi = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].math = tempVar4;
			}
		}

		for (i = 0;i < 3;i++)
		{
			for (j = n - 1;j > 0;j--)
			{
				if (stu[j].math + stu[j].chi > stu[j - 1].chi + stu[j - 1].math)
				{
					mid = stu[j].num;
					stu[j].num = stu[j - 1].num;
					stu[j - 1].num = mid;

					mid = stu[j].chi;
					stu[j].chi = stu[j - 1].chi;
					stu[j - 1].chi = mid;

					mid = stu[j].math;
					stu[j].math = stu[j - 1].math;
					stu[j - 1].math = mid;
				}
			}
		}

		for (i = 0;i < 3;i++)
		{
			System.out.printf("%d %d\n",stu[i].num,stu[i].math + stu[i].chi);
		}

		return 0;
	}

}

