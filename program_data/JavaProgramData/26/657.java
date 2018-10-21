package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j;
		int k;
		String str = new String(new char[100]);

		str = new Scanner(System.in).nextLine();

		n = str.length();

		for (i = 1;i <= n;i++)
		{
			for (k = 1;k < 101;k++)
			{
				if (str.charAt(i - 1) == ' ' && str.charAt(i) == ' ')
				{
					for (j = i;j < n;j++)
					{
					str = tangible.StringFunctions.changeCharacter(str, j, str.charAt(j + 1));
					}
				}
			}
		}

		System.out.printf("%s\n",str);

		return 0;
	}

}

