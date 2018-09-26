package <missing>;

public class GlobalMembers
{
	/*
	 * ct.c
	 *
	 *  Created on: 2011-11-24
	 *      Author: lin
	 */

	public static int mysort(Object a, Object b)
	{
		return *(int)a - (int)b;
	}

	public static int Main()
	{
		int[] in = new int[100];
		int num;
		int tmp;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			num = Integer.parseInt(tempVar);
		}
		int count = 0;
		while (num-- != 0)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				tmp = Integer.parseInt(tempVar2);
			}
			if (tmp % 2 != 0)
			{
				in[count] = tmp;
				++count;
			}
		}
		qsort(in,count,(Integer.SIZE / Byte.SIZE),mysort);
		for (tmp = 0; tmp < count - 1; ++tmp)
		{
			System.out.printf("%d,", in[tmp]);
		}
		System.out.printf("%d", in[count - 1]);
		return 0;

	}



}

