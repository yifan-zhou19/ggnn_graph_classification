package <missing>;

public class GlobalMembers
{
	//****************************************************************
	// ????1000012789_2.cpp                                      *
	// ???wusy                                                    *
	// ???10?27                                                  *
	// ???                                                *
	//****************************************************************
	public static int Main()
	{
		int n;
		int[] a = new int[20001];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0; i <= n - 1; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int j = 0; j <= n - 1; j++)
		{
			for (int k = n - 1; k >= j + 1; k--)
			{
				if (a[j] == a[k])
				{
					a[k] = 0;
				}
			}
		}
			System.out.print(a[0]);
			for (int m = 1; m <= n - 1; m++)
			{
				if (a[m] != 0)
				{
					System.out.print(" ");
					System.out.print(a[m]);
				}
			}
			return 0;
	}


}

