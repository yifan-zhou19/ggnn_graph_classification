package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
		int[] index = new int[1000];
		int n;
		int i;
		int temp;
		int j;
		int t;
		int k;
		int d = 0;
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
		for (i = 0;i < n;i++)
		{
			c[i] = a[i];
		}
		for (j = 1;j <= n - 1;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (c[i] > c[i + 1])
				{
					t = c[i];
					c[i] = c[i + 1];
					c[i + 1] = t;
				}
			}
		}
		j = 0;
		for (i = 0;i <= n;i++)
		{
			if (c[i] == c[i + 1])
			{
				temp = 0;
			}
			else
			{
				temp = 1;
			}
			if (temp != 0)
			{
				b[j] = c[i];
				j++;
			}
		}
		for (i = 0;i < j;i++)
		{
			for (k = 0;k < n;k++)
			{
				if (a[k] == b[i])
				{
					index[d] = k;
					d++;
					break;
				}
			}
		}
		for (j = 1;j <= d - 1;j++)
		{
			for (i = 0;i < d - j;i++)
			{
				if (index[i] > index[i + 1])
				{
					t = index[i];
					index[i] = index[i + 1];
					index[i + 1] = t;
				}
			}
		}
		for (i = 0;i < d - 1;i++)
		{
			System.out.printf("%d,",a[index[i]]);
		}
		System.out.printf("%d",a[index[d - 1]]);
	}

}

