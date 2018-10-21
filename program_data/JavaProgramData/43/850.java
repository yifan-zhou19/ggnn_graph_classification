package <missing>;

public class GlobalMembers
{
	//***********************************************
	//         1.cpp
	//   ??????
	//  created on 2012-10-22
	//  author ?? 1200012934
	//***********************************************
	public static int Main()
	{
		int m;
		int i;
		int j;
		int l;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 3; i <= m / 2; i++)
		{
			l = (int) Math.sqrt(i);
			for (j = 2; j <= l; j++)
			{
				if (i % j == 0)
				{
					break;
				}
			}
			if (j == l + 1)
			{
				l = (int) Math.sqrt(m - i);
				for (j = 2; j <= l; j++)
				{
					if ((m - i) % j == 0)
					{
						break;
					}
				}
				if (j == l + 1)
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(m - i);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

