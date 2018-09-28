package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int i;
		int j;
		int len;
		int num = 0;
		a = new Scanner(System.in).nextLine();
		len = a.length();
		for (i = 0; i < len; i++)
		{
			while (a.charAt(i) == ' ')
			{
				num++;
				i++;
				if (a.charAt(i) != ' ')
				{
					for (j = i; j < len; j++)
					{
						a = tangible.StringFunctions.changeCharacter(a, j - num + 1, a.charAt(j));
					}
					len = len - num + 1;
					a = tangible.StringFunctions.changeCharacter(a, len, '\0');
					i = i - num + 1;
					num = 0;
				}

			}
		}
		for (i = 0; i < len; i++)
		{
			System.out.print(a.charAt(i));
		}
		return 0;
	}
}

