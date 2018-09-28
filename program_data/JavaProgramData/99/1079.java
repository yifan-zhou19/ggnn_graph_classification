package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] A = new int[n];
		double[] B = {0, 0, 0, 0};
		for (i = 0;i < n;i++)
		{
		   A[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   if (A[i] < 19)
		   {
			  B[0] = B[0] + 1;
		   }
		   else
		   {
				 if (A[i] < 36)
				 {
					B[1] = B[1] + 1;
				 }
				 else
				 {
					   if (A[i] < 61)
					   {
						   B[2] = B[2] + 1;
					   }
					   else
					   {
						   B[3] = B[3] + 1;
					   }
				 }
		   }
		}
		System.out.printf("%.2f", "1-18: ");
		System.out.printf("%.2f", (B[0] * 100) / n);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", '\n');
		System.out.printf("%.2f", "19-35: ");
		System.out.printf("%.2f", (B[1] * 100) / n);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "36-60: ");
		System.out.printf("%.2f", (B[2] * 100) / n);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		System.out.printf("%.2f", "60??: ");
		System.out.printf("%.2f", (B[3] * 100) / n);
		System.out.printf("%.2f", "%");
		System.out.printf("%.2f", "\n");
		return 0;
	}
}

