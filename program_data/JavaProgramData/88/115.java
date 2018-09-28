package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		String a = new String(new char[100]);
		int nege;
		int deci;
		int k;
		int i;
		int r;
		int x;
		s = new Scanner(System.in).nextLine();
		x = s.length();
		nege = 1;
		deci = 1;
		r = -1;
		for (i = 0;i <= x;i++)
		{
			if (s.charAt(i) == '-')
			{
				nege = 0;
			}
			if (s.charAt(i) == '.' && r > -1)
			{
				deci = 0;
			}
			if (!((s.charAt(i) <= '9' && s.charAt(i) >= '0') || (s.charAt(i) == '-') || (s.charAt(i) == '.')))
			{
				nege = 1;
				deci = 1;
				r = -1;
			}
			if ((s.charAt(i) <= '9' && s.charAt(i) >= '0') && (nege != 0 && deci != 0))
			{
				r++;
				a = tangible.StringFunctions.changeCharacter(a, r, s.charAt(i));
				if (!((s.charAt(i + 1) <= '9' && s.charAt(i + 1) >= '0') || (s.charAt(i + 1) == '.')))
				{
					if (r == 0)
					{
						System.out.printf("%c\n",a.charAt(0));
					}
					else
					{
						k = -1;
						do
						{
							k++;
						} while (a.charAt(k) == '0');
						for (;k <= r;k++)
						{
							System.out.printf("%c",a.charAt(k));
						}
						System.out.print("\n");
						nege = 1;
						deci = 1;
						r = -1;
					}
				}
			}
		}
		return 0;
	}
}

