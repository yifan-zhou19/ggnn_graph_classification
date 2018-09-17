package <missing>;

public class GlobalMembers
{
	/*
	 * hanshudigui2.cpp
	 *
	 *  Created on: 2010-11-24
	 *      Author: hanzhe
	 */


	public static int f(int x,int y)
	{ //??????????
		int g = 0; //g=1?????????
		for (int i = 0;;i++)
		{ //??????(x/2^n)=(y/2^m)
			for (int j = 0;(y / Math.pow(2.0,j)) >= 1;j++)
			{
				if ((int)(x / Math.pow(2.0,i)) == (int)(y / Math.pow(2.0,j)))
				{
					return x / Math.pow(2.0,i);
					g = 1;
					break;
				}
			}
		if (g == 1)
		{
			break;
		}
		}
	}
	public static int Main()
	{
		int n1;
		int n2;
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(n1, n2));
		return 0;
	} //????

}

