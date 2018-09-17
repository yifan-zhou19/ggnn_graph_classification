package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int a1;
		int b1;
		int c1;
		int a2;
		int b2;
		int c2;
		int sum1;
		int sum2;
		int sum3;
		int find;
		for (a = 0;a <= 2;a++)
		{
			if (find == 1)
			{
					break;
			}
			for (b = 0;b <= 2;b++)
			{
				if (find == 1)
				{
					break;
				}
				for (c = 0;c <= 2;c++)
				{

					a1 = b > a;
					a2 = a == c;
					b1 = a > b;
					b2 = a > c;
					c1 = c > b;
					c2 = b > a;
				   sum1 = a1 + a2;
				   sum2 = b1 + b2;
				   sum3 = c1 + c2;

					   if (a >= b != 0 && a >= c != 0 && b >= c != 0 && sum1 <= sum2 != 0 && sum1 <= sum3 != 0 && sum2 <= sum3)
					   {
						   System.out.print("ABC",find = 1);
						   break;
					   }
					   else if (a >= c != 0 && a >= b != 0 && c >= b != 0 && sum1 <= sum3 != 0 && sum1 <= sum2 != 0 && sum3 <= sum2)
					   {
						   System.out.print("ACB",find = 1);
						   break;
					   }
					   else if (b >= c != 0 && b >= a != 0 && a >= c != 0 && sum2 <= sum3 != 0 && sum2 <= sum1 != 0 && sum1 <= sum3)
					   {
						   System.out.print("BAC",find = 1);
						   break;
					   }
					   else if (b >= c != 0 && b >= a != 0 && c >= a != 0 && sum2 <= sum3 != 0 && sum2 <= sum1 != 0 && sum3 <= sum1)
					   {
						   System.out.print("BCA",find = 1);
						   break;
					   }
					   else if (c >= a != 0 && c >= b != 0 && a >= b != 0 && sum3 <= sum1 != 0 && sum3 <= sum2 != 0 && sum1 <= sum2)
					   {
						   System.out.print("CAB",find = 1);
						   break;
					   }
					   else if (c >= a != 0 && c > b && b >= a != 0 && sum3 <= sum1 != 0 && sum3 < sum2 && sum2 <= sum1)
					   {
						   System.out.print("CBA",find = 1);
						   break;
					   }

				}
			}
		}








					return 0;
	}









}
