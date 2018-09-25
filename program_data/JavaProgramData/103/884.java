package <missing>;

public class GlobalMembers
{
	public static int ss(String a, int n)
	{
		int b;
		int i = 0;
		int c;
		char d;
		b = a[n];
		c = a[n];
		while (!a[n].equals('\0') && (b == c || (b - 32) == c || b == (c - 32)))
		{
			i++;
			n++;
			c = a[n];
		}
		if (b >= 97)
		{
			d = b - 32;
			System.out.print("(");
			System.out.print(d);
			System.out.print(",");
			System.out.print(i);
			System.out.print(")");
		}
		else
		{
			d = b;
			System.out.print("(");
			System.out.print(d);
			System.out.print(",");
			System.out.print(i);
			System.out.print(")");
		}
		return i;
	}
	public static int Main()
	{
		String a = new String(new char[1001]);
		int b;
		int i = 0;
		int m = 0;
		int o;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		while (a.charAt(m) != '\0')
		{
			m++;
		}
		while (i < m)
		{
			o = ss(a, i);
			i = i + o;
		}

		return 0;
	}
}

