package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int max1;
		int max2;
		int max;
		for (a = 1; a <= 3; a++)
		{
			for (b = 1; b <= 3; b++)
			{
				for (c = 1;c <= 3; c++)
				{
					 if (a + (b > a) + (c == a) == 3 && b + (a > b) + (a > c) == 3 && c + (c > b) + (b > a) == 3)
					 {
						 break;
					 }
				}
			}
		}
					 max1 = a > b != 0 ? a : b;
					 max2 = b > c != 0 ? b : c;
					 max = max1 > max2 != 0 ? max1 : max2;
					 System.out.print((char)(max + 62));
					 System.out.print((char)(max + 63));
					 System.out.print((char)(max + 61));
					 return 0;
	}
}
