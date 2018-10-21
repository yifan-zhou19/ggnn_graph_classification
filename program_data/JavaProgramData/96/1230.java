package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[100]);
		char[] a = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
		int d;
		int l;
		int m;
		int r;
		int i;
		int j;
		int k;
		s = new Scanner(System.in).nextLine();
		l = s.length();
		if (l == 1)
		{
			System.out.print("0\n");
			System.out.println(s);
		}
		if ((l == 2) && (s.charAt(0) == '1'))
		{
			r = (s.charAt(0) - '0') * 10 + s.charAt(1) - '0';
			System.out.printf("%d\n",r / 13);
			System.out.printf("%d",r % 13);
		}
		if ((l == 2) && (s.charAt(0) != '1'))
		{
			r = (s.charAt(0) - '0') * 10 + s.charAt(1) - '0';
			System.out.printf("%d\n",r / 13);
			System.out.printf("%d",r % 13);
		}
		if (l >= 3)
		{
			for (i = 0;i < l;i++)
			{
				s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i) - '0');
			}
			for (i = 0;i < l - 1;i++)
			{
				r = s.charAt(i) * 10 + s.charAt(i + 1);
				if (i < l - 2)
				{
					if (r >= 13)
					{
						a[i] = r / 13;
						s = tangible.StringFunctions.changeCharacter(s, i + 1, r % 13);
					}
					else
					{
						a[i] = 0;
						s = tangible.StringFunctions.changeCharacter(s, i + 1, s.charAt(i) * 10 + s.charAt(i + 1));
					}
				}
				else
				{
					if (r >= 13)
					{
						a[i] = r / 13;
						k = r % 13;
					}
					else
					{
						a[i] = 0;
						k = r;
					}
				}
			}
		if (a[0] != 0)
		{
			for (i = 0;i < l - 1;i++)
			{
				System.out.printf("%d",a[i]);
			}
		}
		else
		{
			for (i = 1;i < l - 1;i++)
			{
				System.out.printf("%d",a[i]);
			}
		}
		System.out.print("\n");
		System.out.printf("%d",k);
		}
	}


}

