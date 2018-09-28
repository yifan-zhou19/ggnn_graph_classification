package <missing>;

public class GlobalMembers
{
	//****************************************************************
	// ????1000012789_6.cpp                                      *
	// ???wusy                                                    *
	// ???12,8                                                    *
	// ???????                                                *
	//****************************************************************
	public static int Main()
	{
		int n;
		int i;
		int flag = 0;
		int[] a = new int[50000];
		int[] b = new int[50000];
		int[] count = new int[50000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < 50000; i++)
		{
			count[i] = 0;
		}

		for (i = 0; ; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] == 0 && b[i] == 0)
			{
				break;
			}
			count[b[i]]++;
		}

		for (i = 0; i <= 50000; i++)
		{

			if (count[i] == n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				flag = 1;
			}
		}

		if (flag == 0)
		{
			System.out.print("NOT FOUND");
		}

		return 0;
	}


}

