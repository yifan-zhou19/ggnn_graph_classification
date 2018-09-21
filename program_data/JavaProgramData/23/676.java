package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : shj.cpp
	// Author      : ???
	// Time        : 2013.11.12
	// Description : ????
	//============================================================================
	public static int Main()
	{
		char[][] word = new char[100][101]; //???????
		int n = 0;
		while (cin.getline(word[n],101,' '))
		{
			n++;
		}
		word[n - 1][String.valueOf(word[n - 1]).length() - 1] = '\0';
		for (int i = n - 1;i >= 0;i--) //??????????????
		{
			System.out.print(word[i]);
			if (i != 0)
			{
				System.out.print(' ');
			}
		}
		System.out.print("\n");
		return 0;
	}
}
