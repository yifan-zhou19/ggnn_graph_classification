package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[50000];
		int[] b = new int[50000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
		int[] shuzhou = new int[10000];
		for (i = 0;i < 10000;i++)
		{
			shuzhou[i] = 0;
		}
		int m;
		for (i = 0;i < n;i++)
		{
			for (m = a[i] * 2;m <= b[i] * 2;m++)
			{
				shuzhou[m] = 1;
			}
		}
		int min = a[0];
		int max = b[0];
		for (i = 0;i < n;i++)
		{
				if (a[i] < min)
				{
					min = a[i];
				}

		}
		for (i = 1;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		int panduan = 1;
		for (i = min * 2;i <= max * 2;i++)
		{
			if (shuzhou[i] == 0)
			{
				panduan = 0;
				break;
			}
		}
		if (panduan == 0)
		{
			System.out.print("no");
		}
		if (panduan == 1)
		{
			System.out.printf("%d %d",min,max);
		}
		return 0;
	}

}

