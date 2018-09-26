package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int b;
	int x = 0;
	int i;
	int l;
	String s = new String(new char[50]);
	a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	s = ConsoleInput.readToWhiteSpace(true).charAt(0);
	b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 0;s.charAt(i) != 0;i++)
	{
	if (s.charAt(i) <= '9')
	{
		x = x * a + s.charAt(i) - 48;
	}
	else if (s.charAt(i) <= 'Z')
	{
		x = x * a + s.charAt(i) - 55;
	}
	else
	{
		x = x * a + s.charAt(i) - 87;
	}
	}
	for (l = 0;x != 0;l++)
	{
	i = x % b;
	if (i < 10)
	{
		s = tangible.StringFunctions.changeCharacter(s, l, i + 48);
	}
	else
	{
		s = tangible.StringFunctions.changeCharacter(s, l, i + 55);
	}
	x /= b;
	}
	for (i = l - 1;i >= 0;i--)
	{
		System.out.print(s.charAt(i));
	}
	if (l == 0)
	{
		System.out.print(0);
	}
	return 0;
	}
}

