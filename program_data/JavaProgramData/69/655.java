package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int m;
		int n;
		int i;
		int j;
		int r;
		String x = new String(new char[1000]);
		String y = new String(new char[1000]);
		x = new Scanner(System.in).nextLine();
		y = new Scanner(System.in).nextLine();
		i = x.length();
		j = y.length();
		i--;
		j--;
		r = i > j != 0?i:j;
		for (a = 0;a <= i + 1;a++)
		{
			x = tangible.StringFunctions.changeCharacter(x, r + 1 - a, x.charAt(i + 1 - a));
			y = tangible.StringFunctions.changeCharacter(y, r + 1 - a, y.charAt(j + 1 - a));
		}
		for (a = 0;a <= r - i - 1;a++)
		{
		x = tangible.StringFunctions.changeCharacter(x, a, '0');
		}
		for (a = 0;a <= r - j - 1;a++)
		{
		y = tangible.StringFunctions.changeCharacter(y, a, '0');
		}
		int[] z = new int[1000];
		m = 0;
		for (a = r;a >= 0;a--)
		{
			n = (x.charAt(a) - '0') + (y.charAt(a) - '0') + m;
			z[a] = n % 10;
			m = n / 10;
		}
		if (m == 0)
		{
			for (a = 0;a <= r;a++)
			{
				if (z[a] != 0)
				{
				break;
				}
				else
				{
					;
				}
			}
			if (a == r + 1)
			{
			System.out.print("0");
			}
			else
			{
				;
			}
			{
				for (b = a;b <= r;b++)
				{
				System.out.printf("%d",z[b]);
				}
		}
		}
		else
		{
			System.out.printf("%d",m);
			for (a = 0;a <= r;a++)
			{
			System.out.printf("%d",z[a]);
			}
		}
	}
}

