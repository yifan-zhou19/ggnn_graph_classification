package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int k;
		int I1;
		int I2;
		int J1;
		int J2;
		int l;
		int m;
		int n;
		String s = new String(new char[10000]);
		s = new Scanner(System.in).nextLine();
		l = s.length();
		I1 = J1 = 0;
		x = 0;
		for (i = 1;i < l + 1;i++)
		{
			if ((s.charAt(i) == ' ') || (s.charAt(i) == '\0'))
			{
				k = x = m = n = i;
				I2 = J2 = i - 1;
				break;
			}
		}
		for (i = k + 1;i < l;i++)
		{
			if (s.charAt(i) == ' ')
			{
				y = i - x - 1;
				if (y > m)
				{
					m = y;
					I1 = x + 1;
					I2 = i - 1;
				}
				if (y < n)
				{
					n = y;
					J1 = x + 1;
					J2 = i - 1;
				}
				x = i;
			}
		}
		y = l - 1 - x;
		if (y > m)
		{
			m = y;
			I1 = x + 1;
			I2 = l - 1;
		}
		if ((y > 0) && (y < n))
		{
			n = y;
			J1 = x + 1;
			J2 = l - 1;
		}
		for (i = I1;i <= I2;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.print("\n");
		for (i = J1;i <= J2;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		return 0;
	}

}
