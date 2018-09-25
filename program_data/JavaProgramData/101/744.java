package <missing>;

public class GlobalMembers
{
	/*
	  Name:???
	  Author: 120012757(chenminhuan)
	  Date: 15/10/12 21:40
	
	*/
	public static void print(int A,int B,int C)
	{ //???????
					//cout<<A<<B<<C<<endl;
					if (A == 0)
					{
						System.out.print("A");
					}
					else
					{
					if (B == 0)
					{
						System.out.print("B");
					}
					else
					{
					System.out.print("C");
					}
					}

					if (A == 1)
					{
						System.out.print("A");
					}
					else
					{
					if (B == 1)
					{
						System.out.print("B");
					}
					else
					{
					System.out.print("C");
					}
					}

					if (A == 2)
					{
						System.out.print("A");
					}
					else
					{
					if (B == 2)
					{
						System.out.print("B");
					}
					else
					{
					System.out.print("C");
					}
					}
	}
	public static int Main()
	{

		for (int A = 0 ;A < 3; ++A) //??A???
		{
				for (int B = 0; B < 3 ; ++B) //??B???
				{
				for (int C = 0; C < 3 ; ++C) //??C???
				{
				if (A != B && A != C && A != B)
				{
				if ((2 - A == (B > A) + (C == A)) && (2 - B == (A > B) + (A > C)) && (2 - C) == (C > B) + (B > A))
				{
				//????????? 
					 print(A, B, C);
				}
				}
				}
				}
		}



		return 0;
	}
}
