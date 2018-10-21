package <missing>;

public class GlobalMembers
{
	public static void f(String a)
	{
		int i;
		int n;
		String b = new String(new char[500]);
		n = a.length();
		for (i = 0;i <= 499;i++)
		{
			if (i <= n - 1)
			{
				b = tangible.StringFunctions.changeCharacter(b, i, a[n - 1 - i]);
			}
			else
			{
				b = tangible.StringFunctions.changeCharacter(b, i, '\0');
			}
		}

		if (strcmp(a,b) == 0)
		{
			System.out.println(a);
		}
	}

	public static void Main()
	{
		String s = new String(new char[500]);
		s = new Scanner(System.in).nextLine();
		int n = s.length();

		int l;
		for (l = 1;l <= n - 1;l++)
		{
			String a = new String(new char[500]);
			int i;
			for (i = 0;i <= n - 1 - l;i++)
			{
				int k;
				for (k = 0;k <= 499;k++)
				{
					if (k <= l)
					{
						a = tangible.StringFunctions.changeCharacter(a, k, s.charAt(i + k));
					}
					else
					{
						a = tangible.StringFunctions.changeCharacter(a, k, '\0');
					}
				}

				f(a);
			}
		}
	}
}

