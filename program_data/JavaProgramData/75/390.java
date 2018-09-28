package <missing>;

public class GlobalMembers
{
	/**
	* @file 1000012800_1.cpp
	* @author ??
	* @date 2010-11-24
	* @description
	* ??????:????? 
	*/

	public static int Main()
	{
		int count = 0;
		int[] x = new int[10000];
		int[] y = new int[10000];
		int[] time = new int[1000];
		int n = 0;
		int w = 0;
		String inputx = new String(new char[10000]);
		String inputy = new String(new char[10000]);
		inputx = ConsoleInput.readToWhiteSpace(true).charAt(0);
		inputy = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int i = inputx.length() - 1; i >= 0; i--)
		{
			if (inputx.charAt(i) != ',')
			{
				x[n] += (inputx.charAt(i) - 48) * Math.pow((double)10,w);
				w++;
			}
			else
			{
				n++;
				w = 0;
			}
		}
		w = 0;
		n = 0;
		for (int i = inputy.length() - 1; i >= 0; i--)
		{
			if (inputy.charAt(i) != ',')
			{
				y[n] += (inputy.charAt(i) - 48) * Math.pow((double)10,w);
				w++;
			}
			else
			{
				n++;
				w = 0;
			}
		}
		for (int i = 0; i <= n; i++)
		{
			for (int j = x[i]; j < y[i]; j++)
			{
				time[j]++;
			}
		}
		for (int i = 0; i < 1000; i++)
		{
			if (time[i] > count)
			{
				count = time[i];
			}
		}
		System.out.print(n + 1);
		System.out.print(" ");
		System.out.print(count);
		System.out.print("\n");


		return 0;
	}





}

