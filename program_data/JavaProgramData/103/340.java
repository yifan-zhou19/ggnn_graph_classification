package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int t;
		String a = new String(new char[1000]);
		char b;
		a = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (i = 0;i < a.length();i++)
		{
			if (a.charAt(i) > 96)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, a.charAt(i) - 32);
			}
		}
		b = a.charAt(0);
		t = 1;
		for (i = 1;i < a.length() + 1;i++)
		{
			if (a.charAt(i) == b)
			{
				t = t + 1;
			}
			else
			{
				System.out.print("(");
				System.out.print(b);
				System.out.print(",");
				System.out.print(t);
				System.out.print(")");
				b = a.charAt(i);
				t = 1;
			}
		}
		System.out.print("\n");
		return 0;
	}

}

