package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int A = 1;
		int B = 1;
		int C = 1;
		int D = 1;
		int E = 1;
		if (A == 1 || A == 2)
		{
			A = 2;
			E = 1;
			D = 1;
		}
		if (B == 1 || B == 2)
		{
			B = 2;
			if (C == 1)
			{
				C = 1;
				A = 5;
				E = 4;
				D = 3;
				System.out.print(A);
				System.out.print(" ");
				System.out.print(B);
				System.out.print(" ");
				System.out.print(C);
				System.out.print(" ");
				System.out.print(D);
				System.out.print(" ");
				System.out.print(E);
				System.out.print("\n");
			}
			if (D == 1)
			{
				D = 1;
				E = 2;
			}
			if (E == 1)
			{
				E = 1;
				D = 1;
			}
		}
		if (C == 1 || C == 2)
		{
			A = 5;
			C = 2;
			if (D == 1)
			{
				D = 1;
				E = 1;
			}
			if (E == 1)
			{
				E = 1;
				D = 1;
			}
		}
		if (D == 1 || D == 2)
		{
			C != 1;
			if (E == 1)
			{
				E = 1;
				D = 1;
			}
		}
		return 0;
	}
}
