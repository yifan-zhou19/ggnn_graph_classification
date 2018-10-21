package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int g;
		int sign1;
		int sign2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= m / 2;i++)
		{
			sign1 = 0;
			sign2 = 0;
			if (i % 2 == 0)
			{
				continue;
			}
			for (g = 2;g < i / 2;g++)
			{
				if (i % g != 0)
				{
					continue;
				}
				else
				{
					sign1 = sign1 + 1;
				}
			}
			if (sign1 == 0)
			{
				for (g = 2;g < (m - i) / 2;g++)
				{
					if ((m - i) % g != 0)
					{
						continue;
					}
					else
					{
						sign2 = sign2 + 1;
					}
				}
			}
			else
			{
				continue;
			}
			if (sign2 == 0)
			{
				System.out.printf("%d %d\n\n", i, m - i);
			}
			else
			{
				continue;
			}
		}
		return 0;
	}
}

