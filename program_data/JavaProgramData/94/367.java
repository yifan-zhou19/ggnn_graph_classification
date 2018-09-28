package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int e;
		int i;
		int k;
		int[] a = new int[500];
		int flag = 0;
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


		for (k = 1;k <= N;k++)
		{
			for (i = 0;i < N - k;i++)
			{
				if (a[i] > a[i + 1])
				{
				e = a[i];
				a[i] = a[i + 1];
				a[i + 1] = e;
				}
			}
		}


		for (i = 0;i <= N - 1;i++)
		{
			if ((a[i] + 2) % 2 != 0)
			{
				if (flag == 0)
				{
					System.out.printf("%d",a[i]);
					flag = 1;
				}
				else
				{
					System.out.printf(",%d",a[i]);
				}
			}
		}
		return 0;
	}

}

