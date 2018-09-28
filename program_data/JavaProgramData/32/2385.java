package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String C = new String(new char[1013]);
		int[] A = new int[1013];
		int[] B = new int[1013];
		int K1;
		int K2;
		int N;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (int I = 1; I <= N; I++)
		{
			if (I > 1)
			{
				scanf("\n");
			}
			C = new Scanner(System.in).nextLine();
			K1 = C.length();
			for (int J = 0; J < K1; J++)
			{
				A[K1 - J] = C.charAt(J) - '0';
			}
			C = new Scanner(System.in).nextLine();
			K2 = C.length();
			for (int J = 0; J < K2; J++)
			{
				B[K2 - J] = C.charAt(J) - '0';
			}
			for (int J = 1; J <= K2; J++)
			{
				A[J] -= B[J];
			}
			for (int J = 1; J <= K1; J++)
			{
				if (A[J] < 0)
				{
					A[J] += 10;
					A[J + 1]--;
				}
			}
			for (int J = K1; J >= 1; J--)
			{
				System.out.print(A[J]);
			}
			System.out.print("\n");
		}

	}
}

