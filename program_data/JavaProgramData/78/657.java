package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : 1.cpp
	// Author      : ???
	// Version     :
	// Copyright   : Your copyright notice
	// Description : Hello World in C++
	//============================================================================


	public static int Main()
	{
		int i = 0; //?z,q,s,l????
		int z = 0;
		int q = 0;
		int s = 0;
		int l = 0;
		for (int z = 1;z <= 5;z = z + 1)
		{

			for (int q = 1;q <= 5;q = q + 1)
			{

				for (int s = 1;s <= 5;s = s + 1)
				{

					for (int l = 0;l <= 5;l = l + 1)
					{
						if (((z + q) == (s + l)) + ((z + l) > (s + q)) + ((z + s) < q) == 3)
						{
						   if (l > q)
						   {
							System.out.print("l");
							System.out.print(" ");
							System.out.print(l * 10);
							System.out.print("\n");
							System.out.print("q");
							System.out.print(" ");
							System.out.print(q * 10);
							System.out.print("\n");

								if (z > s)
								{
								System.out.print("z");
								System.out.print(" ");
								System.out.print(z * 10);
								System.out.print("\n");
								System.out.print("s");
								System.out.print(" ");
								System.out.print(s * 10);
								System.out.print("\n");
								return 0;
								}
							else if (s > z)
							{
								System.out.print("s");
								System.out.print(" ");
								System.out.print(s * 10);
								System.out.print("\n");
								System.out.print("z");
								System.out.print(" ");
								System.out.print(z * 10);
								System.out.print("\n");
							}
						   }
							else if (q > l)
							{
							System.out.print("q");
							System.out.print(" ");
							System.out.print(q * 10);
							System.out.print("\n");
							System.out.print("l");
							System.out.print(" ");
							System.out.print(l * 10);
							System.out.print("\n");

								if (z > s)
								{
								System.out.print("z");
								System.out.print(" ");
								System.out.print(z * 10);
								System.out.print("\n");
								System.out.print("s");
								System.out.print(" ");
								System.out.print(s * 10);
								System.out.print("\n");
								}
								else if (s > z)
								{
								System.out.print("s");
								System.out.print(" ");
								System.out.print(s * 10);
								System.out.print("\n");
								System.out.print("z");
								System.out.print(" ");
								System.out.print(z * 10);
								System.out.print("\n");
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
