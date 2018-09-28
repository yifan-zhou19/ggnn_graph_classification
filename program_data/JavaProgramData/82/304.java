package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int n1;
		int n2;
		int i;
		int h;
		int hmax;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		h = 0;
		hmax = h;
		for (i = 1;i <= n;i = i + 1)
		{
			n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (n1 >= 90 && n1 <= 140 && n2 >= 60 && n2 <= 90)
				{
					h = h + 1;
				}
				else
				{
					if (h > hmax)
					{
						hmax = h;
						h = 0;
					}
				else
				{
					hmax = hmax;
					h = 0;
				}
				}
				continue;
		}
		if (h > hmax)
		{
			hmax = h;
		}
		else
		{
			hmax = hmax;
		}
		System.out.print(hmax);
		System.out.print("\n");
		return 0;
	}
}

