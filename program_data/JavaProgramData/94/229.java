package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int j;
		int x;
		int[] a = new int[500];
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
			if (a[i] % 2 == 0)
			{
				a[i] = 0;
			}
		}
		for (j = 1;j < N;j++)
		{
			for (i = 0;i < N - j;i++)
			{
				if (a[i] > a[i + 1])
				{
					x = a[i];
					a[i] = a[i + 1];
					a[i + 1] = x;
				}
			}
		}
		for (i = 0;i < N;i++)
		{
			if (a[i] != 0)
			{
			if (i < (N - 1))
			{
				System.out.printf("%d,", a[i]);
			}
			else
			{
				System.out.printf("%d", a[i]);
			}
			}
		}
		return 0;
	}

}

