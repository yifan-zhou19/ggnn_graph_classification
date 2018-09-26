package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String str = new String(new char[101]);
		int i;
		int j;
		str = new Scanner(System.in).nextLine();
		for (i = 0;i < 101;i++)
		{
			while ((str.charAt(i) == ' ') && (str.charAt(i + 1) == ' '))
			{
				for (j = i + 1;j < 101;j++)
				{
					str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j + 1));
				}
			}
		}
		System.out.println(str);
		return 0;
	}
}

