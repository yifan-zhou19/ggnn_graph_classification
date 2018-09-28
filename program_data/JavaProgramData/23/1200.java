package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i = 0;
	int n;
	int j = 0;
	int k;
	int sub;
	int first = 0;
	String str = new String(new char[100]);
	final String s = "";
	String word = new String(new char[100]);
	final String t = "";
	str = new Scanner(System.in).nextLine();
	n = str.length();
	for (i = 0;i <= n - 1;i++)
	{
	j = 0;
	while (str.charAt(i) != ' ' && str.charAt(i) != '\0')
	{
	word = tangible.StringFunctions.changeCharacter(word, j, str.charAt(i));
	i++;
	j++;
	}

	sub = s.length();
	for (k = 0;k <= j - 1;k++)
	{
	t = tangible.StringFunctions.changeCharacter(t, k, word.charAt(k));
	}
	if (first != 0)
	{
		t = tangible.StringFunctions.changeCharacter(t, j, ' ');
	}
	for (k = 0;k <= sub - 1;k++)
	{
	t = tangible.StringFunctions.changeCharacter(t, j + k + 1, s.charAt(k));
	}

	for (k = 0;k <= sub + j;k++)
	{
	s = tangible.StringFunctions.changeCharacter(s, k, t.charAt(k));
	}
	first = 1;
	}
	System.out.println(s);
	}
}

