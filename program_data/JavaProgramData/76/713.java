package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int p = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
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
		int min = 10000;
		int max = 1;
		for (int j = 0;j < n;j++)
		{
			if (a[j] < min)
			{
				min = a[j];
			}
			if (b[j] > max)
			{
				max = b[j];
			}
		}
		for (double e = min;e <= max;e = e+0.5)
		{
			int s = 0;
			for (int k = 0;k < n;k++)
			{
				if (e < a[k] || e> b[k])
				{
					s++;
				}
			}
			 if (s >= n)
			 {
				 p++;
			 }
		}
		if (p == 0)
		{
			System.out.printf("%d %d",min,max);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}
}

