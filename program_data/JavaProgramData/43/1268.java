package <missing>;

public class GlobalMembers
{
	// * * * * * * * * * * * * * * *
	// *?????????         *
	// *??????  1300013011   *
	// *???2013.10.25           *
	// * * * * * * * * * * * * * * *
	public static int Main()
	{
		int m; // a,b????,i,k????
		int a;
		int b;
		int i;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (a = 3; a <= m / 2; a = a + 2) // ???m/2???
		{
			for (i = 3; i < a; i = i + 2)
			{
				if (a % i == 0)
				{
					break;
				}
			}
			if (i == a)
			{
				b = m - a; // ?b??m-a

				for (k = 3; k < b; k = k + 2) // ??b?????
				{
					if (b % k == 0)
					{
						break;
					}
				}
				if (k == b)
				{
					System.out.print(a);
					System.out.print(" ");
					System.out.print(b);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

