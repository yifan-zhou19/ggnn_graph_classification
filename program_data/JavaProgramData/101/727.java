package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int AFAN; //????ABC???
		int BFAN;
		int CFAN;
		int A = 3; //?? ?ABC?????????,?????????????????1
		int B = 3;
		int C = 3;
		for (AFAN = 2;AFAN <= 3;AFAN++) //????????ABC??????????????????????????1?2?3??A?????????A??????1
		{
		   for (BFAN = 1;BFAN <= 3;BFAN++)
		   {
			  for (CFAN = 1;CFAN <= 3;CFAN++)
			  {
					A = B = C = 3;
					if (AFAN != BFAN && BFAN != CFAN && CFAN != AFAN) //ABC??????
					{
							if (BFAN > AFAN)
							{
								   A = A - 1;
								   C = C - 1; //AC????????
							}
							else
							{
								B = B - 1;
							}
							if (AFAN > CFAN)
							{
							   B = B - 1;
							}
							if (CFAN > BFAN)
							{
							   C = C - 1; //???????
							}
						 if (A > B && B > C)
						 {
							 System.out.print("CBA");
							 System.out.print("\n");
						 }
						 else if (A > C && C > B)
						 {
							 System.out.print("BCA");
							 System.out.print("\n");
						 }
						 else if (B > A && A > C)
						 {
							 System.out.print("CAB");
							 System.out.print("\n");
						 }
						 else if (C > A && A > B)
						 {
							 System.out.print("BAC");
							 System.out.print("\n");
						 }
						 else if (B > C && C > A)
						 {
							 System.out.print("ACB");
							 System.out.print("\n");
						 }
						 else if (C > B && B > A)
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
