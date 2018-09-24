package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct Student
	//	{
	//		char name[50];
	//		int cj,py,lw,sum;
	//		char gb,xb;
	//	}
	//	stu[100],temp;

		int n;
		int i;
		int sum = 0;
		int j;
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
				stu[i].name = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				stu[i].cj = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].py = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].gb = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].xb = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].lw = tempVar7;
			}
		}
		for (i = 0;i < n;i++)
		{
			stu[i].sum = 0;
			if (stu[i].cj > 80 && stu[i].lw >= 1)
			{
				stu[i].sum += 8000;
			}
			if (stu[i].py > 80 && stu[i].gb == 'Y')
			{
				stu[i].sum += 850;
			}
			if (stu[i].cj > 85 && stu[i].py > 80)
			{
				stu[i].sum += 4000;
			}
			if (stu[i].cj > 85 && stu[i].xb == 'Y')
			{
				stu[i].sum += 1000;
			}
			if (stu[i].cj > 90)
			{
				stu[i].sum += 2000;
			}
		}

		for (i = 0;i < n;i++)
		{
			sum += stu[i].sum;
		}

		for (i = 0;i < n;i++)
		{
			for (j = i + 1;j < n;j++)
			{
				if (stu[j].sum > stu[i].sum)
				{
					temp = stu[j];
					for (k = j;k > i;k--)
					{
						stu[k] = stu[k - 1];
					}
					stu[i] = temp;
				}
			}
		}
		System.out.printf("%s\n%d\n%d",stu[0].name,stu[0].sum,sum);
		return 0;
	}

}

