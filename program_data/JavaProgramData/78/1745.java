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
		int a;
		int b;
		int c;
		int d;
		for (z = 10;z <= 50;z += 10)
		{
			for (q = 10;q <= 50;q += 10)
			{
				if (q == z)
				{
					continue;
				}
				for (s = 10;s <= 50;s += 10)
				{
					if (s == q || s == z)
					{
						continue;
					}
					for (l = 10;l <= 50;l += 10)
					{
						if (l == s || l == q || l == z)
						{
							continue;
						}
						if (z + q == s + l && z + l > s + q && z + s < q)
						{
							a = (z > q) + (z > s) + (z > l);
							b = (q > z) + (q > s) + (q > l);
							c = (s > z) + (s > q) + (s > l);
							d = (l > z) + (l > q) + (l > s);
							if (a == 3)
							{
								System.out.print("z");
								System.out.print(" ");
								System.out.print(z);
								System.out.print("\n");
							}
							if (b == 3)
							{
								System.out.print("q");
								System.out.print(" ");
								System.out.print(q);
								System.out.print("\n");
							}
							if (c == 3)
							{
								System.out.print("s");
								System.out.print(" ");
								System.out.print(s);
								System.out.print("\n");
							}
							if (d == 3)
							{
								System.out.print("l");
								System.out.print(" ");
								System.out.print(l);
								System.out.print("\n");
							}
							if (a == 2)
							{
								System.out.print("z");
								System.out.print(" ");
								System.out.print(z);
								System.out.print("\n");
							}
							if (b == 2)
							{
								System.out.print("q");
								System.out.print(" ");
								System.out.print(q);
								System.out.print("\n");
							}
							if (c == 2)
							{
								System.out.print("s");
								System.out.print(" ");
								System.out.print(s);
								System.out.print("\n");
							}
							if (d == 2)
							{
								System.out.print("l");
								System.out.print(" ");
								System.out.print(l);
								System.out.print("\n");
							}
							if (a == 1)
							{
								System.out.print("z");
								System.out.print(" ");
								System.out.print(z);
								System.out.print("\n");
							}
							if (b == 1)
							{
								System.out.print("q");
								System.out.print(" ");
								System.out.print(q);
								System.out.print("\n");
							}
							if (c == 1)
							{
								System.out.print("s");
								System.out.print(" ");
								System.out.print(s);
								System.out.print("\n");
							}
							if (d == 1)
							{
								System.out.print("l");
								System.out.print(" ");
								System.out.print(l);
								System.out.print("\n");
							}
							if (a == 0)
							{
								System.out.print("z");
								System.out.print(" ");
								System.out.print(z);
								System.out.print("\n");
							}
							if (b == 0)
							{
								System.out.print("q");
								System.out.print(" ");
								System.out.print(q);
								System.out.print("\n");
							}
							if (c == 0)
							{
								System.out.print("s");
								System.out.print(" ");
								System.out.print(s);

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================
