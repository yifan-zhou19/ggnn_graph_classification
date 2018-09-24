package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int len;
		int lena;
		String z = new String(new char[4000]);
		z = new Scanner(System.in).nextLine();
		len = z.length();
		b = 0;
		for (a = 0;a <= len - 1;a++)
		{
			if ((b == 0) && z.charAt(a) == ' ')
			{
				continue;
			}
			if (z.charAt(a) != ' ')
			{
				b++;
			}
			if (z.charAt(a) == ' ')
			{
				System.out.printf("%d,",b);
				b = 0;
				continue;
			}
			if ((z.charAt(a) == '.') || (z.charAt(a) == '!') || (z.charAt(a) == '?'))
			{
				if (a != len - 1)
				{
				System.out.printf("%d,",b);
				}
				else
				{
					System.out.printf("%d",b);
					return 0;
				}
				b = 0;
			}
			if (a == len - 1)
			{
				System.out.printf("%d",b);
			}
		}
		return 0;
	}
}
