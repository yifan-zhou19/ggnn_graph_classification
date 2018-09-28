package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1004];
	public static int[] b = new int[1004];

	public static void Main()
	{
		void qsorta(int n);
		void qsortb(int n);
		int n = 1;
		int i;
		int j;
		int k;
		int max = 0;
		int one;
		int[] ll = new int[3000];
		int l = 1;
		while (n != 0)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			if (n == 0)
			{
				break;
			}
			for (i = 1;i <= n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			qsorta(n);
			for (i = 1;i <= n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
			}
			qsortb(n);
			max = -100000000;
			for (i = 0;i <= n - 1;i++)
			{
				one = 0;
				for (j = 1;j <= n;j++)
				{
					k = j + i;
					if (k > n)
					{
						k = k - n;
					}
					if (a[j] > b[k])
					{
						one = one+200;
					}
					else if (a[j] < b[k])
					{
						one = one-200;
					}
				}
				if (one > max)
				{
					max = one;
				}
			}
			ll[l] = max;
			l = l + 1;
		}
		for (i = 1;i <= l - 1;i++)
		{
			System.out.printf("%d\n",ll[i]);
		}
	}

	public static void qsorta(int n)
	{
		int i;
		int j;
		int temp;
		for (i = 1;i <= n - 1;i++)
		{
			for (j = i;j <= n;j++)
			{
				if (a[j] < a[i])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}

	public static void qsortb(int n)
	{
		int i;
		int j;
		int temp;
		for (i = 1;i <= n - 1;i++)
		{
			for (j = i;j <= n;j++)
			{
				if (b[j] < b[i])
				{
					temp = b[i];
					b[i] = b[j];
					b[j] = temp;
				}
			}
		}
	}
}

