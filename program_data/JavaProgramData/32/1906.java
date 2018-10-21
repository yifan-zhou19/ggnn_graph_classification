package <missing>;

public class GlobalMembers
{
	public static void f(String a, String b)
	{
		int i;
		int m;
		int n;
		int j;
		String c = new String(new char[100]);
		for (i = 0;i < 100;i++)
		{
			c = c.substring(0, i);
		}
		m = a.length();
		for (j = m - 1;j >= 0;j--)
		{
			a[j + 100 - m] = a[j];
			a[j] = '0';
		}
		if (a[m].equals(0))
		{
			a[m] = '0';
		}
		n = b.length();
		for (j = n - 1;j >= 0;j--)
		{
			b[j + 100 - n] = b[j];
			b[j] = '0';
		}
		if (b[n].equals(0))
		{
			b[n] = '0';
		}
		for (i = 99;i >= 0;i--)
		{
			if (a[i].compareTo(b[i]) >= 0)
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a[i] - b[i]);
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, i, a[i].Substring(10) - b[i]);
				a[i - 1] = a[i - 1] - 1;
			}
		}
		for (j = 0;j < 100;j++)
		{
			if (c.charAt(j) != 0)
			{
				break;
			}
		}
		for (j;j <= 99;j++)
		{
			System.out.printf("%d",c.charAt(j));
		}
		System.out.print("\n");
	}
	public static void Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		int i;
		int num;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < num;i++)
		{
			for (j = 0;j < 100;j++)
			{
				a = tangible.StringFunctions.changeCharacter(a, j, '0');
				b = tangible.StringFunctions.changeCharacter(b, j, '0');
			}
			a = new Scanner(System.in).nextLine();

			b = new Scanner(System.in).nextLine();
			f(a, b);
					  System.in.read();

		}
	}
}

