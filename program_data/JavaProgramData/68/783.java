package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] flag = new int[50001];
		int i;
		int j;
		int k;
		int m;
		int p;
		int q;
		int s;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[50000];
		flag[3] = 1;
		for (i = 3;i < 50001;i = i + 2)
		{
			flag[i] = 1;
		}
		for (i = 3;i <= 223;i += 2)
		{
			if (flag[i] != 0)
			{
			for (k = i * i;k < 50001;k += i)
			{
				flag[k] = 0;
			}
			}
		}
		m = 0;
		for (j = 3;j < 50001;j += 2)
		{
			if (flag[j] != 0)
			{
				m = m + 1;
				a[m] = j;
			}
		}

		for (j = 6;j <= n;j += 2)
		{
		System.out.printf("%d=",j);
		for (i = 1;i <= m;i++)
		{
			if (flag[j - a[i]] != 0)
			{
				System.out.printf("%d+%d\n", a[i],j - a[i]);
					break;
			}

		}
		}

	}
}

