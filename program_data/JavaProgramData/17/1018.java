package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		for (scanf("%d%*c", n);n > 0;n--)
		{
			String a = new String(new char[101]);
			a = new Scanner(System.in).nextLine();
			System.out.println(a);
			int i;
			int j;
			int k;
			int l = a.length();
			do
			{
			for (j = 0;j < l;j++)
			{
				if (a.charAt(j) == ')')
				{
					break;
				}
			}
			if (j != l)
			{
				for (k = j;k >= 0;k--)
				{
					if (a.charAt(k) == '(')
					{
						break;
					}
				}
				if (k < 0)
				{
					a = tangible.StringFunctions.changeCharacter(a, j, '?');
				}
					else
					{
						a = tangible.StringFunctions.changeCharacter(a, j, a[k] = ' ');
					}
			}
			}while (j != l);
			for (i = 0;i < l;i++)
			{
				if (a.charAt(i) == '(')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, '$');
				}
				else if (a.charAt(i) != '?')
				{
					a = tangible.StringFunctions.changeCharacter(a, i, ' ');
				}
			}
			System.out.println(a);
		}
		return 0;
	}

}

