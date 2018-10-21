package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int m;
		int n;
		String str = new String(new char[100]);
		final String string = "";
		str = new Scanner(System.in).nextLine();
		n = str.length();
		for (i = 0;str.charAt(i) != '\0',i < n - 1;i++)
		{
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) == ' '))
			{
				for (m = i;m < n - 1;m++)
				{
		 str = tangible.StringFunctions.changeCharacter(str, m, str.charAt(m + 1));
				}
		n--;
		i = 0;
			}
		}
		String = str.substring(0, n);
		System.out.printf("%s",String);
		return 0;
	}

}

