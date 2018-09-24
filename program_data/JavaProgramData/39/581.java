package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int max = 0;
		int k = 0;
		int sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int qm;
	//		int bj;
	//		char gb;
	//		char xb;
	//		int lw;
	//		int money;
	//	}
	//	stu[100]={0};
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
				stu[i].qm = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].bj = tempVar4;
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
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].lw = tempVar7;
			}
		}

		for (i = 0;i < n;i++)
		{
			if (stu[i].qm > 80 && stu[i].lw > 0)
			{
				a = 8000;
			}
			if (stu[i].qm > 85 && stu[i].bj > 80)
			{
				b = 4000;
			}
			if (stu[i].qm > 90)
			{
				c = 2000;
			}
			if (stu[i].qm > 85 && stu[i].xb == 'Y')
			{
				d = 1000;
			}
			if (stu[i].bj > 80 && stu[i].gb == 'Y')
			{
				e = 850;
			}
			stu[i].money = a + b + c + d + e;
			a = b = c = d = e = 0;
		}
		max = stu[0].money;
		for (i = 0;i < n;i++)
		{
			if (stu[i].money > max)
			{
				max = stu[i].money;
				  k = i;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + stu[i].money;
		}
		System.out.printf("%s\n",stu[k].name);
		System.out.printf("%d\n",stu[k].money);
		System.out.printf("%d",sum);
	}


}

