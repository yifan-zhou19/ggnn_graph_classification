package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int ten;
		int ge;
		int s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n > 9)
		{
		for (i = 10;i <= n;i++)
		{
			ge = i % 10;
			ten = (i - (i % 10)) / 10;
			if ((i % 7 != 0) && (ge != 7) && (ten != 7))
			{
				s = s + i * i;
			}
		}
		System.out.print(s + 236);
		}
		else
		{
			for (i = 1;i <= n;i++)
			{
				ge = i % 7;
				if ((i % 7 != 0) && (ge != 7))
				{
					s = s + i * i;
				}
			}
			System.out.print(s);
		}
		return 0;
	}

}

