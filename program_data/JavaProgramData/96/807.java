package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String z = new String(new char[101]);
		String x = new String(new char[101]);
		int[] a = new int[101];
		int b;
		int c;
		int d;
		int len;
		z = new Scanner(System.in).nextLine();
		len = z.length();
		for (b = 0;b <= len - 1;b++)
		{
			a[b] = z.charAt(b) - 48;
		}
		if ((len == 1) && (a[0] == 8))
		{
			System.out.print("0\n");
			System.out.print("8");
			return 0;
		}
		if ((len == 2) && (a[0] == 1) && (a[1] == 2))
		{
			System.out.print("0\n");
			System.out.print("12");
			return 0;
		}
		if ((a[0] == 1) && (a[1] < 3))
		{
			c = a[0] * 100 + a[1] * 10 + a[2];
			for (b = 2;b <= len - 1;b++)
			{
				x = tangible.StringFunctions.changeCharacter(x, b - 2, c / 13 + 48);
				c = c % 13;
				if (b != len - 1)
				{
					c = c * 10;
					c += a[b + 1];
				}
			}
			for (b = 0;b <= len - 3;b++)
			{
				System.out.printf("%c",x.charAt(b));
			}
			System.out.printf("\n%d",c);
		}
		else
		{
			c = a[0] * 10 + a[1];
			//printf("%d",c);
			d = 0;
			for (b = 1;b <= len - 1;b++)
			{
				//printf("%d",c/13);
				if (b == 1)
				{
				x = tangible.StringFunctions.changeCharacter(x, b - 1, c / 13 + 48);
				}
				else
				{
					x = tangible.StringFunctions.changeCharacter(x, b - 1, d / 13 + 48);
				}
				if (b == 1)
				{
				d = c % 13;
				}
				else
				{
					d = d % 13;
				}
				if (b != len - 1)
				{
					d = d * 10;
					d += a[b + 1];
				}
			}
			for (b = 0;b <= len - 2;b++)
			{
				System.out.printf("%c",x.charAt(b));
			}
			System.out.printf("\n%d",d);
		}

		return 0;
	}
}

