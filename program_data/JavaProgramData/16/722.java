package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		i = 0;
		String a = new String(new char[9]);
		char ch;
		while ((ch = System.in.read()) != '\n')
		{
			a = tangible.StringFunctions.changeCharacter(a, i, ch);
			i = i + 1;
		}
		i = i - 1;
		while (i >= 0)
		{
			System.out.print(a.charAt(i));
			i = i - 1;
		}
		System.out.print("\n");
		return 0;
	}

}

