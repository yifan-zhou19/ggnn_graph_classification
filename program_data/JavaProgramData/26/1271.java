package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[101]);
		int i;
		int j;
		int n;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		i = 0;
		while (i < n)
		{
			if (a.charAt(i) == ' ' && a.charAt(i + 1) == ' ')
			{
				for (j = i + 1;j < n + 1;j++)
				{
					a = tangible.StringFunctions.changeCharacter(a, j - 1, a.charAt(j));
				}
				i = i;
			}
			else
			{
				i++;
			}
		}
		System.out.println(a);
		return 0;
	}

}

