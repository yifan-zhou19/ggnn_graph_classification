package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[50000];
		int[] b = new int[50000];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(a[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(b[i]) = Integer.parseInt(tempVar3);
			}
		}
		int[] sz = new int[20001];
		int min = a[0];
		int max = b[0];
		for (int h = 0;h < n;h++)
		{
			if (a[h] < min)
			{
				min = a[h];
			}
			if (b[h] > max)
			{
				max = b[h];
			}
		}
		for (int m = 0;m < n;m++)
		{
			for (int k = a[m];k < b[m];k++)
			{
				sz[k] = 1;
			}
		}
		for (int g = min;g < max;g++)
		{
			if (sz[g] == 0)
			{
				System.out.print("no");
				return 0;
			}
		}
		System.out.printf("%d %d",min,max);
		return 0;
	}
}

