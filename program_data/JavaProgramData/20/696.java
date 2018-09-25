package <missing>;

public class GlobalMembers
{
	public static int findmax(String str, int len)
	{
		char c = str[0];
		int p = 0;
		int i;
		for (i = 0;i < len;i++)
		{
			if (str[i].compareTo(c) > 0)
			{
				p = i;
				c = str[i];
			}
		}
		return p;
	}

	public static void Main()
	{
		char c;
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		int p;
		int l;

		while (scanf("%s %s",str,substr) != EOF)
		{

		p = findmax(str, l = str.length());
		p++;
		c = str.charAt(p);
		str = str.substring(0, p);

		System.out.printf("%s%s",str,substr);

		str = tangible.StringFunctions.changeCharacter(str, p, c);
		if (p <= l)
		{
			System.out.printf("%s\n", str.charAt(p));
		}
		else
		{
			System.out.print("\n");
		}
		}
	}
}

