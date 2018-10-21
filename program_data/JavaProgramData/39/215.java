package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		char name[20];
	//		int final;
	//		int argue;
	//		char leader;
	//		char west;
	//		int art;
	//	}
	//	stu[100];
		stu term = new stu();
		int n;
		int i;
		int[] sum = new int[100];
		int t = 0;
		int m;
		int j;
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				stu[i].final = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].argue = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].leader = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].west = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].art = tempVar7;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (stu[i].final > 80 && stu[i].art >= 1)
			{
				sum[i] = sum[i] + 8000;
			}
			if (stu[i].final > 85 && stu[i].argue > 80)
			{
				sum[i] = sum[i] + 4000;
			}
			if (stu[i].final > 90)
			{
				sum[i] = sum[i] + 2000;
			}
			if (stu[i].final > 85 && stu[i].west == 'Y')
			{
				sum[i] = sum[i] + 1000;
			}
			if (stu[i].argue > 80 && stu[i].leader == 'Y')
			{
				sum[i] = sum[i] + 850;
			}
		}
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - 1 - i;j++)
			{
				if (sum[j] < sum[j + 1])
				{
					term = stu[j];
					stu[j] = stu[j + 1];
					stu[j + 1] = term;
					m = sum[j];
					sum[j] = sum[j + 1];
					sum[j + 1] = m;

				}
			}
		}
				for (i = 0;i <= n - 1;i++)
				{
					t = t + sum[i];
				}
				System.out.printf("%s\n",stu[0].name);
				System.out.printf("%d\n",sum[0]);
				System.out.printf("%d\n",t);
	}



}

