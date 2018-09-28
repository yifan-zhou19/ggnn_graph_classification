package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m1 = 0;
		int m2 = 0;
		int j = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n ; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				j = Integer.parseInt(tempVar2);
			}
			if (i == 0)
			{
				m1 = j;
			}
			else if (i == 1)
			{
				m2 = j;
			}

			if (j > m1)
			{
					m2 = m1;
					m1 = j;
			}
			else if (j > m2)
			{
				m2 = j;
			}

		}
		System.out.printf("%d\n%d", m1, m2);
		return 0;
	}

}

