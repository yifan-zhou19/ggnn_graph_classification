package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] A = new int[100];
		int[] B = new int[100];
		int[] C = new int[100];
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
			for (j = 0;j < A[i];j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					B[j] = Integer.parseInt(tempVar3);
				}
			}
			for (j = 0;j < A[i];j++)
			{
				if (B[j] + 3 * (j + 1) > 63)
				{
					break;
				}

				else
				{
					C[i] = 60 - 3 * A[i];
				}
			}
			   if (B[j - 1] + 3 * j >= 60)
			   {
				   C[i] = B[j - 1];
			   }
			   else
			   {
				   C[i] = 60 - 3 * j;
			   }
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n", C[i]);
		}
		return 0;
	}
}

