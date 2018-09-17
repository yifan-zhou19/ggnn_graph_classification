package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int rightA;
		int rightB;
		int rightC;
		for (A = 0;A <= 2;A++)
		{
				for (B = 0;B <= 2;B++)
				{
					for (C = 0;C <= 2;C++)
					{
						   if (B > A && A == C)
						   {
							   rightA = 2;
						   }
					   else if (B > A || A == C)
					   {
						   rightA = 1;
					   }
					   else
					   {
						   rightA = 0;
					   }
						if (A > B && A > C)
						{
							rightB = 2;
						}
					   else if (A > B || A > C)
					   {
						   rightB = 1;
					   }
					   else
					   {
						   rightB = 0;
					   }
						if (C > B && B > A)
						{
							rightC = 2;
						}
					   else if (C > B || B > A)
					   {
						   rightC = 1;
					   }
					   else
					   {
						   rightC = 0;
					   }

					   if (rightA > rightB && rightB > rightC && A < B && B < C)
					   {
						   System.out.print("ABC");
						   System.out.print("\n");
					   }
					   if (rightA > rightC && rightC > rightB && A < C && C < B)
					   {
						   System.out.print("ACB");
						   System.out.print("\n");
					   }
					   if (rightB > rightA && rightA > rightC && B < A && A < C)
					   {
						   System.out.print("BAC");
						   System.out.print("\n");
					   }
					   if (rightB > rightC && rightC > rightA && B < C && C < A)
					   {
						   System.out.print("BCA");
						   System.out.print("\n");
					   }
					   if (rightC > rightA && rightA > rightB && C < A && A < B)
					   {
						   System.out.print("CAB");
						   System.out.print("\n");
					   }
					   if (rightC > rightB && rightB > rightC && C < B && B < A)
					   {
						   System.out.print("CBA");
						   System.out.print("\n");
					   }
					}
				}
		}
		return 0;
	}

}
