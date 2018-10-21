package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int c = 0;
		int d = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] a = new int[500];
		int[] b = new int[500];
		for (int i = 0;i < n;i++)
		{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
				if (a[i] % 2 != 0)
				{
					c = c + 1;
				}
		}
				b[-1] = 0;
		int i = 0;
				for (int j = 0;j < n;j++)
				{
						if (a[j] % 2 != 0)
						{
							b[i] = a[j];
							i = i + 1;
						}
				}
		for (int k = 1;k <= c;k++)
		{
		for (int i = 0;i < c - k;i++)
		{
				if (b[i] > b[i + 1])
				{
								d = b[i + 1];
								b[i + 1] = b[i];
								b[i] = d;
				}
		}
		}
		for (int i = 0;i < c;i++)
		{
				if (i != c - 1)
				{
					System.out.printf("%d,",b[i]);
				}
				else
				{
					System.out.printf("%d",b[i]);
				}
		}
		return 0;
	}
}

