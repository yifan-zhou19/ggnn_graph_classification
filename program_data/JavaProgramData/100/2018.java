package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String zfc = new String(new char[310]);
		int a;
		int b;
		int c;
		int d;
		char m;
		char n;
		int i;

		d = 0;

		zfc = new Scanner(System.in).nextLine();
		a = zfc.length();
		for (m = 'A';m <= 'Z';m++)
		{
			b = 0;
			for (i = 0;i < a;i++)
			{
				if (zfc.charAt(i) == m)
				{
					b++;
				}
			}

			if (b > 0)
			{
				System.out.printf("%c=%d\n",m,b);
				d++;
			}

		}
		for (n = 'a';n <= 'z';n++)
		{
			c = 0;
			for (i = 0;i < a;i++)
			{
				if (zfc.charAt(i) == n)
				{
					c++;
				}
			}

			if (c > 0)
			{
				System.out.printf("%c=%d\n",n,c);
				d++;
			}

		}
		if (d == 0)
		{
			System.out.print("No");
		}

		return 0;
	}

}
