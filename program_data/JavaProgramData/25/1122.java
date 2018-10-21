package <missing>;

public class GlobalMembers
{
	/*
	 * jisuan2deNcifang.cpp
	 *
	 *  Created on: 2013-1-11
	 *      Author: 120001791??
	 *      ???
	 */
	public static int Main()
	{
		int N = 0; //5????????N?????r????
		int i = 0;
		int n = 0;
		int r = 0;
		int temp = 0;
		int[] a = new int[35]; //1????????????
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a, 0, (Integer.SIZE / Byte.SIZE)); //a??
		a[0] = 1; //????1
		while (N-- != 0)
		{ //N????
			for (i = 0; i < 35; i++)
			{ //???????
				temp = r; //????
				r = (a[i] * 2 + r) / 10; //??????
				a[i] = (a[i] * 2 + temp) % 10; //????
			}
		}
		for (n = 34; a[n] == 0; n--)
		{
			; //?????0
		}
		for (; n >= 0; n--) //???
		{
			System.out.print(a[n]);
		}
		return 0;
	}

}

