package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int[] a = new int[500];
		int[] b = new int[500];
		int i;
		int j;
		int j1;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0,j = 0;i < N;i++)
		{
			if (a[i] % 2 != 0)
			{
				b[j] = a[i];
				j++;
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			for (j1 = 0;j1 < j - i - 1;j1++)
			{
				if (b[j1] > b[j1 + 1])
				{
					t = b[j1],b[j1] = b[j1 + 1],b[j1 + 1] = t;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d",b[i]);
			if (i != j - 1)
			{
				System.out.print(',');
			}
		}
		System.out.print('\n');
		return 0;
	}
}

