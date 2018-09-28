//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int z;
		int q;
		int s;
		int l;
		int e = 0;
		int a;
		int b;
		int c;
		int d;
		for (q = 3;q <= 5;q++)
		{
			for (z = 1;z <= 5;z++)
			{
				for (s = 1;s <= 5;s++)
				{
					for (l = 1;l <= 5;l++)
					{
						if (z != q && z != s && z != l && q != s && q != l && s != l && (z + q) == (s + l) && (z + l) > (s + q) && (z + s) < q)
						{
							e = 1;
							break;
						}
					}
					if (e == 1)
					{
						break;
					}
				}
				if (e == 1)
				{
					break;
				}
			}
			if (e == 1)
			{
				break;
			}
		}
		z *= 10;
		q *= 10;
		s *= 10;
		l *= 10;
		if (q > l)
		{
			System.out.print("q ");
			System.out.print(q);
			System.out.print("\n");
			if (l > z && l > s)
			{
				System.out.print("l ");
				System.out.print(l);
				System.out.print("\n");
				if (z > s)
				{
					System.out.print("z ");
					System.out.print(z);
					System.out.print("\n");
					System.out.print("s ");
					System.out.print(s);
					System.out.print("\n");
				}
				else
				{
					System.out.print("s ");
					System.out.print(s);
					System.out.print("\n");
					System.out.print("z ");
					System.out.print(z);
					System.out.print("\n");
				}
			}
			else if (z > l && z > s)
			{
				System.out.print("z ");
				System.out.print(z);
				System.out.print("\n");
				if (l > s)
				{
					System.out.print("l ");
					System.out.print(l);
					System.out.print("\n");
					System.out.print("s ");
					System.out.print(s);
					System.out.print("\n");
				}
				else
				{
					System.out.print("s ");
					System.out.print(s);
					System.out.print("\n");
					System.out.print("l ");
					System.out.print(l);
					System.out.print("\n");
				}
			}
			else if (s > l && s > z)
			{
				System.out.print("s ");
				System.out.print(s);
				System.out.print("\n");
				if (l > z)
				{
					System.out.print("l ");
					System.out.print(l);
					System.out.print("\n");
					System.out.print("z ");
					System.out.print(z);
					System.out.print("\n");
				}
				else
				{
					System.out.print("z ");
					System.out.print(z);
					System.out.print("\n");
					System.out.print("l ");
					System.out.print(l);
					System.out.print("\n");
				}
			}
		}
		else
			{
			System.out.print("l ");
			System.out.print(l);
			System.out.print("\n");
			if (q > z && q > s)
			{
				System.out.print("q ");
				System.out.print(q);
				System.out.print("\n");
				if (z > s)
				{
					System.out.print("z ");
					System.out.print(z);
					System.out.print("\n");
					System.out.print("s ");

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================
