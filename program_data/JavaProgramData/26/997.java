package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k = 0;
		int e;
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		a = new Scanner(System.in).nextLine();
		b = tangible.StringFunctions.changeCharacter(b, 0, a.charAt(0));
		for (n = 0;a.charAt(n) != '\0';n++)
		{
			;
		}
		for (i = 1;i < n + 1;i++)
		{
			if (a.charAt(i) != ' ' && a.charAt(i) != '\0')
			{
				k++;
				b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(i));
			}
			if ((a.charAt(i) == ' ' && a.charAt(i + 1) != ' ' && a.charAt(i - 1) != ' ') || (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ' && a.charAt(i - 1) != ' '))
			{
				k++;
				b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(i));
			}
			if (a.charAt(i) == '\0')
			{
				k++;
				b = tangible.StringFunctions.changeCharacter(b, k, a.charAt(i));
			}
		}
		System.out.printf("%s",b);
		return 0;
	}


}

