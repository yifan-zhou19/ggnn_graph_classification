package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int s;
		s = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i = i + 1)
		{
			if (i % 7 == 0)
			{
			s = s;
			}
		else if (i % 10 == 7)
		{
				s = s;
		}
			else if (7 <= (i / 10) && (i / 10) < 8)
			{
			s = s;
			}
		else
		{
			s = s + i * i;
		}
		}
		System.out.print(s);
		System.out.print("\n");
		return 0;
	}


}

