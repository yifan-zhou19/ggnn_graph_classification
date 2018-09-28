package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int o;
		int p;
		int q;
		int[] B = new int[300];
		int[] C = new int[10];
		int[] A = new int[300];
		int k;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				A[i] = Integer.parseInt(tempVar2);
			}
		}
		B[0] = A[0];
		for (i = 1;i < n;i++)
		{
			for (j = 0,k = 1;j < i;j++)
			{
			if (B[j] == A[i])
			{
				k = 0;
			}

			}
		 if (k != 0)
		 {
			 B[i] = A[i];
		 }
		 else
		 {
			 B[i] = '\0'; //once repeated,rid it
		 }
		}
		for (q = 0,p = 0;p < n;p++)
		{
			if (B[p] != '\0')
			{
				C[q] = B[p];
				q++;
			}
		}
		for (i = -1,o = 0;o < q;o++,i++)
		{
			if (i >= 0)
			{
				System.out.print(",");
			}
			System.out.printf("%d",C[o]);
		}

		return 0;
	}

}

