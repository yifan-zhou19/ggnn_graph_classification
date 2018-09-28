package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String sen = new String(new char[101]);
		String sen2 = new String(new char[101]);
		int i = 0;
		int j = 0;
		int k = 0;
		while (true)
		{
			cin.get(sen.charAt(k));
			if (sen.charAt(k) == '\n')
			{
				break;
			}
			k++;
		}
		for (i = 0; i < k; i++)
		{
			if (sen.charAt(i) != ' ' || (sen.charAt(i) == ' ' && sen.charAt(i - 1) != ' '))
			{
					sen2 = tangible.StringFunctions.changeCharacter(sen2, j, sen.charAt(i));
					j++;
			}
		}
		for (i = 0; i < j; i++)
		{
			System.out.print(sen2.charAt(i));
		}
		return 0;
	}

}

