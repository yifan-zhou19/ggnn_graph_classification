package <missing>;

public class GlobalMembers
{
	/*
	 * c.cpp
	 * ???1100012870;
	 * ???????
	 *  Created on: 2011-10-19
	 *      Author: Li Wenpeng
	 */
	public static int Main()
	{
		int n;
		int[] a = new int[20001];
		int[] p = new int[200];
		int x;
		int step = -1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(p,0,(Integer.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Integer.SIZE / Byte.SIZE));
		for (int i = 0;i < n;i++) //????
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (p[x] == 0) //?????????????????
			{
				step++; //????????1
				a[step] = x;
				p[x] = 1; //???x?????
			}
		}
		System.out.print(a[0]);
		for (int j = 1;j <= step;j++)
		{
			System.out.print(' ');
			System.out.print(a[j]);
		}
		return 0;
	}


}

