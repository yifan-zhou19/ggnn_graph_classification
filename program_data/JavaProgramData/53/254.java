package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i;
		int n;
		int m;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		System.out.print("\n");
		i = 0;
		m = n - 1;
		while (i <= m)
		{
			c = i + 1;
			while (c <= m)
			{
				if (a[i] == a[c])
				{
					for (b = c;b <= m - 1;b++)
					{
						a[b] = a[b + 1];
					}
					m--;
				}
				else
				{
					c++;
				}
			}
			i++;
		}
		for (i = 0;i <= m;i++)
		{
			System.out.printf("%d",a[i]);
			if (i < m)
			{
				System.out.print(",");
			}
		}
		System.out.print("\n");
	}







}

