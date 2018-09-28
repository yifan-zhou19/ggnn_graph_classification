package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct scholar
	//	{
	//		   char z[21];
	//		   int qm;
	//		   int bj;
	//		   char gb;
	//		   char xb;
	//		   int paper;
	//		   int total;
	//		   };

			   scholar[] a = tangible.Arrays.initializeWithDefaultscholarInstances(1000);

		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i].z = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].qm = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].bj = tempVar4;
			}
			String tempVar5 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar5 != null)
			{
				a[i].gb = tempVar5;
			}
			String tempVar6 = ConsoleInput.scanfRead(" ", 1);
			if (tempVar6 != null)
			{
				a[i].xb = tempVar6;
			}
			String tempVar7 = ConsoleInput.scanfRead(" ");
			if (tempVar7 != null)
			{
				a[i].paper = tempVar7;
			}
			a[i].total = 0;
		}

		for (i = 0; i < n; i++)
		{
			if (a[i].qm > 80 && a[i].paper > 0)
			{
			a[i].total += 8000;
			}
			if (a[i].qm > 85 && a[i].bj > 80)
			{
			a[i].total += 4000;
			}
			if (a[i].qm > 90)
			{
			a[i].total += 2000;
			}
			if (a[i].qm > 85 && a[i].xb == 'Y')
			{
			a[i].total += 1000;
			}
			if (a[i].bj > 80 && a[i].gb == 'Y')
			{
			a[i].total += 850;
			}
		}

			int max = 0;
			String name = new String(new char[22]);
			int total = 0;

		for (i = 0; i < n; i++)
		{
			if (a[i].total > max)
			{
								max = a[i].total;
								name = a[i].z;
			}
			total += a[i].total;
		}

		System.out.printf("%s\n%d\n%d\n", name, max, total);


		return 0;

	}
}

