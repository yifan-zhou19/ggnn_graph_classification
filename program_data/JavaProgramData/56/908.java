package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[5]);
		char c;
			int i;
		for (i = 0;(c = System.in.read()) != '\n';i++)
		{
			a = tangible.StringFunctions.changeCharacter(a, i, c);
		}
		i = i - 1;
		while (i >= 0)
		{
			c = a.charAt(i);
			System.out.printf("%c",c);
			i = i - 1;
		}
	}

}

