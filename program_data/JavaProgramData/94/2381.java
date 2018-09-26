package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int m;
		int k;
		int e;
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
		}
		for (int k = 1;k <= N;k++)
		{
			for (i = 0;i < N - k;i++)
			{
				if (a[i] > a[i + 1])
				{
					e = a[i + 1];
					a[i + 1] = a[i];
					a[i] = e;
				}
			}
		}
		int first;
		for (first = 0;first < N;first++)
		{
			if (a[first] % 2 == 1)
			{
				System.out.printf("%d",a[first]);
				break;
			}
		}
		for (i = first + 1;i < N;i++)
		{
			if (a[i] % 2 == 1)
			{
				System.out.printf(",%d",a[i]);
			}
		}
		return 0;
	}

}

