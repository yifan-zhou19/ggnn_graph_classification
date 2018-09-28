package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		for (i = 0;i < 100;i++)
		{
			if (i == 99)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(0));
				j = i;
				break;
			}
			else if (a.charAt(i + 1) == 0 && a.charAt(i + 2) != 0)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(0));
				j = i;
				break;
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
			}
		}
		for (i = 0;i <= j;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}
		return 0;
	}
}

