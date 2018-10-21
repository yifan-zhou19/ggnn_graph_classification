package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] a = new int[100];
		int k;
		int[] b = new int[100];
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= 100;i++)
		{
			a[i] = 0;
		}
		j = 1;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				k = Integer.parseInt(tempVar2);
			}

			if (a[k] == 0)
			{
				b[j] = k;
				j++;
			}
			a[k] = 1;
		}
		for (i = 1;i < (j - 1);i++)
		{
			System.out.printf("%d ",b[i]);
		}
		System.out.printf("%d",b[j - 1]);

		return 0;
	}
}

