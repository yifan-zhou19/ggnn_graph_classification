package <missing>;

public class GlobalMembers
{
	//************************
	// 6.1.cpp 
	// ??  1200018415
	// 2012   10 30
	//***********************

	public static int Main()
	{
		int[] a = new int[16]; // ?????????16??
		int i = 1;
		int j;
		int k;
		int n = 0;
		while (ConsoleInput.lastReadWasGood())
		{
			 a[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[0] == -1) // ??a?0??-1
			{
			break; // ?????????
			}
			for (i = 1; ; i++)
			{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] == 0) // ????a?i??0
			{
				break; // ??????
			}
			k = i; // ??????
			}
		for (j = 0; j <= k - 1; j++) // ?????j????????????
		{
			for (i = j + 1; i <= k; i++) // ?j???????????
			{
				if (a[j] * 2 == a[i] || a[i] * 2 == a[j]) // ????????
				{
					n = n + 1; // ???1
				}
			}
		}
		System.out.print(n);
		System.out.print("\n");
		n = 0; // n?????0
		}
		return 0;

	}

}

