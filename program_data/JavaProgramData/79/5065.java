package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int k;
		int[] a = new int[301];
		int b;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			k = 1;
			if (n == 0 && m == 0)
			{
				break;
			}
			for (i = 1;i <= n;i++)
			{
				a[i] = i;
			}
			for (i = 0;i <= n - 2;i++)
			{
				k = (m + k - 1) % (n - i);
				if (k == 0)
				{
					k = n - i;
				}
				else
				{
					for (b = k;b <= n - i - 1;b++)
					{
						a[b] = a[b + 1];
					}
				}
			}
			System.out.printf("%d\n",a[1]);
		}
	}
}

