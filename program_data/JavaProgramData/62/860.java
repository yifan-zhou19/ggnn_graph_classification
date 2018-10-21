package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		char m;
		int b;
		int i;
		int j;
		int k;
		a = new Scanner(System.in).nextLine();
		b = a.length();
		for (k = 0;k < b;k++)
		{
			for (i = 1;a.charAt(i);i++)
			{
				if (a.charAt(i) == 32 && a.charAt(i - 1) == 32)
				{
					for (j = i;j < b - 1;j++)
					{
						m = a.charAt(j);
						a = tangible.StringFunctions.changeCharacter(a, j, a.charAt(j + 1));
						a = tangible.StringFunctions.changeCharacter(a, j + 1, m);
					}
				}
			}
		}
		for (i = 0;i < b;i++)
		{
			if (a.charAt(i) == 32 && a.charAt(i + 1) == 32)
			{
				a = tangible.StringFunctions.changeCharacter(a, i, '\0');
				break;
			}
		}
		System.out.printf("%s",a);
		return 0;
	}

}

