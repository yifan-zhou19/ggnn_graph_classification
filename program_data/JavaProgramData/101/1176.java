package <missing>;

public class GlobalMembers
{
	//============================================================================
	// Name        : shj.cpp
	// Author      : ???
	// Time        : 2013.12.07
	// Description : ???
	//============================================================================
	public static int Main()
	{
		int a = 0;
		int b = 0;
		int c = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		for (a = 0;a < 3;a++)
		{
			for (b = 0;b < 3;b++)
			{
				for (c = 0;c < 3;c++)
				{
					if (a == b || a == c || b == c)
					{
						continue;
					}
					else
					{
					   x = (b > a) + (c > a); //a???????
					   y = (a > b) + (a > c); //b???????
					   z = (c > b) + (b > a); //c???????
					   if (b > a && a > c && z > x && x > y)
					   {
							  System.out.print("B");
							  System.out.print("A");
							  System.out.print("C");
							  System.out.print("\n");
					   }
					   if (b > c && c > a && x > z && z > y)
					   {
							  System.out.print("B");
							  System.out.print("C");
							  System.out.print("A");
							  System.out.print("\n");
					   }
					   if (c > b && b > a && x > y && y > z)
					   {
							  System.out.print("C");
							  System.out.print("B");
							  System.out.print("A");
							  System.out.print("\n");
					   }
					   if (c > a && a > b && y > x && x > z)
					   {
							  System.out.print("C");
							  System.out.print("A");
							  System.out.print("B");
							  System.out.print("\n");
					   }
					}
				}
			}
		}
	  return 0;
	}

}
