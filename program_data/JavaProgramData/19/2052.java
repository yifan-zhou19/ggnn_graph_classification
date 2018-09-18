package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[101]);
		String a = new String(new char[101]);
		String b = new String(new char[101]);
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		int i;
		int j;
		int c = 0;
		int d = 0;
		int e = 0;
		int f;
		int k;
		int l;
		int len1;
		int len2;
		len1 = s.length();
		len2 = a.length();
		for (i = 0;i < len1;i++)
		{
			if (s.charAt(i) == a.charAt(0) && (s.charAt(i - 1) == ' ' || i == 0))
			{
				d = 0;
				for (j = 1;j < len2;j++)
				{
					if (s.charAt(j + i) == a.charAt(j))
					{
					d += 1;
					}
				}

				if (d == len2 - 1)
				{
					e += 1;
					s = tangible.StringFunctions.changeCharacter(s, i, '\0');
					f = 0;
					for (k = 0;k < i;k++)
					{
						if (s.charAt(k) == '\0')
						{
							f += 1;
						}
						if (f == e-1)
						{
							if (k == 0)
							{
							for (l = k;l < i;l++)
							{
								System.out.printf("%c",s.charAt(l));
							}
							 break;
							}
							else
							{
							for (l = k + len2;l < i;l++)
							{
								System.out.printf("%c",s.charAt(l));
							}
							 break;
							}

						}
					}
					System.out.printf("%s",b);
				}
			}
		}
		if (e != 0)
		{
		for (i = 0;i < len1;i++)
		{
			if (s.charAt(i) == '\0')
			{
			c += 1;
			}
			if (c == e)
			{
				for (j = i + len2;j < len1;j++)
				{
				System.out.printf("%c",s.charAt(j));
				}
				break;
			}
		}
		}
		else
		{
		System.out.println(s);
		}








					return 0;
	}



}

