package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		String za = new String(new char[101]);
		za = new Scanner(System.in).nextLine();

		for (i = 1;za.charAt(i);)
		{
			if (za.charAt(i) == ' ' && za.charAt(i + 1) == ' ')
			{
				for (j = i;za.charAt(j);j++)
				{
					za = tangible.StringFunctions.changeCharacter(za, j, za.charAt(j + 1));
				}
			}
			else
			{
				i++;
			}
		}
		System.out.println(za);
		return 0;
	}
}

