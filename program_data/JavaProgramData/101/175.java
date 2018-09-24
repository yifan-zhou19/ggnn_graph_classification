package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a = 0; //??????a,b,c
		int b = 0;
		int c = 0;
		int cca = 0; //????????cca,ccb,ccc
		int ccb = 0;
		int ccc = 0;
		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b != a,b <= 3;b++)
			{
				c = 6 - a - b;
				cca = (b > a) + (c == a);
				ccb = (a > b) + (a > c);
				ccc = (c > b) + (b > a);
				if (((a + cca) == 3) && ((b + ccb) == 3) && ((ccc + c) == 3))
				{
					break; //???????????????,????
				}
			}
		}
			if (a > b && b > c)
			{
				System.out.print("CBA");
				System.out.print("\n");
			}
			if (a > c && c > b)
			{
				System.out.print("BCA");
				System.out.print("\n");
			}
			if (b > a && a > c)
			{
				System.out.print("ACB");
				System.out.print("\n");
			}
			if (b > c && c > a)
			{
				System.out.print("ACB");
				System.out.print("\n");
			}
			if (c > b && b > a)
			{
				System.out.print("ABC");
				System.out.print("\n");
			}
			if (c > a && a > b)
			{
				System.out.print("BAC");
				System.out.print("\n");
			}
			return 0;
	}
}
