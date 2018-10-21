package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[6]);
		int i = 0;
		do
		{
		a = tangible.StringFunctions.changeCharacter(a, i, System.in.read());
		i++;
		} while (a.charAt(i - 1) != '\n');
		i--;
		for (int j = i - 1;j >= 0;j--)
		{
		System.out.print(a.charAt(j));
		}
	}

}

