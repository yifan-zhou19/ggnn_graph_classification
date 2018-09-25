package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int p = 0;
	int q = 0;
	int r = 0;
	String s = new String(new char[302]);
	char x;
	s = new Scanner(System.in).nextLine();
	n = s.length();

	for (i = 0;i < n;i++)
	{
		if (((s.charAt(i) >= 'a') && (s.charAt(i) <= 'z')) || ((s.charAt(i) >= 'A') && (s.charAt(i) <= 'Z')))
		{
		p++;
		}

	}
	if (p == 0)
	{
	System.out.print("No");
	}
	else
	{
		for (x = 'A';x <= 'Z';x++)
		{
			q = 0;
			for (i = 0;i < n;i++)
			{
				if (x == s.charAt(i))
				{
				q++;
				}
			}
			if (q != 0)
			{
			System.out.printf("%c=%d\n",x,q);
			}
		}

		for (x = 'a';x <= 'z';x++)
		{
			r = 0;
			for (i = 0;i < n;i++)
			{
				if (x == s.charAt(i))
				{
				r++;
				}
			}
			if (r != 0)
			{
			System.out.printf("%c=%d\n",x,r);
			}
		}


	}

	return 0;
	}
}
