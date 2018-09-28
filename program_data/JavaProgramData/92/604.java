package <missing>;

public class GlobalMembers
{
	public static void arrange(int[] a, int n)
	{
		int i;
		int j;
		int t;
		for (i = 0;i < n - 1;i++)
		{
			for (j = 0;j < n - i - 1;j++)
			{
				if (a[j + 1] < a[j])
				{
				t = a[j];
				a[j] = a[j + 1];
				a[j + 1] = t;
				}
			}
		}
	}
	public static void fun(int[] a, int n)
	{
		int i;
		for (i = 0;i < n - 1;i++)
		{
			a[i] = a[i + 1];
		}
	}
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (;n != 0;)
		{
			int s = 0;
			int m = n;
			int i;
			int[] a = new int[n];
			int[] b = new int[n];
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					b[i] = Integer.parseInt(tempVar3);
				}
			}
			arrange(a, n);
			arrange(b, n);
			for (;m > 0;)
			{
				if (a[0] < b[0])
				{
					s--;
					fun(a, m);
				}
				else if (a[0] > b[0])
				{
					s++;
					fun(a, m);
					fun(b, m);
				}
				else if (a[0] == b[0])
				{
					if (a[m - 1] > b[m - 1])
					{
						s++;
					}
					else if (a[m - 1] < b[m - 1])
					{
						s--;
						fun(a, m);
					}
					else if (a[m - 1] == b[m - 1])
					{
						if (a[0] < b[m - 1])
						{
							s--;
							fun(a, m);
						}
						else
						{
							break;
						}
					}
				}
				m--;
			}
			System.out.printf("%d\n",200 * s);
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n = Integer.parseInt(tempVar4);
			}
		}
		return 0;
	}

}

