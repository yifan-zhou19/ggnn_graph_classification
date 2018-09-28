package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int sum1 = 0;
		int sum2 = 0;
		int[] A = new int[200];
		int[] B = new int[200];
		int[] C = new int[200];
		int[] D = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] E = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				C[i] = Integer.parseInt(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			sum1 = 0;
			sum2 = 0;
			if (A[i] % 4 == 0 && A[i] % 100 != 0 || A[i] % 400 == 0)
			{
				for (j = 0;j < B[i] - 1;j++)
				{
				  sum1 += E[j];
				}
				for (j = 0;j < C[i] - 1;j++)
				{
				  sum2 += E[j];
				}
			}
		   else
		   {
				for (j = 0;j < B[i] - 1;j++)
				{
				   sum1 += D[j];
				}
				for (j = 0;j < C[i] - 1;j++)
				{
				   sum2 += D[j];
				}
		   }

			if (sum1 > sum2 && (sum1 - sum2) % 7 == 0 || sum1 < sum2 && (sum2 - sum1) % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
		return 0;
	}
}

