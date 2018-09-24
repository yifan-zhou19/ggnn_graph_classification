package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String c = new String(new char[5]);
		int i; //k???????i????????
		int t;
		int k;
		int l;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			c = tempVar.charAt(0);
		}
		k = c.length();
		l = k / 2;
		for (i = 0;i < l;i++)
		{
			t = c.charAt(i);
			c = tangible.StringFunctions.changeCharacter(c, i, c.charAt(k - i - 1));
			c = tangible.StringFunctions.changeCharacter(c, k - i - 1, t);
		}
		System.out.printf("%s",c);
		return 0;
	}
}

