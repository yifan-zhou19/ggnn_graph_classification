package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[200]);
		String b = new String(new char[100]);
		String c = new String(new char[100]);
		String d = new String(new char[200]);
		int i;
		int j;
		int na = 0;
		int nb = 0;
		int nc = 0;
		int m = 0;
		int l = 0;
		int x = 0;
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		c = new Scanner(System.in).nextLine();
		for (i = 0;a.charAt(i) != '\0';i++)
		{
			na++;
		}
		for (i = 0;b.charAt(i) != '\0';i++)
		{
			nb++;
		}
		for (i = 0;c.charAt(i) != '\0';i++)
		{
			nc++;
		}
		for (i = 0;i <= na + x * (nc - nb) - 1;i++)
		{
			if (a.charAt(i) == b.charAt(0))
			{
				l = 1;
				for (j = 1;j <= nb - 1;j++)
				{
					if (a.charAt(i + j) != b.charAt(j))
					{
						break;
					}
					else
					{
						l = l + 1;
					}
				}
				if (((l == nb) && (a.charAt(i - 1) == ' ') && (a.charAt(i + nb) == ' ')) || ((i == 0) && (l == nb) && (a.charAt(i + nb) == ' ')) || ((l == nb) && (i >= na + x * (nc - nb) - nb - 1) && (a.charAt(i - 1) == ' ')))
				{
					for (m = i + nb;m <= na + 2;m++)
					{
						d = tangible.StringFunctions.changeCharacter(d, m - i - nb, a.charAt(m));
					}
					for (m = i;m <= i + nc - 1;m++)
					{
						a = tangible.StringFunctions.changeCharacter(a, m, c.charAt(m - i));
					}
					for (m = i + nc;m <= na + nc - nb + 2;m++)
					{
						a = tangible.StringFunctions.changeCharacter(a, m, d.charAt(m - i - nc));
					}
					i = i + nc - nb;
					x = x + 1;
				}
			}
		}
		a = tangible.StringFunctions.changeCharacter(a, na + x * (nc - nb), '\0');
		System.out.printf("%s",a);
		return 0;
	}


}

