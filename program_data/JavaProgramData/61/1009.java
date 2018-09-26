package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : shulie.cpp
	// Author      : shaodian
	// Version     :
	// Copyright   : Your copyright notice
	// Description :
	//============================================================================


	public static int Main()
	{
		int[] s = new int[100]; //???????100???
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++) //?i??1?i??
		{
			s[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (s[i] == 1 || s[i] == 2)
		{
			System.out.print(1);
			System.out.print("\n");
		}

		else
		{
			long[] f = new long[10000]; //????????
		f[1] = 1;
		f[2] = 1;
		for (int j = 3;j <= s[i];j++) //?j??3?????s[i]???
		{
			f[j] = f[j - 1] + f[j - 2]; //???????????
		}

		System.out.print(f[s[i]]);
		System.out.print("\n");
		}
		}

		return 0;
	}
}

