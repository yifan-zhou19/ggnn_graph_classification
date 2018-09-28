//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	/*
	 * ????suantizhong.cpp
	 * ??????
	 * ?????2012 10 21
	 * ???????????????
	 */



	public static int Main()
	{
		int z; //??????z q s l??????f
		int q;
		int s;
		int l;
		int f;
		f = 1; //f????1
		int max = new int(int a,int b,int c,int d); //????max4
		for (z = 1;z <= 5;z++)
		{ //z????1??z???5???????????z+1
			for (q = 1;q <= 5;q++)
			{ //q????1??q???5???????????q+1
				if (q == z)
				{
					q++; //??q??z?q+1
				}
				for (s = 1;s <= 5;s++)
				{ //s????1??s???5???????????s+1
					while (s == z || s == q)
					{
						s++; //s?z q??
					}
					for (l = 1;l <= 5;l++)
					{ //l????1??l???5???????????l+1
						while ((l == z || l == q) || l == s)
						{
							l++; //l?z q s??
						}
						if (l > 5)
						{
							break; //l???????????????
						}
						if (((z + q) == (s + l) && (z + l) > (s + q)) && ((z + s) < q))
						{
							if (max(z, q, s, l) == z)
							{
								System.out.print("z ");
								System.out.print(z * 10);
								System.out.print("\n");
								z = 0;
							}
							if (max(z, q, s, l) == q)
							{
								System.out.print("q ");
								System.out.print(q * 10);
								System.out.print("\n");
								q = 0;
							}
							if (max(z, q, s, l) == s)
							{
								System.out.print("s ");
								System.out.print(s * 10);
								System.out.print("\n");
								s = 0;
							}
							if (max(z, q, s, l) == l)
							{
								System.out.print("l ");
								System.out.print(l * 10);
								System.out.print("\n");
								l = 0;
							}
							if (max(z, q, s, l) == z && max(z, q, s, l) != 0)
							{
								System.out.print("z ");
								System.out.print(z * 10);
								System.out.print("\n");
								z = 0;
							}
							if (max(z, q, s, l) == q && max(z, q, s, l) != 0)
							{
								System.out.print("q ");
								System.out.print(q * 10);
								System.out.print("\n");
								q = 0;
							}
							if (max(z, q, s, l) == s && max(z, q, s, l) != 0)
							{
								System.out.print("s ");
								System.out.print(s * 10);
								System.out.print("\n");
								s = 0;
							}
							if (max(z, q, s, l) == l && max(z, q, s, l) != 0)
							{
								System.out.print("l ");
								System.out.print(l * 10);
								System.out.print("\n");
								l = 0;
							}
							if (max(z, q, s, l) == z && max(z, q, s, l) != 0)
							{
								System.out.print("z ");
								System.out.print(z * 10);
								System.out.print("\n");
								z = 0;
							}
							if (max(z, q, s, l) == q && max(z, q, s, l) != 0)
							{
								System.out.print("q ");
								System.out.print(q * 10);
								System.out.print("\n");
								q = 0;
							}
							if (max(z, q, s, l) == s && max(z, q, s, l) != 0)
							{
								System.out.print("s ");
								System.out.print(s * 10);
								System.out.print("\n");
								s = 0;
							}
							if (max(z, q, s, l) == l && max(z, q, s, l) != 0)
							{
								System.out.print("l ");
								System.out.print(l * 10);
								System.out.print("\n");
								l = 0;
							}
							if (max(z, q, s, l) == z && max(z, q, s, l) != 0)
							{
								System.out.print("z ");
								System.out.print(z * 10);
								System.out.print("\n");
								z = 0;
							}
							if (max(z, q, s, l) == q && max(z, q, s, l) != 0)
							{
								System.out.print("q ");
								System.out.print(q * 10);
								System.out.print("\n");
								q = 0;
							}
							if (max(z, q, s, l) == s && max(z, q, s, l) != 0)
							{
								System.out.print("s ");
								System.out.print(s * 10);

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================
