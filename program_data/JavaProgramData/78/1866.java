//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	/*
	 * 12.cpp
	 * function:????????????????????????????
	 * Created on: 2012-10-23
	 * Author: sear
	 */
	public static int Main()
	{
		int z; //z q s l???????????
		int q;
		int s;
		int l;
		for (z = 10;z <= 50;z = z + 10)
		{ //z?10???????50
			for (q = 10;q <= 50;q = q + 10)
			{ //q?10???????50
				if (q == z)
				{
					continue; //????????????
				}
				for (s = 10;s <= 50;s = s + 10)
				{ //s?10???????50
					if ((s == z) || (s == q))
					{
						continue; //??????????????
					}
					for (l = 10;l <= 50;l = l + 10)
					{ //l?10???????50
						if ((l == z) || (l == q) || (l == s))
						{
							continue; //???????????????
						}
						if ((z + q == s + l) && (z + l > s + q) && (z + s < q))
						{ //??????
							//?z+s<q????????
						if (q < l)
						{ //??????????????
							System.out.print('l');
							System.out.print(" ");
							System.out.print(l);
							System.out.print("\n");
							System.out.print('q');
							System.out.print(" ");
							System.out.print(q);
							System.out.print("\n");
							if (z > s)
							{
								System.out.print('z');
								System.out.print(" ");
								System.out.print(z);
								System.out.print("\n");
								System.out.print('s');
								System.out.print(" ");
								System.out.print(s);
							}
							else
							{
								System.out.print('s');
								System.out.print(" ");
								System.out.print(s);
								System.out.print("\n");
								System.out.print('z');
								System.out.print(" ");
								System.out.print(z);
							}
						}
						else
						{
							System.out.print('q');
							System.out.print(" ");
							System.out.print(q);
							System.out.print("\n");
							if ((z > l) && (z > s))
							{ //???????
							  System.out.print('z');
							  System.out.print(" ");
							  System.out.print(z);
							  System.out.print("\n");
							  if (l > s)
							  {
								  System.out.print('l');
								  System.out.print(" ");
								  System.out.print(l);
								  System.out.print("\n");
								  System.out.print('s');
								  System.out.print(" ");
								  System.out.print(s);
							  }
							  else
							  {
								  System.out.print('s');
								  System.out.print(" ");
								  System.out.print(s);
								  System.out.print("\n");
								  System.out.print('l');
								  System.out.print(" ");
								  System.out.print(l);
							  }
							}
						else if ((l > z) && (l > s))
						{ //???????
							   System.out.print('l');
							   System.out.print(" ");
							   System.out.print(l);
							   System.out.print("\n");
							   if (z > s)
							   {
								   System.out.print('z');
								   System.out.print(" ");
								   System.out.print(z);
								   System.out.print("\n");
								   System.out.print('s');
								   System.out.print(" ");
								   System.out.print(s);
							   }
							   else
							   {
								   System.out.print('s');
								   System.out.print(" ");
								   System.out.print(s);
								   System.out.print("\n");
								   System.out.print('z');
								   System.out.print(" ");
								   System.out.print(z);
							   }
						}
						else if ((s > z) && (s > l))
						{ //???????

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================
