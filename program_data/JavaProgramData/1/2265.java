package <missing>;

public class GlobalMembers
{
	public static int ys(int af,int bf)
	{
		int s;
		if (af < bf)
		{
		s = 0;
		}
		if (af == bf)
		{
		s = 1;
		}
		if (af > bf)
		{
			s = 1;
			for (int i = af / 2;i >= bf;i--)
			{
				if (af % i == 0)
				{
				s += ys(af / i, i);
				}
			}
		}
		return s;
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int p;
		while ((p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			System.out.print(ys(p, 2));
			System.out.print("\n");
		}
		return 0;
	}

}

