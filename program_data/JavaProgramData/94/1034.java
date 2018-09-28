package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2012-10-8
	 *      Author: Lixurong
	 */


//C++ TO JAVA CONVERTER TODO TASK: The implementation of the following method could not be found:
	//int runnian(int a);

	public static int Main()
	{
		int n; //????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[n]; //????
		int[] b = new int[n];
		int k = 0;
		for (int i = 0; i < n; i++) //??
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a[i] % 2 != 0) //??
			{
				b[k] = a[i]; //???????
				k++;
			}
		}
		for (int i = 0; i < k - 1; i++) //??????
		{
			for (int j = 0; j < k - 1; j++)
			{
				if (b[j] > b[j + 1]) //??
				{
					int h = b[j + 1];
					b[j + 1] = b[j];
					b[j] = h;
				}
			}
		}
		for (int i = 0; i < k; i++) //??
		{
			System.out.print(b[i]);
			if (i != k - 1)
			{
				System.out.print(",");
			}
		}

		return 0;
	}

}

