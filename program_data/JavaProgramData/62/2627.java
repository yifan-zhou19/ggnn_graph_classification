package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 0;
		int num;
		int k = 0;
		String str = new String(new char[1000]);
		String re = new String(new char[1100]);
		str = new Scanner(System.in).nextLine();
		while (str.charAt(j) != '\0')
		{
			j++;
		}
		num = j;
		for (i = 0;i < num;i++)
		{
			if (str.charAt(i) != ' ')
			{
				re = tangible.StringFunctions.changeCharacter(re, k, str.charAt(i));
				k++;
			}
			else
			{
				if (str.charAt(i + 1) != ' ')
				{
					re = tangible.StringFunctions.changeCharacter(re, k, str.charAt(i));
					k++;
				}
			}
		}
		re = tangible.StringFunctions.changeCharacter(re, k, '\0');
		System.out.println(re);
		return 0;
	}
}

