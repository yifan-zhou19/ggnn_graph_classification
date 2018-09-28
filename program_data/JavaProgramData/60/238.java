package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int j;
		int k = 0;
		int l;
		int cnt;
		int[] a = new int[2500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		if (n < 5)
		{
			System.out.print("empty");
		}
		else
		{
			for (i = 3;i <= n;i++)
			{
				cnt = 0;
				t = (int)Math.sqrt(i);
				for (j = 2;j <= t;j++)
				{
					if (i % j == 0)
					{
						cnt++;
					}
				}
				if (cnt == 0)
				{
					a[k] = i;
					k++;
				}
			}
			for (l = 1;l <= 2500;l++)
			{
				if (a[l] - a[l - 1] == 2)
				{
				System.out.printf("%d %d\n",a[l - 1],a[l]);
				}
			}
		}
		System.in.read();
		System.in.read();
	}
}

