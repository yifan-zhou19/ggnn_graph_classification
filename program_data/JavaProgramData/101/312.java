package <missing>;

public class GlobalMembers
{
	//*************************************************************
	//*                  ???????                           *
	//*                  ?????1000010573                     *
	//*                  ?????2010?11?                     *         
	//*************************************************************



	public static int Main() //???
	{

		int A = 0; //??????
		int B = 0;
		int C = 0;
		int a1 = 0;
		int a2 = 0;
		int b1 = 0;
		int b2 = 0;
		int c1 = 0;
		int c2 = 0;
		//??		
		for (A = 0; A < 3; A++) // A??A?????
		{
			for (B = 0; B < 3; B++) // B??B?????
			{
				for (C = 0; C < 3; C++) // C??C?????
				{
					a1 = (B > A); // ?a1?a2????A??????
					a2 = (C == A);
					b1 = (A > B); //?b1?b2????B??????
					b2 = (A > C);
					c1 = (C > B);
					c2 = (B > A); //?c1?c2????C??????
					if (a1 + a2 + A == 2 && b1 + b2 + B == 2 && c1 + c2 + C == 2) // ????????????????
					{
					// ???????????????
						if (A < B && B < C)
						{
							System.out.print("A");
							System.out.print("B");
							System.out.print("C");
						}
						if (A < C && C < B)
						{
							System.out.print("A");
							System.out.print("C");
							System.out.print("B");
						}
						if (B < A && A < C)
						{
							System.out.print("B");
							System.out.print("A");
							System.out.print("C");
						}
						if (B < C && C < A)
						{
							System.out.print("B");
							System.out.print("C");
							System.out.print("A");
						}
						if (C < B && B < A)
						{
							System.out.print("C");
							System.out.print("B");
							System.out.print("A");
						}
						if (C < A && A < C)
						{
							System.out.print("C");
							System.out.print("A");
							System.out.print("B");
						}
					}
				}
			}
		}
		return 0;
	}

}
