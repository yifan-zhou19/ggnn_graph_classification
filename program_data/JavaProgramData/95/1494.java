package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String ch1 = new String(new char[80]);
		String ch2 = new String(new char[80]);
		char a;
		int i;
		int j;
		ch1 = new Scanner(System.in).nextLine();
		ch2 = new Scanner(System.in).nextLine();
		for (i = 0;(ch1.charAt(i) != '\0') && (ch2.charAt(i) != '\0');i++)
		{
			if (ch1.charAt(i) > 90)
			{
				ch1 = tangible.StringFunctions.changeCharacter(ch1, i, ch1.charAt(i) - 32);
			}
			if (ch2.charAt(i) > 90)
			{
				ch2 = tangible.StringFunctions.changeCharacter(ch2, i, ch2.charAt(i) - 32);
			}
			j = ch1.charAt(i) - ch2.charAt(i);
			if (j != 0)
			{
				if (j < 0)
				{
					a = '<';
				}
				else
				{
					a = '>';
				}
				break;
			}
			else
			{
				a = '=';
			}
		}
		System.out.printf("%c",a);
		return 0;
	}
}

