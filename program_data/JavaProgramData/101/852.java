package <missing>;

public class GlobalMembers
{
	//??? ??? 20121024 

	public static int Main()
	{
		int A; //????????
		int B;
		int C;
		for (A = 0;A < 3;A++)
		{
		for (B = 0;B < 3;B++)
		{
		for (C = 0;C < 3;C++)
		{
		if (A != B && A != C && B != C) //??????
		{
			int a = (B > A) + (C == A); //A??
			int b = (A > B) + (A > C); //B??
			int c = (C > B) + (B > A); //C??

			if (a + A == 2 && b + B == 2 && c + c == 2) //????????????????
			{
				//??????
			for (;;)
			{
					if (A == 0)
					{
						System.out.print("A");
						break;
					}

					if (B == 0)
					{
						System.out.print("B");
						break;
					}

					if (C == 0)
					{
						System.out.print("C");
						break;
					}
			}

			for (;;)
			{
					if (A == 1)
					{
						System.out.print("A");
						break;
					}

					if (B == 1)
					{
						System.out.print("B");
						break;
					}

					if (C == 1)
					{
						System.out.print("C");
						break;
					}
			}

			for (;;)
			{
					if (A == 2)
					{
						System.out.print("A");
						break;
					}

					if (B == 2)
					{
						System.out.print("B");
						break;
					}

					if (C == 2)
					{
						System.out.print("C");
						break;
					}
			}
			return 0;
			}
		}
		}
		}
		}
	}

}
