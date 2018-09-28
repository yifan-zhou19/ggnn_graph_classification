package <missing>;

public class GlobalMembers
{
	// ????.cpp : Defines the entry point for the console application.
	// ?????????
	public static int Main()
	{
	String a = new String(new char[100]);
	String b = new String(new char[100]);
	int p = 0;
	int q = 0;
	int m;
	int n;
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	a = ConsoleInput.readToWhiteSpace(true).charAt(0);
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < a.length();i++)
	{
	if (a.charAt(i) >= 'a')
	{
	a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'a' + 10);
	}
	else if (a.charAt(i) >= 'A')
	{
	a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 'A' + 10);
	}
	else
	{
	a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - '0');
	}
	p = p * m + a.charAt(i);
	}
	while (p > 0)
	{
	b = tangible.StringFunctions.changeCharacter(b, q, p % n);
	if (b.charAt(q) >= 10)
	{
	b = tangible.StringFunctions.changeCharacter(b, q, b.charAt(q) - 10 + 'A');
	}
	else
	{
	b = tangible.StringFunctions.changeCharacter(b, q, b.charAt(q) + '0');
	}
	p = p / n;
	q++;
	}
	for (int i = q - 1;i >= 0;i--)
	{
	System.out.print(b.charAt(i));
	}
	if (q == 0)
	{
		System.out.print(0);
	}
	System.out.print("\n");
	return 0;
	}

}

