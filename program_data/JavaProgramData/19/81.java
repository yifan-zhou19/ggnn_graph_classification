package <missing>;

public class GlobalMembers
{
	/* Note:Your choice is C IDE */
	public static void Main()
	{
		int i;
		int value;
		int la;
		int lb;
		int ls;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * ps;
		final String s = "";
		final String a = "";
		final String b = "";
		s = new Scanner(System.in).nextLine();
		a = new Scanner(System.in).nextLine();
		b = new Scanner(System.in).nextLine();
		la = a.length();
		lb = b.length();
		ls = s.length();
		for (p = s;p < s.Substring(100);p++)
		{
			value = 1;
			if ((p == s || *(p - 1) == ' ') && (*p == a.charAt(0)))
			{
				for (ps = p + 1,i = 1;a.charAt(i) != '\0';ps++,i++)
				{
					if (*ps != a.charAt(i))
					{
						value = 0;
					}
				}
				if (value == 1)
				{
					if (la == lb)
					{
						for (i = 0;i < la;i++)
						{
							(*p++) = b.charAt(i);
						}
					}
					else
					{
						if (la > lb)
						{
							for (i = 0;i < lb;i++)
							{
								(*p++) = b.charAt(i);
							}
							while (*ps != '\0')
							{
								(*p++) = (*ps++);
							}
							*p = '\0';
						}
						else
						{
							for (i = 99;i >= (ps - s) + lb - la;i--)
							{
									s = tangible.StringFunctions.changeCharacter(s, i, s.charAt(i - lb + la));
							}
							for (i = 0;i < lb;i++)
							{
								(*p++) = b.charAt(i);
							}
						}
					}
				}
			}

		}
		System.out.printf("%s",s);
	}
}

