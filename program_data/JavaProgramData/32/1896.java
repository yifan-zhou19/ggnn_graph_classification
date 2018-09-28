package <missing>;

public class GlobalMembers
{
	public static int p;
	public static int[] len1 = new int[100];
	public static char[][] ans = new char[100][100];
	public static void minus(String c, String d)
	{
		int len2;
		int i;
		int j;
		String e = new String(new char[100]);

		len1[p] = c.length();
		len2 = d.length();
		for (i = 0;i < len1[p];i++)
		{
			e = tangible.StringFunctions.changeCharacter(e, i, '0');
		}
		for (i = len1[p] - len2;i < len1[p];i++)
		{
			e = tangible.StringFunctions.changeCharacter(e, i, d[i - len1[p] + len2]);
		}

		for (i = 0;i < len1[p] - 1;i++)
		{
			j = len1[p] - 1 - i;
			if (c[j].compareTo(e.charAt(j)) >= 0)
			{
				ans[p][j] = c[j] - e.charAt(j) + '0';
			}
			else
			{
				ans[p][j] = c[j] - e.charAt(j) + '0' + 10;
				c[j - 1] = c[j - 1] - 1;
			}
		}
		ans[p][0] = c[0] - e.charAt(0) + '0';
	}

	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
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
				a[i] = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = tempVar3.charAt(0);
			}
		}
		for (p = 0;p < n;p++)
		{
			minus(a[p], b[p]);
			k = 0;
		for (i = 0;i < 100;i++)
		{
			if (ans[p][i] == '0')
			{
				k = k + 1;
			}
			else
			{
				break;
			}
		}
		for (j = k;j < len1[p];j++)
		{
			System.out.printf("%c",ans[p][j]);
		}
		System.out.print("\n");
		}

	}
}

