package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int[] a = new int[300];
		int m = 0;
		int c = 0;
		int r = 0;
		char q;
		for (n = 0;;n++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[n] = Integer.parseInt(tempVar);
			}
			q = System.in.read();
			if (q != ',')
			{
				n = n + 1;
				break;
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] > m)
			{
				m = a[i];
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			if (a[i] > c && a[i] < m)
			{
				r = r + 1;
				c = a[i];
			}
		}
		if (r != 0)
		{
			System.out.printf("%d",c);
		}
		else
		{
			System.out.print("No");
		}
	}
}

