package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int n;
		int i;
		int j;
		int lao = 0;
		int you = 0;
		int t;
		char[][] e = new char[100][10];
		char[][] f = new char[100][10];
		char[][] g = new char[100][10];
		String s = new String(new char[10]);
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
				e[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] >= 60)
			{
				b[lao] = a[i];
				f[lao] = e[i];
				lao++;
			}
			else
			{
				c[you] = a[i];
				g[you] = e[i];
				you++;
			}
		}
		for (j = 0;j < lao - 1;j++)
		{
			for (i = 0;i < lao - 1;i++)
			{
				if (b[i] < b[i + 1])
				{
					t = b[i];
					b[i] = b[i + 1];
					b[i + 1] = t;
					s = f[i];
					f[i] = f[i + 1];
					f[i + 1] = s;
				}
			}
		}
		for (i = 0;i < lao;i++)
		{
			System.out.printf("%s\n",f[i]);
		}
		for (i = 0;i < you;i++)
		{
			System.out.printf("%s\n",g[i]);
		}
		return 0;
	}
}

