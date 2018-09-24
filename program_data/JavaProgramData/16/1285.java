package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i = 0;
	String ch = new String(new char[100000]);
	char tes;

	for (;;i++)
	{
		ch = tangible.StringFunctions.changeCharacter(ch, i, System.in.read());
		if (ch.charAt(i) == '\n')
		{
			break;
		}

	}

	for (;i >= 0;i--)
	{
		System.out.print(ch.charAt(i));
	}
	System.out.print("\n");

		return 0;
	}
}

