package <missing>;

public class GlobalMembers
{
	/*
	 * sznx.cpp
	 * ????
	 *  Created on: 2012-12-10
	 *      Author: Salforever
	 */

	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p,n,i,x[105];
		int p;
		int n;
		int i;
		int[] x = new int[105];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			x[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		p = x[n]; //??????????
		System.out.print(p);
		p--;
		n--;
		while (n > 0)
		{
			System.out.print(' ');
			System.out.print(p);
			p--;
			n--;
		}
		return 0; //????
	}

}

