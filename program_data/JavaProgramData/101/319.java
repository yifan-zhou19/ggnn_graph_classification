package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A;
		int B;
		int C;
		int suma;
		int sumb;
		int sumc;
		for (A = 0; A <= 2; A++)
		{
			for (B = 0; B <= 2; B++)
			{
				for (C = 0; C <= 2; C++)
				{
					suma = (B > A) + (C == A);
					sumb = (A > B) + (A > C);
					sumc = (C > B) + (B > A);
					if (!(A <= B != 0 && suma <= sumb != 0 || A <= C != 0 && suma <= sumc != 0 || B <= C != 0 && sumb <= sumc != 0 || A >= B != 0 && suma >= sumb != 0 || A >= C != 0 && suma >= sumc != 0 || B >= C != 0 && sumb >= sumc))
					{
						 if (suma == sumb)
						 {
								  if (sumc >= suma)
								  {
								  System.out.print("BAC");
								  System.out.print("\n");
								  }
								  else
								  {
								  System.out.print("CBA");
								  System.out.print("\n");
								  }
						 }
						 if (suma > sumb)
						 {
									  if (sumc >= suma)
									  {
									  System.out.print("CAB");
									  System.out.print("\n");
									  }
									  if (sumc <= sumb)
									  {
									  System.out.print("ABC");
									  System.out.print("\n");
									  }
									  else
									  {
									  System.out.print("ACB");
									  System.out.print("\n");
									  }
						 }
						 if (suma < sumb)
						 {
									  if (sumc >= sumb)
									  {
									  System.out.print("CBA");
									  System.out.print("\n");
									  }
									  if (sumc <= suma)
									  {
									  System.out.print("BAC");
									  System.out.print("\n");
									  }
									  else
									  {
									  System.out.print("BCA");
									  System.out.print("\n");
									  }
						 }
					}
				}
			}
		}
		return 0;
	}



}
