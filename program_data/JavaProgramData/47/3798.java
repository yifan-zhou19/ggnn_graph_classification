package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[101];
		int[] b = new int[101];
		int i;
		int k;
		int j;
		int n;
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
		}
		for (k = n;k > 0;k--)
		{
			b[k - 1] = a[n - k];
		}
		System.out.printf("%d",b[0]);
		for (j = 1;j < n;j++)
		{
			System.out.printf(" %d",b[j]);
		}
		return 0;
	}

}

