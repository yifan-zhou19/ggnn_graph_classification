package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20000];
		int[] b = new int[20000];
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int i;
		int k;
		for (i = 2;i <= N;i++)
		{
			b[i - 2] = i;
			int m;
			m = (int)(i / 2);
			for (k = 2;k <= m;k++)
			{
				if (i % k == 0)
				{
				break;
				}
			}
			if (k == m + 1)
			{
				a[i - 2] = 1;
			}
			else
			{
				a[i - 2] = 0;
			}
		}
		for (i = 2;i <= N;i++)
		{
			if ((a[i - 2] == a[i]) && (a[i - 2] == 1))
			{
				System.out.printf("%d %d\n",b[i - 2],b[i]);
			}
		}
		if (N <= 4)
		{
			System.out.print("empty");
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}

}

