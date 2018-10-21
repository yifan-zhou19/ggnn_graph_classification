package <missing>;

public class GlobalMembers
{
	/*****************************
	**  ??????			**
	**  ???1000012847		**
	**  ??????			**
	**  ???2010.11.19		**
	*****************************/


	public static int Main()
	{
		int a;
		int b;
		int c;
		for (a = 1; a <= 3; a++) //?123??????????????????
		{
			for (b = 1; b <= 3; b++)
			{
				for (c = 1; c <= 3; c++)
				{
					//?????????????????
					if ((a + (b > a) + (c == a)) == 3 && (b + (a > b) + (a > c)) == 3 && (c + (c > b) + (b > a)) == 3)
					{
						if (a > b && b > c) //?????????????????
						{
							System.out.print("CBA");
							System.out.print("\n");
						}
						else if (a > c && c > b)
						{
							System.out.print("BCA");
							System.out.print("\n");
						}
						else if (b > a && a > c)
						{
							System.out.print("CAB");
							System.out.print("\n");
						}
						else if (b > c && c > a)
						{
							System.out.print("ACB");
							System.out.print("\n");
						}
						else if (c > a && a > b)
						{
							System.out.print("BAC");
							System.out.print("\n");
						}
						else
						{
							System.out.print("ABC");
							System.out.print("\n");
						}
					}
				}
			}
		}
		return 0;
	}
}
