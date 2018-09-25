package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum1 = 0;
		int sum2 = 0;
		int sum3 = 0;
		for (int A = 0;A < 3;A++)
		{
		   for (int B = 0;B < 3;B++)
		   {
				   for (int C = 0;C < 3;C++)
				   {
					  if ((C != A) && (C != B) && (A != B))
					  {
						 sum1 = (B > A) + (C == A);
						 sum2 = (A > B) + (A > C);
						 sum3 = (C > B) + (C > A);
						 if ((A > B) && (B > C) && (sum1 < sum2) && (sum2 < sum3))
						 {
							System.out.print("CBA");
							System.out.print("\n");
						 }
						  if ((A > C) && (C > B) && (sum1 < sum3) && (sum3 < sum2))
						  {
							System.out.print("BCA");
							System.out.print("\n");
						  }
						  if ((B > A) && (A > C) && (sum2 < sum1) && (sum1 < sum3))
						  {
							System.out.print("CAB");
							System.out.print("\n");
						  }
						  if ((B > C) && (C > A) && (sum2 < sum3) && (sum3 < sum1))
						  {
							System.out.print("ACB");
							System.out.print("\n");
						  }
						  if ((C > B) && (B > A) && (sum3 < sum2) && (sum2 < sum1))
						  {
							System.out.print("ABC");
							System.out.print("\n");
						  }
						  if ((C > A) && (A > B) && (sum3 < sum1) && (sum1 < sum2))
						  {
							System.out.print("BAC");
							System.out.print("\n");
						  }
					  }
				   }
		   }
		}
		return 0;
	}

}
