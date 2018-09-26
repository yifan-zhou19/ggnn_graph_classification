package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[10005];
		for (i = 3;i <= n;i++)
		{
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					a[i] = 0;
					break;
				}
			}
				if (j >= i)
				{
					a[i] = 1;
				}
		}
		for (i = 3;i <= n;i++)
		{
		if (a[i] == 1 && a[i + 2] == 1)
		{
			System.out.printf("%d %d\n",i,i + 2);
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

