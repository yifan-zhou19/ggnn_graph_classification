package <missing>;

public class GlobalMembers
{
	/*
	* ??????????.cpp
	* ??????
	* ?????2012.10.23
	* ?????????
	*/
	public static int Main()
	{
		int n;
		int a;
		int b;
		int i;
		int s;
		int p;
		s = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (p = 1;p <= s;p++)
		{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		a = b = 1;
		i = 2;
		if (n <= 2)
		{
			System.out.print(a);
			System.out.print("\n");
		}
		else
		{
			while (i <= n)
			{
				a = a + b;
				i++;
				if (i == n)
				{
						System.out.print(a);
						System.out.print("\n");
						break;
				}
				else
				{
					b = a + b;
					i++;
					if (i == n)
					{
							System.out.print(b);
							System.out.print("\n");
							break;
					}
				}
			}
		}
		}
		return 0;
	}

}

