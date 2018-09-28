package <missing>;

public class GlobalMembers
{
	public static String x = new String(new char[N]);
	public static int Rtoten(int R, String shu)
	{
		int i;
		int s = 0;
		int m = shu.length();
		for (i = 0;i < m;i++)
		{
			if (shu[i].compareTo('A') >= 0 && shu[i].compareTo('Z') <= 0 || shu[i].compareTo('a') >= 0 && shu[i].compareTo('z') <= 0)
			{
				(shu[i] |= 0x20) -= 0x57;
			}

			if (shu[i].compareTo('0') >= 0 && shu[i].compareTo('9') <= 0)
			{
				shu[i] = shu[i] - '0';
			}
		}
		for (i = 0;i < m;i++)
		{
			s = s * R + shu[i];
		}
		return s;
	}
	public static void shiR(int c,int R)
	{
		int i;
		int m;
		int temp;
		for (i = 0;c != 0;i++)
		{
			if ((x[i] = c % R + '0') > '9')
			{
				x.charAt(i) += 7;
			}
			c = c / R;
		}
		x = tangible.StringFunctions.changeCharacter(x, i, '\0');

		m = x.length();
		for (i = 0;i < m / 2;i++)
		{
			temp = x.charAt(i);
			x = tangible.StringFunctions.changeCharacter(x, i, x.charAt(m - i - 1));
			x = tangible.StringFunctions.changeCharacter(x, m - i - 1, temp);
		}
	}
	public static int Main()
	{
		int a;
		int b;
		int i;
		int c;
		int count = 0;
		String shu = new String(new char[N]);
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		shu = ConsoleInput.readToWhiteSpace(true).charAt(0);
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < shu.length();i++)
		{
			if (shu.charAt(i) == '0')
			{
				count++;
			}
		}
		if (count == shu.length())
		{
			System.out.print("0");
			System.out.print("\n");
		}
		else
		{
		c = Rtoten(a, shu);
		shiR(c, b);
		int m = x.length();
		for (i = 0;i < m;i++)
		{
			System.out.print(x.charAt(i));
		}

	  System.out.print("\n");
		}

	  return 0;
	}

}

