package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		//int m;

		int[] a = new int[200];
		int[] time = new int[100];
		//m=2*n;
		for (i = 0;i < 200;i++)
		{
			a[i] = 0;
		}
		for (i = 0;i < 100;i++)
		{
			time[i] = 0;
		}
		for (i = 0;i < 2 * n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		int m = 0;
		for (i = 0;i < 2 * n;i = i + 2)
		{
			if (a[i] >= 90 && a[i] <= 140 && a[i + 1] >= 60 && a[i + 1] <= 90)
			{
				time[m]++;
			}
			else
			{
				m++;
			}
		}
		int max = 0;
		for (i = 0;i < 100;i++)
		{
			if (time[i] > max)
			{
				max = time[i];
			}
		}

		System.out.printf("%d\n",max);
		return 0;
	}

}

