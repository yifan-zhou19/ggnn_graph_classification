package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[301]);
		String z = new String(new char[301]);
		char q;
		a = new Scanner(System.in).nextLine();
		int i;
		int j = 0;
		int n;
		int m = 1;
		int l = 1;
		for (i = 0;1;i++)
		{
			if (a.charAt(i) == '\0')
			{
			z = tangible.StringFunctions.changeCharacter(z, j, a.charAt(i));
			break;
			}
			if ((a.charAt(i) >= 'a' && a.charAt(i) <= 'z') || (a.charAt(i) >= 'A' && a.charAt(i) <= 'Z'))
			{

			z = tangible.StringFunctions.changeCharacter(z, j, a.charAt(i));
			j++;
			l = 0;
			}

		}
		if (l != 0)
		{
		System.out.print("No");
		}
		n = z.length();
		for (j = n - 1;j > 1;j--)
		{
			for (i = 0;i < j;i++)
			{
				if (z.charAt(i) > z.charAt(i + 1))
				{
				q = z.charAt(i);
				z = tangible.StringFunctions.changeCharacter(z, i, z.charAt(i + 1));
				z = tangible.StringFunctions.changeCharacter(z, i + 1, q);
				}
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (z.charAt(i) == z.charAt(i - 1))
			{
			m++;
			}
			else
			{
			System.out.printf("%c=%d\n",z.charAt(i - 1),m);
			m = 1;
			}
		}
	return 0;
	}
}

