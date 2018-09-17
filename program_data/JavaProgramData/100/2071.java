package <missing>;

public class GlobalMembers
{
	public static int f(String s, int n)
	{
		int i;
		for (i = 0;i < n;i++)
		{
			if (64 < s[i] && s[i].compareTo(123) < 0)
			{
				return (0);
			}
		}
		return (1);
	}
	public static int Main()
	{
		String s = new String(new char[300]);
		char c;
		int i;
		int j;
		int sum = 0;
		for (i = 0;i < 300;i++)
		{
			s = tangible.StringFunctions.changeCharacter(s, i, '0');
		}
		s = new Scanner(System.in).nextLine();
		if (f(s, 300) == 1)
		{
			System.out.print("No");
		}
		else
		{
			for (i = 65;i < 91;i++)
			{
				for (j = 0;j < 300;j++)
				{
					if (s.charAt(j) == i)
					{
						sum = sum + 1;
						c = s.charAt(j);
					}
				}
				if (sum != 0)
				{
				System.out.printf("%c=%d\n",c,sum);
				}
				sum = 0;
			}
			for (i = 97;i < 123;i++)
			{
				for (j = 0;j < 300;j++)
				{
					if (s.charAt(j) == i)
					{
						sum = sum + 1;
						c = s.charAt(j);
					}
				}
				if (sum != 0)
				{
				System.out.printf("%c=%d\n",c,sum);
				}
				sum = 0;
			}
		}
		return 0;
	}
}

