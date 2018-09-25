package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[500];
		int[] b = new int[500];
		int n;
		int i;
		int k;
		int t;
		int j = 0;
		int min;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			if (a[i] % 2 != 0)
			{
				b[j] = a[i];
				j++;
			}
		}
		for (i = 0;i < j;i++)
		{
			for (k = i;k < j;k++)
			{
				min = b[i];
				if (b[k] < min)
				{
					min = b[k];
					t = b[k];
					b[k] = b[i];
					b[i] = t;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			if (i != j - 1)
			{
				System.out.printf("%d,",b[i]);
			}
			else
			{
				System.out.printf("%d",b[i]);
			}
		}
		return 0;
	}
}

