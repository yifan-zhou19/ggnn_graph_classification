package <missing>;

public class GlobalMembers
{
	/*
	 * ???.cpp
	 *
	 *  Created on: 2012-10-15
	 *      Author: ???
	 *      ?????????????????????????????
	 */
	public static char max(int x,int y,int z,int w)
	{
		char m;
	int n;
	n = x > y != 0?x:y;
	n = n > z != 0?n:z;
	n = n > w != 0?n:w;
	if (n == x)
	{
		m = 'z';
	}
	if (n == y)
	{
		m = 'q';
	}
	if (n == z)
	{
		m = 's';
	}
	if (n == w)
	{
		m = 'l'; //??max???????????????
	}
	return (m);
	}
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int i;
		int Z;
		int Q;
		int S;
		int L;
		for (z = 10;z <= 50;z = z + 10)
		{
			for (q = 10;q <= 50;q = q + 10)
			{
				for (s = 10;s <= 50;s = s + 10)
				{
					for (l = 10;l <= 50;l = l + 10)
					{ //???????????
					if ((z != q) && (z != s) && (z != l) && (q != s) && (s != l) && (q != l) && (z + q == s + l) && (z + l > s + q) && (z + s < q)) //?????????????????????
					{
							Z = z;
							Q = q;
							S = s; //??????????????????????
							L = l;
						for (i = 1;i < 5;i++)
						{
							 switch (max(Z, Q, S, L))
							 {
							  case 'z':
							  {
								  System.out.print("z ");
								  System.out.print(Z);
								  System.out.print("\n");
								  Z = 0;
								  break;
							  }
						  case 'q':
						  {
							  System.out.print("q ");
							  System.out.print(Q);
							  System.out.print("\n");
							  Q = 0;
							  break;
						  }
						  case 's':
						  {
							  System.out.print("s ");
							  System.out.print(S);
							  System.out.print("\n");
							  S = 0;
							  break;
						  }
						  case 'l':
						  {
							  System.out.print("l ");
							  System.out.print(L);
							  System.out.print("\n");
							  L = 0;
							  break;
						  } //?????????????
																   //?????0?????????????
							 }
						}
					}
					}
				}
			}
		}
		return 0;
	}
}
