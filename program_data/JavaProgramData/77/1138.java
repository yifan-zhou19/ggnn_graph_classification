package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String a = new String(new char[100]);
		char m;
		a = new Scanner(System.in).nextLine();
		n = a.length();
		m = a.charAt(0);
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) != m)
			{
				for (j = i - 1;j >= 0;j--)
				{
					if (a.charAt(j) == m)
					{
						System.out.printf("%d %d\n",j,i);
						a = tangible.StringFunctions.changeCharacter(a, i, ' ');
						a = tangible.StringFunctions.changeCharacter(a, j, ' ');
						break;
					}
				}
			}
		}
		return 0;
	}

}

