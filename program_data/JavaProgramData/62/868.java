package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String zf = new String(new char[200]);
	zf = new Scanner(System.in).nextLine();
	int i = 0;
	int k;
	int s;
	int b;
	int len = zf.length();
	while (zf.charAt(i) != null)
	{
		if (zf.charAt(i) == ' ' && zf.charAt(i + 1) == ' ')
		{
		 b = i;
		 k = i;
		while (zf.charAt(k) == ' ')
		{
		 k = k + 1;
		}
		s = k - i;
		while (b <= len - s)
		{
			zf = tangible.StringFunctions.changeCharacter(zf, b + 1, zf.charAt(b + s));
			b++;

		}
		len = len - s + 1;
		}
		i = i + 1;

	}

	System.out.printf("%s",zf);

	return 0;
	}

}

