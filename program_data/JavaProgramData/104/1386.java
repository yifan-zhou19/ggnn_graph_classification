package <missing>;

public class GlobalMembers
{
	/*
	 * r.cpp
	 *
	 *  Created on: 2013-11-18
	 *      Author: shu
	 */

	public static int min(int a,int b)
	{
		if (a >= b)
		{
			return b;
		}
		else
		{
			return a;
		}
	}
	public static int f(int x,int y)
	{
		int[] wx = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		int[] wy = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
		int i = 0;
		int j = 0;
		int t1;
		int t2;
		wx[0] = x;
		wy[0] = y; //?
		 while (wx[i] != 1)
		 { //?
			wx[i + 1] = Math.floor(wx[i] / 2); //x
			i++; //y
		 }
		 t1 = i; //?
		 i = 0;
		 while (wy[i] != 1)
		 { //?
				wy[i + 1] = Math.floor(wy[i] / 2); //?
				i++; //?
		 }
			 t2 = i;
		 i = j = 0;
		  j = min(t1, t2);
		  while (j >= 0)
		  {
			  if (wx[t1] != wy[t2])
			  {
				  return wx[t1 + 1];
				  break;
			  }
			  t1--;
			  t2--;
			  j--;
		  }
	}
	public static int Main()
	{
		int x1;
		int y1;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(x1, y1));
		System.out.print("\n");
		return 0;
	}


}

