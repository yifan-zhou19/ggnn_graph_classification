package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;

//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct stu
	//	{
	//		   int id;
	//		   int chn;
	//		   int math;
	//		   int total;
	//		   };
		stu[] a = tangible.Arrays.initializeWithDefaultstuInstances(100001);

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
				a[i].id = tempVar2;
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i].chn = tempVar3;
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[i].math = tempVar4;
			}
			(a[i].total) = (a[i].chn) + (a[i].math);
		}

		for (k = 1; k < 5; k++)
		{
			for (i = 0; i < n - k; i++)
			{
				if ((a[i].total) >= (a[i + 1].total))
				{
				a[100000].id = a[i].id;
				a[100000].total = a[i].total;
				a[i].id = a[i + 1].id;
				a[i + 1].id = a[100000].id;
				a[i].total = a[i + 1].total;
				a[i + 1].total = a[100000].total;
				}
			}
		}

		System.out.printf("%d %d\n", a[n - 1].id, a[n - 1].total);
		System.out.printf("%d %d\n", a[n - 2].id, a[n - 2].total);
		System.out.printf("%d %d\n", a[n - 3].id, a[n - 3].total);

		return 0;
	}
}

