package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] A = new int[100];
		int[] B = new int[100];
		double[] C = new double[100];
		double[] D = new double[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 A[i] = Integer.parseInt(tempVar2);
						 }
						 String tempVar3 = ConsoleInput.scanfRead();
						 if (tempVar3 != null)
						 {
							 B[i] = Integer.parseInt(tempVar3);
						 }
						if (i == 0)
						{
							C[0] = 1.0 * B[0] / A[0];
						}
						 if (i >= 1)
						 {
							 C[i] = 1.0 * B[i] / A[i];
						 }
						 D[i] = C[i] - C[0];
						 if (i >= 1 && D[i] > 0.05)
						 {
							 System.out.print("better\n");
						 }

							 if (i >= 1 && D[i] < -0.05)
							 {
								 System.out.print("worse\n");
							 }
							 if (i >= 1 && D[i] >= -0.05 && D[i] <= 0.05)
							 {
								 System.out.print("same\n");
							 }
		}

		return 0;
	}

}

