//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static void f(int x)
	{
		int i;
		int j;
		int[] a = new int[5];
		a[0] = (int)Math.abs(x) % 10;
		a[1] = (int)Math.abs(x) % 100 / 10;
		a[2] = (int)Math.abs(x) % 1000 / 100;
		a[3] = (int)Math.abs(x) % 10000 / 1000;
		a[4] = (int)Math.abs(x) / 10000;
		if (x > 0)
		{
			if (a[0] != 0)
			{
				System.out.printf("%d",a[0]);
				if (a[4] != 0)
				{
					System.out.printf("%d%d%d%d",a[1],a[2],a[3],a[4]);
				}
				if (a[4] == 0)
				{
					if (a[3] != 0)
					{
						System.out.printf("%d%d%d",a[1],a[2],a[3]);
					}
					if (a[3] == 0)
					{
						if (a[2] != 0)
						{
							System.out.printf("%d%d",a[1],a[2]);
						}
						if (a[2] == 0)
						{
							if (a[1] != 0)
							{
								System.out.printf("%d",a[1]);
							}
						}
					}
				}
				System.out.print("\n");
			}
			if (a[0] == 0)
			{
				if (a[1] != 0)
				{
					System.out.printf("%d",a[1]);
					if (a[4] != 0)
					{
						 System.out.printf("%d%d%d",a[2],a[3],a[4]);
					}
					 if (a[4] == 0)
					 {
						if (a[3] != 0)
						{
							 System.out.printf("%d%d",a[2],a[3]);
						}
						 if (a[3] == 0)
						 {
							if (a[2] != 0)
							{
								System.out.printf("%d",a[2]);
							}
						 }
					 }
					System.out.print("\n");
				}
				if (a[1] == 0)
				{
					if (a[2] != 0)
					{
						System.out.printf("%d",a[2]);
						if (a[4] != 0)
						{
							System.out.printf("%d%d",a[3],a[4]);
						}
						if (a[4] == 0)
						{
							if (a[3] != 0)
							{
								System.out.printf("%d",a[3]);
							}
						}
						System.out.print("\n");
					}
					if (a[2] == 0)
					{
						if (a[3] != 0)
						{
							System.out.printf("%d",a[3]);
							if (a[4] != 0)
							{
								System.out.printf("%d",a[4]);
							}
							System.out.print("\n");
						}
						if (a[3] == 0)
						{
							System.out.printf("%d\n",a[4]);
						}
					}
				}
			}
		}
		if (x == 0)
		{
			System.out.print("0\n");
		}
		if (x < 0)
		{
				if (a[0] != 0)
				{
				System.out.printf("-%d",a[0]);
				if (a[4] != 0)
				{
					System.out.printf("%d%d%d%d",a[1],a[2],a[3],a[4]);
				}
				if (a[4] == 0)
				{
					if (a[3] != 0)
					{
						System.out.printf("%d%d%d",a[1],a[2],a[3]);
					}
					if (a[3] == 0)
					{
						if (a[2] != 0)
						{
							System.out.printf("%d%d",a[1],a[2]);
						}
						if (a[2] == 0)
						{
							if (a[1] != 0)
							{
								System.out.printf("%d",a[1]);
							}
						}
					}
				}
				System.out.print("\n");
				}
			if (a[0] == 0)
			{
				if (a[1] != 0)
				{
					System.out.printf("-%d",a[1]);
					if (a[4] != 0)
					{
						 System.out.printf("%d%d%d",a[2],a[3],a[4]);
					}
					 if (a[4] == 0)
					 {
						if (a[3] != 0)
						{
							 System.out.printf("%d%d",a[2],a[3]);
						}
						 if (a[3] == 0)
						 {
							if (a[2] != 0)
							{
								System.out.printf("%d",a[2]);
							}
						 }
					 }
					System.out.print("\n");
				}
				if (a[1] == 0)
				{
					if (a[2] != 0)
					{
						System.out.printf("-%d",a[2]);
						if (a[4] != 0)
						{
							System.out.printf("%d%d",a[3],a[4]);
						}
						if (a[4] == 0)
						{
							if (a[3] != 0)
							{
								System.out.printf("%d",a[3]);
							}
						}
						System.out.print("\n");
					}
					if (a[2] == 0)
					{
						if (a[3] != 0)
						{
							System.out.printf("-%d",a[3]);
							if (a[4] != 0)
							{
								System.out.printf("%d",a[4]);
							}
							System.out.print("\n");
						}
						if (a[3] == 0)
						{

//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


