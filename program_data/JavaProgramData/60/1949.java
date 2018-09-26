package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		int[] a = new int[10000];
		int n = 0;
		int love;
		if (N < 5)
		{
		System.out.print("empty");
		}
		else
		{
		for (i = 3;i <= N;i++)
		{
			love = 1;
			for (j = 3;j < i;j++)
			{
				if (i % j == 0)
				{
					love = 0;
					break;
				}
			}
		if (love == 1)
		{
		a[n] = i;
		n++;
		}
		}
		int k;
		int m;
		for (k = 0;k < n;k++)
		{
			for (m = k + 1;m < n;m++)
			{
			if (a[m] - a[k] == 2)
			{
			System.out.printf("%d %d\n",a[k],a[m]);
			}
			}
		}
		}
	}
}

