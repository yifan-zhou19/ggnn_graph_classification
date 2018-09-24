package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int N;
	N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (N == 0)
	{
		System.out.print("1");
		return 0;
	}
	final String a = "2";
	for (int i = 0; i < N - 1; i++)
	{
	String b = new String(new char[1000]);
	int yushu = 0;
	int j;
	for (j = 0; j < a.length(); j++)
	{
	b = tangible.StringFunctions.changeCharacter(b, j, (a.charAt(j) - '0') * 2 + yushu);
	yushu = b.charAt(j) / 10;
	b = tangible.StringFunctions.changeCharacter(b, j, b.charAt(j) % 10 + '0');
	}
	if (yushu != 0)
	{
		b = tangible.StringFunctions.changeCharacter(b, j, yushu + '0');
		b = tangible.StringFunctions.changeCharacter(b, j + 1, '\0');
	}
	else
	{
		b = tangible.StringFunctions.changeCharacter(b, j, '\0');
	}
	a = b;
	}
	for (int i = a.length() - 1 ; i >= 0; i--)
	{
	System.out.print(a.charAt(i));
	}
	}
}

