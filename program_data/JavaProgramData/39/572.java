package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[100];
		int i;
		int j;
		int n;
		int sum = 0;
		int p;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char name[20];
	//		int qimo;
	//		int banpin;
	//		char ganbu;
	//		char pro;
	//		int pap;
	//	}
	//	stu[101];
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
				stu[i].qimo = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				stu[i].banpin = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].ganbu = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].pro = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				stu[i].pap = tempVar7;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].qimo > 80 && stu[i].pap >= 1)
			{
				a[i] = a[i] + 8000;
			}
			if (stu[i].qimo > 85 && stu[i].banpin > 80)
			{
				a[i] = a[i] + 4000;
			}
			if (stu[i].qimo > 90)
			{
				a[i] = a[i] + 2000;
			}
			if (stu[i].qimo > 85 && stu[i].pro == 'Y')
			{
				a[i] = a[i] + 1000;
			}
			if (stu[i].banpin > 80 && stu[i].ganbu == 'Y')
			{
				a[i] = a[i] + 850;
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = sum + a[i];
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (a[j] < a[j + 1])
				{
					p = a[j + 1];
					a[j + 1] = a[j];
					a[j] = p;

					stu[100] = stu[j + 1];
					stu[j + 1] = stu[j];
					stu[j] = stu[100];
				}
			}
		}
		System.out.printf("%s\n%d\n%d\n",stu[0].name,a[0],sum);
	}

}

