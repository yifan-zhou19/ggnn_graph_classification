package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[302];
		int[] b = new int[302];
		int i;
		int k;
		int j;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		k = 0;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			j = 1;
			while (a[j] != a[i] && j < i)
			{
				j++;
			}
			if (j == i)
			{
				k++;
				b[k] = a[i];
			}
		}
		for (i = 1;i < k;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d\n",b[k]);
	}
}

