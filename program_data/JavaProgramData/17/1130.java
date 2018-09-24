package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[110]);
		int i;
		int j;
		int l;
		while (scanf("%s",a) == 1)
		{
			System.out.printf("%s\n",a);
			l = a.length();
			for (i = 0;i < l;i++)
			{
				if (a.charAt(i) != '(' && a.charAt(i) != ')')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, ' ');
				}
			}
			for (i = 1;i < l;i++)
			{
				if (a.charAt(i) == ')')
				{
					for (j = i - 1;j >= 0;j--)
					{
						if (a.charAt(j) == '(')
						{
							a = tangible.StringFunctions.changeCharacter(a, i, ' ');
							a = tangible.StringFunctions.changeCharacter(a, j, ' ');
							break;
						}
					}
				}
			}
			for (i = 0;i < l;i++)
			{
				if (a.charAt(i) == '(')
				{
					System.out.print("$");
				}
				if (a.charAt(i) == ')')
				{
					System.out.print("?");
				}
				if (a.charAt(i) == ' ')
				{
					System.out.print(" ");
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}

