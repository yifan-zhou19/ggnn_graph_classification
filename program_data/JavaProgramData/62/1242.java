package <missing>;

public class GlobalMembers
{
	/*
	 * XIV3.cpp
	 *
	 *  Created on: 2012-12-9
	 *      Author:???
	 *      ??????????
	 */
	public static int Main()
	{
		int j;
		int i;
		char[][] a = new char[1000][100]; //??????????
		for (i = 0; i < 1000; i++)
		{
			*(a + i) = ConsoleInput.readToWhiteSpace(true);
			if (System.in.read() == '\n')
			{
				break;
			}
		} //????????????
		System.out.print((a));
		for (j = 1;j <= i;j++)
		{
			System.out.print(" ");
			System.out.print((a + j));
		}
	}

}

