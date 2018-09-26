package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		char p;
		char q;
		int[] b = new int[50];
		int[] g = new int[50];
		int i;
		int l;
		int j = 0;
		int e;
		int k;
		int r;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		l = str.length();
		p = str.charAt(0);
		for (i = 1;i < l;i++)
		{
			if (str.charAt(i) != p)
			{
				q = str.charAt(i);
				break;
			}
		}
		for (r = 1;;r++)
		{
			if (j == l / 2)
			{
				break;
			}
			else
			{
				for (i = 0;i < l;i++)
				{
					if (str.charAt(i) == p && str.charAt(i + r) == q)
					{
						str = tangible.StringFunctions.changeCharacter(str, i, '0');
						str = tangible.StringFunctions.changeCharacter(str, i + r, '0');
						b[j] = i;
						g[j] = i + r;
						j++;
					}
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			for (k = j - 1;k >= i;k--)
			{
				if (g[k] < g[k - 1])
				{
					e = g[k];
					g[k] = g[k - 1];
					g[k - 1] = e;
					e = b[k];
					b[k] = b[k - 1];
					b[k - 1] = e;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%d %d\n",b[i],g[i]);
		}
		return 0;
	}
}

