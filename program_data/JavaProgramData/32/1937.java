package <missing>;

public class GlobalMembers
{
	public static String c = new String(new char[100]);
	public static void putcc(String a, String b)
	{
		int A;
		int B;
		int i;
		A = a.length();
		B = b.length();
		for (i = B - 1;i >= 0;i--)
		{
			if (b[i].compareTo(a[i - B + A]) <= 0)
			{
				c = tangible.StringFunctions.changeCharacter(c, i - B + A, a[i - B + A] - b[i].Substring(48));
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, i - B + A, a[i - B + A].Substring(10) - b[i].Substring(48));
				a[i - B + A - 1] = a[i - B + A - 1] - 1;
			}
		}
		for (i = A - B - 1;i >= 0;i--)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, a[i]);
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int l;
		int A;
		char[][] d = new char[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String a = new String(new char[100]);
			String b = new String(new char[100]);
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = tempVar3.charAt(0);
			}
			if (i != n - 1)
			{
				scanf("\n");
			}
			A = a.length();
			putcc(a, b);
			for (l = 0;l < A;l++)
			{
				d[i][l] = c.charAt(l);
			}
			d[i][l] = '\0';
		}
		for (i = 0;i < n;i++)
		{
			l = 0;
			while (d[i][l] != '\0')
			{
				System.out.printf("%c",d[i][l]);
				l = l + 1;
			}
			System.out.print("\n");
		}
		return 0;
	}

}

