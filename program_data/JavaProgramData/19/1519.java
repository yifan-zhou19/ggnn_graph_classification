package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String s = new String(new char[1000]);
		String a = new String(new char[1000]);
		String b = new String(new char[1000]);
		int ns;
		int na;
		int nb;
		int i;
		int j;
		int k = 0;
		int m;
		int flag;
		int[] p = new int[100];

		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		ns = s.length();
		na = a.length();
		nb = b.length();

		for (i = 0,j = 0,k = 0;i < na,j < ns;j++)
		{
			if (s.charAt(j) == a.charAt(i))
			{
				flag = j;
				i++;
				if (i == na && (s.charAt(j - na) < 'A' || s.charAt(j + 1)>'z'))
				{
					p[k] = flag;
					k++;
					i = 0;
				}
			}
			else
			{
				i = 0;
			}
		}

		if (k != 0)
		{
			for (m = 0;m < k;m++)
			{
				p[m] = p[m] + m * Math.abs(na - nb);
				ns = ns + m * Math.abs(na - nb);
				if (na == nb)
				{
					for (i = 0;i < na;i++)
					{
						s = tangible.StringFunctions.changeCharacter(s, p[m] - na + 1 + i, b.charAt(i));
					}
					if (m == k - 1)
					{
						System.out.printf("%s\n",s);
					}
				}
				if (na > nb)
				{
					for (i = 0;i < nb;i++)
					{
						s = tangible.StringFunctions.changeCharacter(s, p[m] - na + 1 + i, b.charAt(i));
					}
					for (i = p[m] + 1 - na + nb;i < ns - na + nb;i++)
					{
						s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i + na - nb));
					}
					if (m == k - 1)
					{
						for (i = 0;i < ns - na + nb;i++)
						{
							System.out.printf("%c",s.charAt(i));
						}
						System.out.print("\n");
					}
				}
				if (na < nb)
				{
					for (i = ns - 1;i > p[m];i--)
					{
						s = tangible.StringFunctions.changeCharacter(s, i + nb - na, s.charAt(i));
					}
					for (i = 0;i < nb;i++)
					{
						s = tangible.StringFunctions.changeCharacter(s, p[m] - na + 1 + i, b.charAt(i));
					}
					if (m == k - 1)
					{
						for (i = 0;i < ns + nb - na;i++)
						{
							System.out.printf("%c",s.charAt(i));
						}
						System.out.print("\n");
					}
				}
			}
		}

		else if (k == 0)
		{
			System.out.printf("%s\n",s);
		}
	}
}

