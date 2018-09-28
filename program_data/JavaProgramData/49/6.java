package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[512]);
		String b = new String(new char[512]);
		String c = new String(new char[512]);
		String d = new String(new char[512]);
		int i;
		int len;
		int k;
		int j;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 1;i * 2 <= len;i++)
		{
			k = 0;
			for (j = 0;j + 2 * i <= len;j++)
			{
				for (k = 0;k < i;k++)
				{
					b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(j + k));
					b = tangible.StringFunctions.changeCharacter(b, 2 * i - 1 - k, a.charAt(j + 2 * i - 1 - k));
					c = tangible.StringFunctions.changeCharacter(c, k, a.charAt(j + k));
					d = tangible.StringFunctions.changeCharacter(d, k, a.charAt(j + 2 * i - 1 - k));
				}
				b = b.substring(0, 2 * i);
				c = c.substring(0, i);
				d = d.substring(0, i);
				if (!strcmp(c,d))
				{
					System.out.printf("%s\n",b);
				}
			}
		}
		return 0;
	}
}

