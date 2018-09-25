package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char c;
		int i = 0;
		int j;
		while ((c = System.in.read()) != '\n')
		{
			a = tangible.StringFunctions.changeCharacter(a, i, c);
			i++;
		}
		for (j = 0;j < i - 1;j++)
		{
			System.out.printf("%c",a.charAt(j) + a.charAt(j + 1));
		}
		System.out.printf("%c",a.charAt(i - 1) + a.charAt(0));
		return 0;
	}
}

