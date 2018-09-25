package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int[] a = new int[30];
		int i;
		int[] b = new int[30];
		int j;
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
		b[i] = 1;
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < i;j++)

			{
				if (a[j] >= a[i])
				{
					if (b[j] >= b[i])
					{
						b[i] = b[j] + 1;
					}
				}
			}
		}

		for (j = 0;j < n - 1;j++)
		{
			if (b[j] > b[j + 1])
			{
			b[j + 1] = b[j];
			}
		}
		System.out.printf("%d\n",b[n - 1]);
	}
}

