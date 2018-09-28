package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		String b = new String(new char[50]);
		String c = new String(new char[50]);
		int m;
		int n;
		int x;
		int y;
		int z;
		int sum = 0;
		a = new Scanner(System.in).nextLine();
		x = a.length();
		for (m = 0;m < x;m++)
		{
			if (a.charAt(m) == ' ')
			{
			for (n = 0;n < m;n++)
			{
		b = tangible.StringFunctions.changeCharacter(b, n, a.charAt(n));
			}
		b = tangible.StringFunctions.changeCharacter(b, m, '\0');
		for (n = m + 1;n < x;n++)
		{
		c = tangible.StringFunctions.changeCharacter(c, n - m - 1, a.charAt(n));
		}
		c = tangible.StringFunctions.changeCharacter(c, x - m - 1, '\0');
			}
		}
		y = b.length();
		z = c.length();
		if (y != z)
		{
			System.out.print("NO\n");
		return 0;
		}
		else
		{
			for (m = 0;m < y;m++)
			{
			 for (n = 0;n <= z;n++)
			 {
		  if (c.charAt(n) == b.charAt(m))
		  {
			   c = tangible.StringFunctions.changeCharacter(c, n, '0');
			b = tangible.StringFunctions.changeCharacter(b, m, '0');
			break;
		  }
			else if (n == z)
			{
				System.out.print("NO\n");
			return 0;
			}
			 }
			}
		  System.out.print("YES\n");
		}
	}
}

