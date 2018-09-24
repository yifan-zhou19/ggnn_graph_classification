package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a; //????
		int b;
		int c;
		int a1;
		int a2;
		int b1;
		int b2;
		int c1;
		int c2;
		int t = 0;
		for (a = 0;a < 3;a++)
		{
			for (b = 0;b < 3;b++)
			{
				for (c = 0;c < 3;c++)
				{
					a1 = (b > a),a2 = (c == a);
					b1 = (a > b),b2 = (a > c);
					c1 = (c > b),c2 = (b > a); //??????
					if (a1 + a2 == (2 - a) && (b1 + b2 == (2 - b) && c1 + c2 == (2 - c))) //??????????????
					{
						if (a > b && b > c)
						{
							System.out.print("CBA");
						}
						else if (b > a && a > c)
						{
							System.out.print("CAB");
						}
						else if (c > a && a > b)
						{
							System.out.print("BAC");
						}
						else if (c > b && b > a)
						{
							System.out.print("ABC");
						}
						else if (b > c && c > a)
						{
							System.out.print("ACB");
						}
						else if (a > c && c > b)
						{
							System.out.print("BCA");
						}
					}
				}

			}

		}


		return 0;
	}
}
