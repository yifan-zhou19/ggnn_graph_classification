package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a1 = 0; //?????????????????
		int b1 = 0;
		int c1 = 0;
		int a; //??????????????
		int b;
		int c;
		for (a = 0;a <= 2;a++)
		{
			for (b = 0;b <= 2;b++)
			{
				for (c = 0;c <= 2;c++)
				{
					a1 = ((a < b) + (a == c)); //?????????????
					b1 = ((b < a) + (a> c));
					c1 = ((c > b) + (b > a));
					if (a > b && b > c && c1 > b1 && b1 > a1)
					{
						System.out.print("C");
						System.out.print("B");
						System.out.print("A");
						System.out.print("\n");
					}
					if (a > c && c > b && b1 > c1 && c1 > a1)
					{
						System.out.print("B");
						System.out.print("C");
						System.out.print("A");
						System.out.print("\n");
					}
					if (b > a && a > c && c1 > a1 && a1 > b1)
					{
						System.out.print("C");
						System.out.print("A");
						System.out.print("B");
						System.out.print("\n");
					}
					if (b > c && c > a && a1 > c1 && c1 > b1)
					{
						System.out.print("A");
						System.out.print("C");
						System.out.print("B");
						System.out.print("\n");
					}
					if (c > a && a > b && b1 > a1 && a1 > c1)
					{
						System.out.print("B");
						System.out.print("A");
						System.out.print("C");
						System.out.print("\n");
					}
					if (c > b && b > a && a1 > b1 && b1 > c1)
					{
						System.out.print("A");
						System.out.print("B");
						System.out.print("C");
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}

}
