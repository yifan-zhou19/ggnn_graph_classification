package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int n;
		int x;
		int m;
		a = new Scanner(System.in).nextLine();
		for (n = 0,x = 1;a.charAt(n) != '\0';n++)
		{
			if (a.charAt(n) == a.charAt(0))
			{
				x = 0;
			}
			else if (a.charAt(n) != ' ')
			{
				for (m = n - 1;m >= 0;m--)
				{
					if (a.charAt(m) == a.charAt(0))
					{
						System.out.printf("%d ",m);
						a = tangible.StringFunctions.changeCharacter(a, m, ' ');
						break;
					}
				}
				System.out.printf("%d\n",n);
				a = tangible.StringFunctions.changeCharacter(a, n, ' ');
				n = 0;
				x = 1;
			}
			if (a.charAt(n + 1) == '\0')
			{
				break;
			}
		}
		return 0;
	}
}

