package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[10005];
		int i;
		int j;
		int n;
		int m = 0;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
			for (i = 3;i <= n;i++)
			{
				for (j = 2;j < i;j++)
				{
					if (i % j == 0)
					{
						break;
					}
				}
					if (j >= i)
					{
						a[t] = i;
						t++;
					}
			}
				for (t = 0;t <= n;t++)
				{
				if (a[t + 1] - a[t] == 2)
				{
					System.out.printf("%d %d\n",a[t],a[t + 1]);
					m = m + 1;
				}
				}
				if (m == 0)
				{
					System.out.print("empty\n");
				}
			return 0;
	}

}

