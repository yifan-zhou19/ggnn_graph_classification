package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int[] n = new int[100];
		int[] m = new int[100];
		int i;
		int j;
		int k;
		int r;
		int[] b = new int[100];
		int t;
		int c;
		for (i = 0;;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m[i] = Integer.parseInt(tempVar2);
			}
			if (n[i] == 0 && m[i] == 0)
			{
				break;
			}
		}
		c = i;
		for (t = 0;t < c;t++)
		{
			r = n[t] - 1;
			for (i = 0;i < n[t];i++)
			{
				a[i] = i + 1;
			}
			for (i = 0,k = 1;r > 0;i++,k++)
			{
				if (m[t] == 1)
				{
					a[0] = a[r];
					break;
				}
				if (k == m[t])
				{
					if (i == r)
					{
						k = 1;
						i = 0;
						r--;
						continue;
					}
					k = 1;
					for (j = i;j < r;j++)
					{
						a[j] = a[j + 1];
					}
					r--;
				}
				if (i >= r)
				{
					i = -1;
				}
			}
			b[t] = a[0];
		}
		for (i = 0;i < c;i++)
		{
			if (i > 0)
			{
				System.out.print("\n");
			}
			System.out.printf("%d",b[i]);
		}
	}

}

