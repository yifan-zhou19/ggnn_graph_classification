package <missing>;

public class GlobalMembers
{
	public static void body()
	{
		String str = new String(new char[11]);
		String substr = new String(new char[4]);
		char c;
		int i = 0;
		int k;
		int s = 0;
		String p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			substr = tempVar2.charAt(0);
		}
		c = (str + str.length() - 1);
		k = str.length();
		for (i = str.length() - 1;i > -1;i--)
		{
			if (str.charAt(i) >= c)
			{
				k = i + 1;
				c = (str.Substring(i));
			}
		}
		p = str;
		if (str.length() >= 11 || substr.length() >= 4)
		{
			return;
		}
		for (i = 0;i < k;i++)
		{
			System.out.printf("%c",*(p.Substring(i)));
		}
		System.out.printf("%s",substr);
		System.out.printf("%s\n",p.Substring(i));
		body();
	}

	public static void Main()
	{
		body();
	}
}

