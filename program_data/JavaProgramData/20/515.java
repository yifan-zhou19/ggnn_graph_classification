package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String str = new String(new char[15]);
	String substr = new String(new char[4]);
	String p;
	int i;
	int n;
	int j;
	int k;
	while (scanf("%s%s",str,substr) != EOF)
	{


	p = str.charAt(0);
	n = str.length();
	for (i = 0;i < n;i++)
	{
	if (p < str.charAt(i))
	{
	p = str.charAt(i);
	j = i;
	}
	}
	for (i = n - 1;i > j;i--)
	{
	str = tangible.StringFunctions.changeCharacter(str, i + 3, str.charAt(i));
	}
	*(p.Substring(1)) = substr.charAt(0);
	*(p.Substring(2)) = substr.charAt(1);
	*(p.Substring(3)) = substr.charAt(2);
	str = tangible.StringFunctions.changeCharacter(str, n + 3, '\0');

	System.out.printf("%s\n",str);
	}
	return 0;
	}
}

