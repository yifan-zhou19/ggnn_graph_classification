package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int e;
		int u;
		int x = 0;
		int y;
		String z1 = new String(new char[201]);
		z1 = new Scanner(System.in).nextLine();
		e = z1.length();
		for (i = 1;i < e;i++)
		{
			if ((z1.charAt(i - 1) == ' ' || z1.charAt(i - 1) == '1') && (z1.charAt(i) == ' '))
			{
				z1 = tangible.StringFunctions.changeCharacter(z1, i, '1');
			}
		}
		for (i = 0;i < e;i++)
		{
			if (z1.charAt(i) == '1')
			{
			}
			else
			{
				System.out.printf("%c",z1.charAt(i));
			}
		}
		return 0;
	}
}

