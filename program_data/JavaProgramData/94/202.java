package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[500];
		int k;
		int i;
		int j;
		int[] b = new int[500];
		int c;
		j = 0;
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
				j = j + 1;
			}
		}
		j = j - 1;
		for (i = 0;i < j;i++)
		{
			for (k = i;k < j;k++)
			{
				if (b[i] > b[k + 1])
				{
					c = b[i];
					b[i] = b[k + 1];
					b[k + 1] = c;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d,",b[i]);
		}
		System.out.printf("%d",b[j]);


		return 0;

	}
}

