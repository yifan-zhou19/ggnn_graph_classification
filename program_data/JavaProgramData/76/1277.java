package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int min = 10000;
		int max = 0;
		int e = 1;
		int p = 0;
	float j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
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
		j = min + 0.0;
		while (j <= max)
		{
			for (int k = 0;k <= n - 1;k++)
			{
				if (b[k] >= j != 0 && j >= a[k])
				{
					break;
				}
				if (k == n - 1)
				{
					p = 1;
				}
			}
		j = j + 0.5;
		}
		if (p == 1)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",min,max);
		}
		return 0;
	}

}

