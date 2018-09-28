package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		char c;
		int i = 0;
		//i????
		while (cin.get(c))
		{
			if (c == '\n')
			{
				break;
			}
			else
			{
				a = tangible.StringFunctions.changeCharacter(a, i, c);
			i = i + 1;
			}
		}

		int j = 0;
		int count = 0;
		//count????????
		for (j = 0;j <= i;j++)
		{
			if (j == i)
			{
				break;
			}
			if (a.charAt(j) != ' ')
			{
				System.out.print(a.charAt(j));
				count = 0;
			}
			if (a.charAt(j) == ' ' && count == 0)
			{
				count = count + 1;
				System.out.print(a.charAt(j));
			}
			if (a.charAt(j) == ' ' && count == 1)
			{
				count = 1;
			}

		}

		return 0;
	}

	//while(c=getchar( ))
}

