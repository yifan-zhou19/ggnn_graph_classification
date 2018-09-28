package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int min = 10000;
		int max = 0;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i;
			double m;
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
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
			if (a[i] < min)
			{
				min = a[i];
			}
			if (b[i] > max)
			{
				max = b[i];
			}

		}
		for (m = min * 1.0 + 0.5;m < max;m++)
		{
			for (int l = 0;l < n;l++)
			{
				if (m >= a[l] != 0 && m <= b[l])
				{
					break;
				}
				if (l == n - 1)
				{
					System.out.print("no");
					return 0;
				}
			}
		}
		System.out.printf("%d %d",min,max);
			return 0;
	}
}

