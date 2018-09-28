package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void f(char x[100],char y[100]);
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		int n;
		int i;
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
		for (i = 0;i < n;i++)
		{
		f(a[i], b[i]);
		}
		return 0;
	}
	public static void f(String x, String y)
	{
		int m;
		int n;
		int i;
		int j;
		String z = new String(new char[100]);
		String s = new String(new char[100]);
		z = x;
		m = x.length();
		n = y.length();
		for (i = 1;i <= n;i++)
		{
			if (x[m - i].compareTo(y[n - i]) < 0)
			{
			x[m - i] += 10;
		z = tangible.StringFunctions.changeCharacter(z, m - i - 1, x[m - i - 1] -= 1);
			}
		z = tangible.StringFunctions.changeCharacter(z, m - i, x[m - i] - y[n - i].Substring(48));
		}
		for (i = 0;i < m;i++)
		{
			if (z.charAt(i) != '0')
			{
				for (j = 0;j <= m - i;j++)
				{
			s = tangible.StringFunctions.changeCharacter(s, j, z.charAt(i + j));
				}
			break;
			}
		}
		System.out.printf("%s\n",s);
	}
}

