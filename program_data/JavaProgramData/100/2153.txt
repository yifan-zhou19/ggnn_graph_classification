package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[301]);
		char t;
		int i;
		int j;
		int n = 0;
		int b = 0;
		int num;

		s = new Scanner(System.in).nextLine();
		num = s.length();

		for (i = 0;i < num;i++)
		{
			if ((s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') || (s.charAt(i) >= 'a' && s.charAt(i) <= 'z'))
			{
				b = b + 1;
			}
		}
		if (b == 0)
		{
			System.out.print("No");
		}
		else
		{
			for (t = 'A';t <= 'Z';t++)
			{
				n = 0;
				for (i = 0;i < num;i++)
				{
					if (s.charAt(i) == t)
					{
						n = n + 1;
					}
				}
				if (n != 0)
				{
				System.out.printf("%c=%d\n",t,n);
				}
			}

			for (t = 'a';t <= 'z';t++)
			{
				n = 0;
				for (i = 0;i < num;i++)
				{
					if (s.charAt(i) == t)
					{
						n = n + 1;
					}
				}
				if (n != 0)
				{
				System.out.printf("%c=%d\n",t,n);
				}
			}
		}

		return 0;
	}


}
