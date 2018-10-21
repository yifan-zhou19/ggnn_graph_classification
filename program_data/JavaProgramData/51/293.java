package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[1000]);
		String s1 = new String(new char[10]);
		int i;
		int j;
		int k;
		int l;
		int m = 0;
		int n;
		int x;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = new Scanner(System.in).nextLine();
		s = new Scanner(System.in).nextLine();
		for (i = 0;i < s.length();i++)
		{
			for (j = 0;j < n;j++)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, j, s.charAt(j + i));
			}
			x = 0;
			for (j = i;j < s.length();j++)
			{
				l = 0;
				for (k = 0;k < n;k++)
				{
					if (s.charAt(j + k) != s1.charAt(k))
					{
						l = 1;
					}
				}
				if (l == 0)
				{
					x++;
				}
			}
			if (x > m)
			{
				m = x;
			}
		}
		if (m <= 1)
		{
			System.out.print("NO");
		}
		else
		{
		System.out.printf("%d\n",m);
		for (i = 0;i < s.length();i++)
		{
			for (j = 0;j < n;j++)
			{
				s1 = tangible.StringFunctions.changeCharacter(s1, j, s.charAt(j + i));
			}
			s1 = tangible.StringFunctions.changeCharacter(s1, n, '\0');
			x = 0;
			for (j = i;j < s.length();j++)
			{
				l = 0;
				for (k = 0;k < n;k++)
				{
					if (s.charAt(j + k) != s1.charAt(k))
					{
						l = 1;
					}
				}
				if (l == 0)
				{
					x++;
				}
			}
			if (x == m)
			{
				System.out.println(s1);
			}
		}
		}
	}

}

