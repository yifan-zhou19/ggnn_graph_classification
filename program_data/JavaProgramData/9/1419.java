package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int t;
		int u = 0;
		int k = 0;
		int[] a = new int[N];
		int[] b = new int[N];
		char[][] s = new char[N][10];
		char[][] h = new char[N][10];
		char[][] j = new char[N][10];
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
				s[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
			if (a[i] >= 60)
			{
				b[u] = a[i];
				h[u] = s[i];
				u++;
			}
			else
			{
				j[k] = s[i];
				k++;
			}
		}
		for (i = u - 1;i > 0;i--)
		{
			for (t = 0;t < i;t++)
			{
				if (b[t] < b[t + 1])
				{
					int f;
					f = b[t];
					b[t] = b[t + 1];
					b[t + 1] = f;
					String tmp = new String(new char[10]);
					tmp = h[t];
					h[t] = h[t + 1];
					h[t + 1] = tmp;
				}
			}
		}
		for (i = 0;i < u;i++)
		{
			System.out.printf("%s\n", h[i]);
		}
		for (t = 0;t < k;t++)
		{
			System.out.printf("%s\n", j[t]);
		}
		return 0;
	}
}

