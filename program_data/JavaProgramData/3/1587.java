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
		int[] in = new int[1000];
		int n;
		int k;
		int i;
		int found = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0; i < n; ++i)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				in[i] = Integer.parseInt(tempVar3);
			}
		}
		qsort(in,n,(Integer.SIZE / Byte.SIZE),mysort);

//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * lp = in[0];
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		int * rp = in[n - 1];
		while (lp != rp)
		{
			i = lp + *rp;
			if (i < k)
			{
				++lp;
			}
			else if (i > k)
			{
				--rp;
			}
			else
			{
				found = 1;
				break;
			}
		}
		if (found != 0)
		{
			System.out.print("yes\n");
		}
		else
		{
			System.out.print("no\n");
		}
		return 0;

	}



}

