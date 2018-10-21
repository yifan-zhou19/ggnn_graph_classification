package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int i;
		int j;
		int k;
		int t;
		a = new Scanner(System.in).nextLine();
		for (t = 0;t < 100;t++)
		{
		for (i = 0;i < a.length();i++)
		{
			for (j = 0;j <= a.length();j++)
			{
				if (a.charAt(j) == ' ' && a.charAt(j + 1) == ' ')
				{
					for (k = j;k < a.length() - 1;k++)
					{
						a = tangible.StringFunctions.changeCharacter(a, k, a.charAt(k + 1));
					}
					a = tangible.StringFunctions.changeCharacter(a, a.length() - 1, '\0');
					break;
				}
			}
		}
		}
		System.out.println(a);
		return 0;
	}
}

