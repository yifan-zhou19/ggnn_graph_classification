package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int t;
		int[] a = new int[300];
		int b;
		int n = 0;
		int j;
		char c;
		for (i = 0;i < 300;i++)
		{
			a[i] = -1;
		}
		for (i = 0;i < 300;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			c = System.in.read();
			n++;
			if (c == '\n')
			{
				break;
			}
		}
		j = 0;
		if (n == 1)
		{
			j = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (a[0] != a[i])
			{
				j++;
			}
		}
		for (i = 0;i < n;i++)
		{
			for (b = 0;b < n - i;b++)
			{
				if (a[b] < a[b + 1])
				{
					t = a[b];
				a[b] = a[b + 1];
				a[b + 1] = t;
				}
			}
		}
		int[] m = new int[300];
		int k;
		k = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] > a[i + 1])
			{
				m[k] = a[i];
				k++;
			}
		}
		if (j == 0)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",m[1]);
		}
	}
}

