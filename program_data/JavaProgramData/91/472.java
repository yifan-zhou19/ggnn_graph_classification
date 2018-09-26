package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int c;
		String a = new String(new char[103]);
		String b = new String(new char[103]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 103;i++)
		{
			if (a.charAt(i + 1) == '\0')
			{
				c = i;
				break;
			}
			b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
		}
		b = tangible.StringFunctions.changeCharacter(b, c, a.charAt(c) + a.charAt(0));
		for (i = 0;i < 103;i++)
		{
			if (i == c + 1)
			{
				System.out.print("\n");
				break;
			}
			else
			{
				System.out.printf("%c",b.charAt(i));
			}
		}
		return 0;
	}
}

