package <missing>;

public class GlobalMembers
{
	//********************************
	//*?????????    **
	//*??? ??? 1300012745 **
	//*???2013.10.25  **
	//********************************
	public static int Main()
	{
		int m;
		int a;
		int b;
		int i;
		int n = 0;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (a = 3;a <= m / 2;a += 2)
		{
			for (i = 3;i <= Math.sqrt(a);i++)
			{
				if (a % i == 0)
				{
					n++;
				}
			}
			if (n == 0)
			{
				b = m - a;
				for (i = 3;i <= Math.sqrt(b);i++)
				{
					if (b % i == 0)
					{
						n++;
					}
				}
				if (n == 0)
				{
					System.out.print(a);
					System.out.print(" ");
					System.out.print(b);
					System.out.print("\n");
				}
			}
			n = 0; //?n????????????
		}
		return 0;
	}






}

