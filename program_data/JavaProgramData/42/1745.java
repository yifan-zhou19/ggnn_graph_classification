package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : 5.1.cpp
	// Author      : Zhang Yu
	// Version     :
	// Copyright   : Your copyright notice
	// Description : ????????
	//============================================================================



	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		final int n = N;
		int[] a = new int[n];
		for (int i = 0;i <= n - 1;++i)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		int deletenum;
		deletenum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int ignore = 0;

		for (int i = 0;i <= n - 1 - ignore;++i) //when i encounters the number to be ignored, break the loop
		{

			if (a[i] == deletenum)
			{


				for (int j = i;j <= n - 2;++j)
				{
					a[j] = a[j + 1];
				}
				--i; //when the transformation is done, i-- is used to check whether a[i] is to be deleted
				++ignore;

			}


		}


		for (int i = 0;i <= n - 1 - ignore;++i)
		{
			if (i == 0)
			{
				System.out.print(a[i]);
			}
			else
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
		}

		return 0;
	}

}

