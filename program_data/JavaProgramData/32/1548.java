package <missing>;

public class GlobalMembers
{
	public static void minus(String a, String b)
	{
		int i;
		int k;
		int m;
		int n;
		String c = new String(new char[100]);
		m = a.length();
		n = b.length();
		for (i = m - 1;i > m - n - 1;i--)
		{
			if (a[i].equals('/'))
			{
				a[i] = '9';
				a[i - 1] = a[i - 1] + '0'-'1';
			}
			if (a[i].compareTo(b[i - m + n]) >= 0)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a[i] - b[i - m + n] + '0');
			}
			if (a[i].compareTo(b[i - m + n]) < 0)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a[i] - b[i - m + n] + ':');
				a[i - 1] = a[i - 1] + '0'-'1';
			}
		}
		for (i = m - n - 1;i >= 0;i--)
		{
			if (a[i].equals('/'))
			{
				a[i] = '9';
				a[i - 1] = a[i - 1] + '0'-'1';
			}
			c = tangible.StringFunctions.changeCharacter(c, i, a[i]);
		}
		for (i = 0;;i++)
		{
			k = i;
			if (c.charAt(i) != '0')
			{
				break;
			}
		}
		for (i = k;i < m;i++)
		{
			System.out.printf("%c",c.charAt(i));
		}
		System.out.print("\n");
	}
	public static void Main()
	{
		int j;
		int i;
		char[][] a = new char[10][100];
		char[][] b = new char[10][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			j = Integer.parseInt(tempVar);
		}
		for (i = 0;i < j - 1;i++)
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
			System.out.print("\n");
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			a[j - 1] = tempVar4.charAt(0);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			b[j - 1] = tempVar5.charAt(0);
		}
		for (i = 0;i < j;i++)
		{
			minus(a[i], b[i]);
		}
	}
}

