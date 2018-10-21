package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[1000]);
		int n;
		int i;
		a = new Scanner(System.in).nextLine();
		int zimu = char x;
		n = a.length();
		for (i = 1;i < n - 1;i++)
		{
			if (a.charAt(i) == ' ')
			{
				if (zimu(a.charAt(i - 1)) == 1)
				{
				  if (zimu(a.charAt(i + 1)) == 0)
				  {
					  a = tangible.StringFunctions.changeCharacter(a, i, '1');
				  }
				}
				if (zimu(a.charAt(i - 1)) == 0)
				{
					if (zimu(a.charAt(i + 1)) == 0)
					{
						a = tangible.StringFunctions.changeCharacter(a, i, '1');
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a.charAt(i) != '1')
			{
				System.out.printf("%c",a.charAt(i));
			}
		}
		return 0;
	}


	public static int zimu(char x)
	{
		int a;
		if ((x >= 65 && x <= 90) || (x >= 97 && x <= 122))
		{
			a = 1;
		}
		else
		{
			a = 0;
		}
		return a;
	}
}

