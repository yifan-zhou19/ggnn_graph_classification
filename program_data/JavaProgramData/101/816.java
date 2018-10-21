package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A = 3; //?ABC???????????????
		int B = 2;
		int C = 1;
		int sumA;
		int sumB;
		int sumC;
			sumA = (B > A) + (C == A);
			sumB = (A > B) + (A > C);
			sumC = (C > B) + (B > A);
			if (sumA < sumB && sumB < sumC)
			{
				System.out.print("CAB");
				System.out.print("\n");
			}
			else
			{

				A = 3;
				B = 1;
				C = 2;
				sumA = (B > A) + (C == A);
				sumB = (A > B) + (A > C);
				sumC = (C > B) + (B > A);
				if (sumA < sumC && sumC < sumB)
				{
					System.out.print("BCA");
					System.out.print("\n");
				}
				else
				{
					A = 1;
					B = 3;
					C = 2;
					sumA = (B > A) + (C == A);
					sumB = (A > B) + (A > C);
					sumC = (C > B) + (B > A);
					if (sumB < sumC && sumC < sumA)
					{
						System.out.print("ACB");
						System.out.print("\n");
					}
					else
					{
						B = 3;
						A = 2;
						C = 1;
						sumA = (B > A) + (C == A);
						sumB = (A > B) + (A > C);
						sumC = (C > B) + (B > A);
						if (sumB < sumA && sumA < sumC)
						{
							System.out.print("CAB");
							System.out.print("\n");
						}
						else
						{
							A = 2;
							C = 3;
							B = 1;
							sumA = (B > A) + (C == A);
							sumB = (A > B) + (A > C);
							sumC = (C > B) + (B > A);
							if (sumC < sumA && sumA < sumB)
							{
								System.out.print("BAC");
								System.out.print("\n");
							}
							else
							{
								C = 3;
								B = 2;
								A = 1;
								sumA = (B > A) + (C == A);
								sumB = (A > B) + (A > C);
								sumC = (C > B) + (B > A);
								if (sumC < sumB && sumB < sumA)
								{
									System.out.print("ABC");
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
