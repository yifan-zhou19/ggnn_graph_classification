package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] s = new char[100][MAX + 1];
		char[][] g = new char[100][MAX + 1];
		int[] h = new int[100];
		int[] k = new int[100];
		int a;
		int i;
		int j;
		String q = new String(new char[100]);
		int n;
		int e;
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				k[i] = Integer.parseInt(tempVar3);
			}
		}
		a = 0;
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (k[i] >= 60)
			{
			a++;
			h[j] = k[i];
			g[j] = s[i];
			j++;
			k[i] = 0;
			}
		}
		for (i = 1;i <= a;i++)
		{
			for (j = 0;j < a - i;j++)
			{
				if (h[j] < h[j + 1])
				{
					e = h[j];
					h[j] = h[j + 1];
					h[j + 1] = e;
					q = g[j];
					g[j] = g[j + 1];
					g[j + 1] = q;
				}
			}
		}
		for (i = 0;i < a;i++)
		{
			System.out.printf("%s\n",g[i]);
		}
		for (i = 0;i < n;i++)
		{
			if (k[i] != 0)
			{
				System.out.printf("%s\n",s[i]);
			}
		}
		return 0;
	}
}

