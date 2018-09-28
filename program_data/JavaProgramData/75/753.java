package <missing>;

public class GlobalMembers
{
	/*
	 * intergratedexercise1.14.cpp
	 *
	 *  Created on: 2014-1-4
	 *      Author: st
	 */
	public static int Main()
	{
		int[] in = new int[10000];
		int[] out = new int[10000];
		in[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int l;
		int j = 1;
		int k = 1;
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while (scanf(",%d", in[j++]))
		{
			;
		}
		out[0] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: Variables cannot be declared in if/while/switch conditions in Java:
		while (scanf(",%d", out[k++]))
		{
			;
		}
		int min = in[0];
		int max = out[0];
		for (i = 0;i < j;i++)
		{
			if (in[i] < min)
			{
				min = in[i];
			}
		}
		for (i = 0;i < k;i++)
		{
			if (out[i] > max)
			{
				max = out[i];
			}
		}
		//cout<<min<<' '<<max<<endl;
		int count = 0;
		int tem = 0;
		for (i = min;i < max;i++)
		{
			for (l = 0;l < j;l++)
			{
				if (in[l] <= i != 0 && out[l]> i)
				{
					tem++;
				}
			}
			if (tem > count)
			{
						count = tem;
			}
					tem = 0;
		}
		System.out.print(j - 1);
		System.out.print(' ');
		System.out.print(count);

	}

}

