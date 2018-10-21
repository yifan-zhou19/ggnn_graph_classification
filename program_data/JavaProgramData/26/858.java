package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sz = new String(new char[101]);
		String c = new String(new char[101]);
		int n;
		int k;
		int len;
		int m;
		sz = new Scanner(System.in).nextLine();
		len = sz.length();
		c = tangible.StringFunctions.changeCharacter(c, 0, sz.charAt(0));
		n = 1;
		for (k = 1;k < len;k++)
		{
				if (sz.charAt(k - 1) == ' ' && sz.charAt(k) == ' ')
				{
					c = c.substring(0, n);
				}
				else
				{
					c = tangible.StringFunctions.changeCharacter(c, n, sz.charAt(k));
					n++;
				}
		}
		for (m = 0;m < n;m++)
		{
					System.out.printf("%c",c.charAt(m));
		}
		return 0;
	}
}

