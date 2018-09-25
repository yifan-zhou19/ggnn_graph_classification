package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int len;
		int i;
		String a = new String(new char[100]);
		String b = new String(new char[100]);
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0;i < len;i++)
		{
			if (i != len - 1)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(i + 1));
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a.charAt(i) + a.charAt(0));
			}
		}
		for (i = 0;i < len;i++)
		{
			System.out.printf("%c",b.charAt(i));
		}



		return 0;
	}
}

