package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2011-11-15
	 *      Author: 1100012870
	 */
	public static int Main()
	{
		int[] p = new int[1001];
		int[] f = new int[1001];
		int i;
		int x;
		int y;
		f[1] = 1;
		for (i = 2;i <= 1000;i++)
		{
			f[i] = i / 2;
		}
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(p,0,(Integer.SIZE / Byte.SIZE));
		p[1] = 1;
		while (x != 1)
		{ //?x?????????
			p[x] = 1; //??x?????
			x = f[x];
		}
		while (p[y] != 1)
		{
			y = f[y]; //??y?????????x????????
		}
		System.out.print(y);
		System.out.print("\n");
		return 0;
	}

}

