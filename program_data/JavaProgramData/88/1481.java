package <missing>;

public class GlobalMembers
{
	//????

	public static String out = new String(new char[100]);
	public static int ct;
	public static int sig;

	public static int Main()
	{
		char x;
		while ((x = System.in.read()) != '\n')
		{
			if (x >= '0' && x <= '9')
			{
				out = tangible.StringFunctions.changeCharacter(out, ct, x);
				++ct;
				sig = 1;
			}
			else if (sig)
			{
				out = tangible.StringFunctions.changeCharacter(out, ct, '\n');
				++ct;
				sig = 0;
			}
			else
			{
				continue;
			}
		}

		for (int i = 0; i != ct; ++i)
		{
			System.out.print(out.charAt(i));
		}
		if (out.charAt(ct - 1) != '\n')
		{
			System.out.print("\n");
		}

		return 0;
	}
}

