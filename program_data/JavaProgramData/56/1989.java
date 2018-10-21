package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[6]);
		int c;
		int i = 0;
		do
		{
			 c = System.in.read();
			 a = tangible.StringFunctions.changeCharacter(a, i, c);
			  i++;
		} while (c != '\n');
		i -= 2;
		for (;i >= 0;i--)
		{
			System.out.print(a.charAt(i));
		}
	}

}

