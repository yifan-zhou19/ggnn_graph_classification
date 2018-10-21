package <missing>;

public class GlobalMembers
{
	/*
	3?????????????? 
	A??B??????C??????? 
	B??A??????A??C??? 
	C????B????B?A???? 
	????????????????????? 
	???????????3??????
	*/


	public static int Main()
	{
		int a;
		int b;
		int c;

		for (a = 1;a <= 3;a++)
		{
			for (b = 1;b <= 3;b++)
			{
				c = 6 - a - b;
				if (a != b)
				{
					if (((b > a) + (a == c) + a == 3) && ((a > b) + (a > c) + b == 3) && ((c > b) + (b > a) + c == 3))
					{
						if (a == 1)
						{
							System.out.print('A');
						}
						if (b == 1)
						{
							System.out.print('B');
						}
						if (c == 1)
						{
							System.out.print('C');
						}
						if (a == 2)
						{
							System.out.print('A');
						}
						if (b == 2)
						{
							System.out.print('B');
						}
						if (c == 2)
						{
							System.out.print('C');
						}
						if (a == 3)
						{
							System.out.print('A');
						}
						if (b == 3)
						{
							System.out.print('B');
						}
						if (c == 3)
						{
							System.out.print('C');
						}
						System.out.print("\n");
					}
				}
			}
		}

			return 0;
	}


}
