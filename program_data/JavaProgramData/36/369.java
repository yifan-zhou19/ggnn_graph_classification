package <missing>;

public class GlobalMembers
{
	public static int judge(String a, String b)
	{
		int len;
		int lena;
		int lenb;
		int i;
		int j;
		int na;
		int nb;
		int pp = 1;
		char ma;
		lena = a.length();
	//	printf("lena=%d",lena);
		lenb = b.length();
	//	printf("lenb=%d",lenb);
		if (lena != lenb)
		{
			return 0;
		}
		else
		{
			len = lena;
			for (i = 0;i < len;i++)
			{
				if (a[i].compareTo(97) >= 0 && a[i].compareTo(122) <= 0)
				{
					ma = a[i];
					na = 1;
					nb = 0;
					for (j = i + 1;j < len;j++)
					{
						if (a[j].equals(ma))
						{
							na++;
							a[j] = null;
						}
					}
					for (j = 0;j < len;j++)
					{
						if (b[j].equals(ma))
						{
							nb++;
						}
					}
					if (na != nb)
					{
						return 0;
						pp = 0;
						break;
					}
				}
			}
			if (pp == 1)
			{
				return 1;
			}
		}
		return 1;
	}

	public static int Main()
	{
		String inp = new String(new char[200]);
		String a = new String(new char[50]);
		String b = new String(new char[50]);
		int len;
		int i;
		int j;
		int ma = 0;

		inp = new Scanner(System.in).nextLine();
		len = inp.length();

		for (i = 0;i < 50;i++)
		{
			a = a.substring(0, i);
			b = b.substring(0, i);
		}

		for (i = 0,j = 0;i < len;i++)
		{
			if (ma == 0)
			{
				if (inp.charAt(i) != 32)
				{
					a = tangible.StringFunctions.changeCharacter(a, i, inp.charAt(i));
				}
				else
				{
					ma = 1;

					continue;
				}
			}
			if (ma == 1)
			{
				if (inp.charAt(i) != 32)
				{
					b = tangible.StringFunctions.changeCharacter(b, j, inp.charAt(i));
					j++;
				}

			}
		}

		if (judge(a, b) == 0)
		{
			System.out.print("NO\n");
		}
		else
		{
			System.out.print("YES\n");
		}


	}

}

