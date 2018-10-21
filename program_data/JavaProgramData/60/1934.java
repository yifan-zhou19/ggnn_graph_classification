package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int t;
		int u;
		int[] a = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
		System.out.print("empty");
		}
		else if (n >= 5)
		{
			u = 0;
			for (i = 3;i < n + 1;i++)
			{
				t = 0;
				for (j = 2;j <= i / 2;j++)
				{
					if (i % j == 0)
					{
					t = 1;
					break;
					}
				}
				if (t == 0)
				{
					a[u] = i;
					u++;
				}
			}
			for (i = 1;i < u;i++)
			{
				if (a[i] - a[i - 1] == 2)
				{
				System.out.printf("%d %d\n",a[i - 1],a[i]);
				}
			}
		}
	}
}

