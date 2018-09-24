package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int i;
		int k;
		 float sumz = 0F;
		 float max;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct student
	//	{
	//		char a[20];
	//	int b;
	//	int c;
	//	char d;
	//	char e;
	//	int f;
	//	float sum;
	//	};
		student[] num = tangible.Arrays.initializeWithDefaultstudentInstances(100);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				num[i].a = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				num[i].b = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				num[i].c = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				num[i].d = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				num[i].e = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead();
			if (tempVar7 != null)
			{
				num[i].f = tempVar7;
			}
			num[i].sum = 0;
		}

		for (i = 0;i < m;i++)
		{
			if ((num[i].b > 80) && (num[i].f >= 1))
			{
				num[i].sum = num[i].sum + 8000;
			}
			if ((num[i].b > 85) && (num[i].c > 80))
			{
				num[i].sum = num[i].sum + 4000;
			}
			if ((num[i].b > 90))
			{
				num[i].sum = num[i].sum + 2000;
			}
			if ((num[i].b > 85) && (num[i].e == 'Y'))
			{
				num[i].sum = num[i].sum + 1000;
			}
			if ((num[i].c > 80) && (num[i].d == 'Y'))
			{
				num[i].sum = num[i].sum + 850;
			}
		}

		max = num[m - 1].sum;
		k = m - 1;
		for (i = m - 1;i >= 0;i--)
		{
			if (num[i].sum >= max)
			{
				max = num[i].sum;
				k = i;
			}
		}
		for (i = 0;i < m;i++)
		{
			sumz = sumz + num[i].sum;
		}
		System.out.printf("%s\n%.0f\n%.0f\n",num[k].a,num[k].sum,sumz);



	}

}

