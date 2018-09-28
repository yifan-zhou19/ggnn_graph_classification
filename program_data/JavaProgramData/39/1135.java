package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int s;
		int total = 0;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct
	//	{
	//		char name[21];
	//	 int ave;
	//	 int mar;
	//	 int es;
	//	 char a;
	//	 char b;
	//	 int sum;
	//	}
	//	stu[100];
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
				stu[i].ave = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				stu[i].mar = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				stu[i].a = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				stu[i].b = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				stu[i].es = tempVar7;
			}
		}

		for (i = 0;i < n;i++)
		{
			stu[i].sum = 0;
			if (stu[i].ave > 80 && stu[i].es > 0)
			{
				stu[i].sum += 8000;
			}
			if (stu[i].ave > 85 && stu[i].mar > 80)
			{
				stu[i].sum += 4000;
			}
			if (stu[i].ave > 90)
			{
				stu[i].sum += 2000;
			}
			if (stu[i].ave > 85 && stu[i].b == 'Y')
			{
				stu[i].sum += 1000;
			}
			if (stu[i].mar > 80 && stu[i].a == 'Y')
			{
				stu[i].sum += 850;
			}
			total += stu[i].sum;
		}
		s = stu[0].sum;
		for (i = 1;i < n;i++)
		{
			if (stu[i].sum > s)
			{
				s = stu[i].sum;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (stu[i].sum == s)
			{
				System.out.printf("%s\n%d\n", stu[i].name, stu[i].sum);
				break;
			}
		}
		System.out.printf("%d", total);
		return 0;
	}

}

