package <missing>;

public class GlobalMembers
{
	public static int locate(String str, int len)
	{
	int i;
	int a;
	int b;
	a = str[0];
	b = 0;
	for (i = 1;i < len;i++)
	{
		if (a < str[i])
		{
				b = i;
				a = str[i];
		}
	}
	return (b + 1);
	}
	public static int Main()
	{
	int i;
	int a;
	int len;
	int lena;
	String str = new String(new char[11]);
	String substr = new String(new char[4]);
	String result = new String(new char[14]);
	while (scanf("%s%s",str,substr) != EOF)
	{
	len = substr.length();
	lena = str.length();
	a = locate(str, lena);
	for (i = 0;i < a;i++)
	{
		result = tangible.StringFunctions.changeCharacter(result, i, str.charAt(i));
	}
	for (i = a;i < len + a;i++)
	{
		result = tangible.StringFunctions.changeCharacter(result, i, substr.charAt(i - a));
	}
	for (i = len + a;i < len + lena;i++)
	{
		result = tangible.StringFunctions.changeCharacter(result, i, str.charAt(i - len));
	}
	result = tangible.StringFunctions.changeCharacter(result, len + lena, '\0');
	System.out.println(result);
	}
	}
}

