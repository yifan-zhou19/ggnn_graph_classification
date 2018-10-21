package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER WARNING: The following constructor is declared outside of its associated class:
	public static cha(String c, String d)
	{
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		String a;
		final String b = "";
		int i = 0;
		char k;
		p = c;
		k = p;
		for (p = c + 1; * p != '\0';p++)
		{
			if (*p > k)
			{
				k = p;
				a = p;
			}
		}
		p = a.Substring(1);
		for (; * p != '\0';p++)
		{
			b = tangible.StringFunctions.changeCharacter(b, i++, *p);
			*p = '\0';
		}
		c += d;
		c += b;
	}
	public static int Main()
	{
		final String c = "";
		final String d = "";
		final String e = "";
		while (scanf("%s%s",c,d) != EOF)
		{
			cha(c, d);
			System.out.printf("%s\n",c);
			c = e;
			d = e;
		}
	}


}

