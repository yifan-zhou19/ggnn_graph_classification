package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int n;
		int max;
	String str = new String(new char[15]);
	String substr = new String(new char[4]);
	while (scanf("%s%s",str,substr) != EOF)
	{
		n = str.length();
	max = 0;
	for (i = 1;str.charAt(i) != '\0';i++)
	{
	if (str.charAt(i) > str.charAt(max))
	{
		max = i;
	}
	}
	for (i = n - 1;i > max;i--)
	{
	str = tangible.StringFunctions.changeCharacter(str, i + 3, str.charAt(i));
	}
	for (i = max + 1,j = 0;i <= max + 3,j < 3;i++,j++)
	{
	str = tangible.StringFunctions.changeCharacter(str, i, substr.charAt(j));
	}
	str = tangible.StringFunctions.changeCharacter(str, n + 3, '\0');
	System.out.printf("%s\n",str);
	}
	}
}

