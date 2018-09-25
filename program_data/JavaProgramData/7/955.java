package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	String a = new String(new char[266]);
	String s = new String(new char[22]);
	String z = new String(new char[22]);
	a = new Scanner(System.in).nextLine();
	s = new Scanner(System.in).nextLine();
	z = new Scanner(System.in).nextLine();
	int n;
	int i;
	int j;
	int l = 1;
	int m;
	int q;
	int w;
	int e;
	for (i = 0;a.charAt(i) != '\0';i++)
	{
		if (s.charAt(0) == a.charAt(i))
		{
		l = 1;
		m = i;
		for (w = 0;s.charAt(w) != '\0';w++)
		{
			if (s.charAt(w) != a.charAt(i))
			{
			l = 0;
			}
			i++;
		}

			if (l != 0)
			{
				break;
			}
		}
	}

	for (n = 0;s.charAt(n) != '\0';n++)
	{
	1;
	}
	if (l != 0)
	{
			for (j = 0;a.charAt(j) != '\0';j++)
			{
				if (m == 48)
				{
					m = 17;
				}
				if (j == m)
				{
					for (e = 0;z.charAt(e) != '\0';e++)
					{
					System.out.printf("%c",z.charAt(e));
					}
					j = m + n - 1;
				}
				else
				{
					System.out.printf("%c",a.charAt(j));
				}
			}
	}


		return 0;
	}

}
