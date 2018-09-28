package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int N;
		int[] a = new int[500];
		int mid;
		int m;
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
		for (j = 1;j < N;j++)
		{
			for (i = 0;i < N - j;i++)
			{
				if (a[i] > a[i + 1])
				{
					mid = a[i + 1];
					a[i + 1] = a[i];
					a[i] = mid;
				}
			}
		}
		for (i = 0;i < N;i++)
		{
			if (a[i] % 2 != 0)
			{
				System.out.printf("%d",a[i]);
				m = i;
				break;
			}
			else
			{
				continue;
			}
		}
		for (i = m + 1;i < N;i++)
		{
			if (a[i] % 2 != 0)
			{
				System.out.printf(",%d",a[i]);
			}
			else
			{
				continue;
			}
		}
		return 0;
	}

}

