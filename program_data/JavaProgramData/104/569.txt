package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int i = 0;
		int j = 0;
		int m = 1;
		int n = 1;
		int y;
		int t = 1;
		int[] a = new int[10];
		int[] b = new int[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		a[0] = x;
		b[0] = y;
		while (a[i] != 1)
		{
			if (a[i] % 2 == 0)
			{
			a[i + 1] = a[i] / 2;
			}
			else
			{
			a[i + 1] = (a[i] - 1) / 2;
			}
			i++;
			m++;
		}
		while (b[j] != 1)
		{
			if (b[j] % 2 == 0)
			{
			b[j + 1] = b[j] / 2;
			}
			else
			{
			b[j + 1] = (b[j] - 1) / 2;
			}
			j++;
			n++;
		}
		if (m >= n)
		{
			for (j = 0;j < n;j++)
			{
				for (i = 0;i < m;i++)
				{
					if (a[i] == b[j])
					{
						System.out.printf("%d\n",a[i]);
						t = 0;
						break;
					}
				}
					if (t == 0)
					{
						break;
					}
			}
		}
		else
		{
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (b[j] == a[i])
					{
						System.out.printf("%d\n",b[j]);
						t = 0;
						break;
					}
				}
					if (t == 0)
					{
						break;
					}
			}
		}
	}








}

