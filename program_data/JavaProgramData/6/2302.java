package <missing>;

public class GlobalMembers
{
	//****************************************************
	//*  ? ? ?: homework.cpp                          *
	//*  ?    ?: ???                                *
	//*  ????: 2012?11?5?                         *
	//*  ????: ??????????                  *
	//****************************************************


	public static int Main()
	{
		int k; //sum???
		int n;
		int m;
		int i;
		int j;
		int x;
		int sum;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k-- != 0)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			sum = 0;
			for (i = 1; i <= m; i++)
			{
				for (j = 1; j <= n; j++)
				{
					x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if ((i == 1) || (i == m) || (j == 1) || (j == n))
					{
						sum = sum + x; //??????
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}

		return 0;
	}

}

