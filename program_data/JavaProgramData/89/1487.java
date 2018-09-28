package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int b;
		int c;
		int j;
		int k;
		int l;
		int m;
		int[] a = new int[10000];
		int[] d = new int[10000];
		m = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;;i++)
		{
			b = 1;
			c = 1;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				c = Integer.parseInt(tempVar3);
			}
			if (b != c)
			{
			a[b] = a[b] + 1;
			d[c] = d[c] + 1;
			}
			else if (b == 0 && c == 0)
			{
				break;
			}
		}
		for (j = 0;j <= n - 1;j++)
		{
			if (a[j] != 0)
			{
				continue;
			}
			else if (d[j] == n - 1)
			{
				System.out.printf("%d",j);
				m = m + 1;
			}
		}
		if (m == 0)
		{
		System.out.print("NOT FOUND");
		}
	}
}

