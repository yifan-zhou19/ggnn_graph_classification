package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void insert(char * a,char * b);
		String str = new String(new char[14]);
		String substr = new String(new char[3]);
		while (scanf("%s",str) != -1)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				substr = tempVar.charAt(0);
			}
		tangible.RefObject<String> tempRef_str = new tangible.RefObject<String>(str);
		tangible.RefObject<String> tempRef_substr = new tangible.RefObject<String>(substr);
			insert(tempRef_str, tempRef_substr);
			substr = tempRef_substr.argValue;
			str = tempRef_str.argValue;
		}
	}

	public static void insert(tangible.RefObject<String> a, tangible.RefObject<String> b)
	{
		int i;
		int n = 0;
		int m = 1;
		int la;
		int lb;
		final String c = "";
		la = a.argValue.length();
		lb = b.argValue.length();
		for (i = 1;i < la;i++)
		{
			if (*(a.argValue.Substring(i)) > *(a.argValue.Substring(m) - 1))
			{
				m = i + 1;
			}
		}
		for (i = 0;i < la - m;i++)
		{
			c = tangible.StringFunctions.changeCharacter(c, i, *(a.argValue.Substring(m) + i));
			*(a.argValue.Substring(m) + i) = '\0';
		}
		a.argValue += b.argValue;
		a.argValue += c;
		System.out.printf("%s\n",a.argValue);
	}

}

