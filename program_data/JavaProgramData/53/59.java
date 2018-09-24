package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k = 0;
		int[] a = new int[300];
		int[] b = new int[300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a + i = tempVar2;
			}
		}
		b[0] = a[0];
		for (i = 0;i <= n - 1;i++)
		{
			int m = 0;
			for (j = 0;j <= k;j++)
			{
				if (a[i] != b[j])
				{
					m++;
				}
			}
			if (m == k + 1)
			{
				k++;
				b[k] = a[i];
			}
		}
		for (i = 0;i <= k - 1;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[k]);
	}




}

