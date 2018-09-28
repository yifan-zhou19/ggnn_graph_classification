package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int y = 0;
		int m;
		int[] a = new int[10000];
		int t;
		int k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n;i++)
		{
			t = 0;
			for (j = 2;j < i;j++)
			{
				if (i % j == 0)
				{
					t++;
				}
			}
			if (t == 0)
			{
				m = i;
				a[y] = m;
				y = y + 1;
			}
		}
		if (y != 0)
		{
			k = 0;
		while (k < y)
		{
			if (a[k + 1] - a[k] == 2)
			{
				System.out.printf("%d %d\n",a[k],a[k + 1]);
			}
			k++;
		}
		}
		if (y == 0 || n <= 4)
		{
			System.out.print("empty\n");
		}
	}

}

