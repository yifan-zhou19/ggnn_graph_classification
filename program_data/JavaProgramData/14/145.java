package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		int num,sum;
	//	}
	//	stu[100000];
		int n;
		int i;
		int j;
		int t;
		int chi;
		int math;
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
				chi = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				math = Integer.parseInt(tempVar4);
			}
			stu[i].sum = chi + math;
		}
		for (i = 0;i < 3;i++)
		{
			for (j = n - 1;j > i;j--)
			{
				if (stu[j].sum > stu[j - 1].sum)
				{
					t = stu[j].sum;
					stu[j].sum = stu[j - 1].sum;
					stu[j - 1].sum = t;
					t = stu[j].num;
					stu[j].num = stu[j - 1].num;
					stu[j - 1].num = t;
				}
			}
		}
		System.out.printf("%d %d\n",stu[0].num,stu[0].sum);
		System.out.printf("%d %d\n",stu[1].num,stu[1].sum);
		System.out.printf("%d %d",stu[2].num,stu[2].sum);
	}

}

