package <missing>;

public class GlobalMembers
{
	/*
	 * 05.cpp
	 *??????
	 *  Created on: 2012-10-18
	 *      Author: ???
	 */
	public static int Main()
	{
		int l; //????
		int q;
		int z;
		int s;
		s = 10;
		z = 20;
		q = 30;
		l = 40; //??????
		if (z + q == s + l && z + l > s + q && z + s < q)
		{
			System.out.print("l 40\n");
			System.out.print("q 30\n");
			System.out.print("z 20\n");
			System.out.print("s 10\n");
		}
		s = 10;
		z = 20;
		q = 40;
		l = 50; //??????
		if (z + q == s + l && z + l > s + q && z + s < q)
		{
			System.out.print("l 50\n");
			System.out.print("q 40\n");
			System.out.print("z 20\n");
			System.out.print("s 10\n");
		}
		return 0;
	}

}
