package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int[] S = new int[100];
			float[] A = new float[100];
			int j;
			float[] B = new float[100];
			A[0] = 1F;
			A[1] = 2F;
			B[0] = 2 / 1;
			for (j = 2;j < 100;j++)
			{
				A[j] = A[j - 1] + A[j - 2];
				B[j - 1] = A[j] / A[j - 1] + B[j - 2];
			}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				S[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			System.out.printf("%.3f\n",B[S[i] - 1]);
		}

		return 0;
	}


}

