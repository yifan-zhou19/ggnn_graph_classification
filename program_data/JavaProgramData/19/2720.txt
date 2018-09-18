package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int w;
		int nw = 0;
		int ns;
		int na;
		int nb;
		int[] rem = new int[102];
		int flag;
		int FLAG = 0;
		String s = new String(new char[102]);
		String a = new String(new char[102]);
		String b = new String(new char[102]);
		int[] vest = new int[102];
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		ns = s.length();
		na = a.length();
		nb = b.length();
		for (i = 0;i < ns;i++)
		{

		if (s.charAt(i) != ' ' && FLAG == 0)
		{
			FLAG = 1;
			flag = 0;
			for (k = i,j = 0;j < na;j++,k++)
			{
				if (s.charAt(k) != a.charAt(j))
				{
					flag = 1;
					break;
				}
			}
			if (flag == 0 && (s.charAt(k) == ' ' || s.charAt(k) == '\0'))
			{
				rem[nw] = i;
				nw++;
			}
		}
		else
		{
			FLAG = 0;
		}

		}
		for (w = 0;w < nw;w++)
		{
				if (nb == na)
				{
					for (k = 0;k < na;k++)
					{
						s = tangible.StringFunctions.changeCharacter(s, k + rem[w], b.charAt(k));
					}
				}
				else if (nb > na)
				{
					ns = ns + nb - na;
					s = tangible.StringFunctions.changeCharacter(s, ns, '\0');
					for (k = ns - 1;k > rem[w];k--)
					{
						s = tangible.StringFunctions.changeCharacter(s, k, s.charAt(k - nb + na));
					}
					for (k = 0;k < nb;k++)
					{
						s = tangible.StringFunctions.changeCharacter(s, k + rem[w], b.charAt(k));
					}
					for (j = 0;j < nw;j++)
					{
						rem[j] = rem[j] + nb - na;
					}
				}
				else
				{
					ns = ns + nb - na;
					for (k = rem[w] + 1;k < ns;k++)
					{
						s = tangible.StringFunctions.changeCharacter(s, k, s.charAt(k - nb + na));
					}
					for (k = 0;k < nb;k++)
					{
						s = tangible.StringFunctions.changeCharacter(s, k + rem[w], b.charAt(k));
					}
					for (j = 0;j < nw;j++)
					{
						rem[j] = rem[j] + nb - na;
					}
				}
		}
		for (i = 0;i < ns;i++)
		{
			System.out.printf("%c",s.charAt(i));
		}
		System.out.print("\n");
		return 0;
	}
}

