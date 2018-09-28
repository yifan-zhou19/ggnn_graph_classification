package <missing>;

public class GlobalMembers
{
	public static int f1(String n, int a, int l)
	{
		int m;
		int i;
		int j;
		int k;
		int[] c = new int[500];
		m = 0;
		k = 0;
		for (i = l - 1; i >= 0; i--)
		{
			if (n[i].compareTo('9') <= 0 && n[i].compareTo('0') >= 0)
			{
				c[i] = n[i] - '0';
			}
			else
			{
				if (n[i].compareTo('Z') <= 0 && n[i].compareTo('A') >= 0)
				{
					c[i] = n[i] - 'A' + 10;
				}
				else
				{
					if (n[i].compareTo('z') <= 0 && n[i].compareTo('a') >= 0)
					{
						c[i] = n[i] - 'a' + 10;
					}
				}
			}
		}
		for (i = l - 1; i >= 0; i--)
		{
			k = c[i];
			for (j = 1; j < l - i; j++)
			{
				k = k * a;
			}
			m = m + k;
		}
		return m;
	}
	public static void f2(int m, int b)
	{
		int[] a = new int[500];
		int i = 0;
		int j;
		String c = new String(new char[500]);
		do
		{
			i++;
			a[i] = m % b;
			m = m / b;
		}while (m != 0);
		for (j = 1; j <= i; j++)
		{
			if (a[j] <= 9 && a[j] >= 0)
			{
				c = tangible.StringFunctions.changeCharacter(c, j, '0' + a[j]);
			}
			else
			{
				c = tangible.StringFunctions.changeCharacter(c, j, a[j] + 'A' - 10);
			}
		}
		for (j = i ; j > 0; j--)
		{
			System.out.print(c.charAt(j));
		}
	}
	public static int Main()
	{
		int a;
		int b;
		int l;
		int m;
		String n = new String(new char[500]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		l = n.length();
		m = f1(n, a, l);
		f2(m, b);
		return 0;
	}

}

