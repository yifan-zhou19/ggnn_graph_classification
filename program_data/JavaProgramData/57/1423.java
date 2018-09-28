package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	String words = new String(new char[33]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	for (j = 0;j < 33;j++)
	{
	words = tangible.StringFunctions.changeCharacter(words, j, '\0');
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		words = tempVar2.charAt(0);
	}
	k = words.length();
	if (k > 2)
	{
	if (words.charAt(k - 1) == 'g')
	{
	if (words.charAt(k - 2) == 'n')
	{
	if (words.charAt(k - 3) == 'i')
	{
	for (j = 1;j < 4;j++)
	{
	words = tangible.StringFunctions.changeCharacter(words, k - j, '\0');
	}
	}
	}
	}
	}
	if (k > 1)
	{
	if (words.charAt(k - 1) == 'r')
	{
	if (words.charAt(k - 2) == 'e')
	{
	for (j = 1;j < 3;j++)
	{
	words = tangible.StringFunctions.changeCharacter(words, k - j, '\0');
	}
	}
	}
	}
	if (k > 1)
	{
	if (words.charAt(k - 1) == 'y')
	{
	if (words.charAt(k - 2) == 'l')
	{
	for (j = 1;j < 3;j++)
	{
	words = tangible.StringFunctions.changeCharacter(words, k - j, '\0');
	}
	}
	}
	}
	System.out.printf("%s\n",words);
	}
	}
}

