package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int i;
	int j;
	int k;
	int max = 0;
	String str1 = new String(new char[11]);
	String substr = new String(new char[4]);
	String str2 = new String(new char[14]);
	String str3 = new String(new char[11]);
	while (scanf("%s %s",str1,substr) != EOF)
	{
		for (i = 0;i < 14;i++)
		{
		str2 = tangible.StringFunctions.changeCharacter(str2, i, '\0');
		str3 = tangible.StringFunctions.changeCharacter(str3, i, '\0');
		}
	max = 0;
	for (i = 0;str1.charAt(i) != '\0';i++)
	{
	if (str1.charAt(i) > max)
	{
		max = str1.charAt(i);
		k = i;
	}
	}
	str2 = str1.substring(0, k + 1);
	str2 += substr;
	for (i = k + 1,j = 0;str1.charAt(i) != '\0';i++,j++)
	{
	str3 = tangible.StringFunctions.changeCharacter(str3, j, str1.charAt(i));
	}
	str2 += str3;
	System.out.printf("%s\n",str2);
	}
	}
}

