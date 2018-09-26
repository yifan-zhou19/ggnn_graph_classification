package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int f;
		int g;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] A = new int[n];
		int[] B = new int[n];
		i = 0,k = 0;
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A[i] = Integer.parseInt(tempVar2);
			}
			if (A[i] % 2 != 0)
			{
				B[k] = A[i];
				k++;
			}
			i++;
		}
		i = 0;
		f = 0;
		while (f < k)
		{
			i = 0;
			while (i < k - f - 1)
			{
				if (B[i] > B[i + 1])
				{
					g = B[i + 1];
					B[i + 1] = B[i];
					B[i] = g;
				}
				i++;
			}
			f++;
		}
		i = 0;
		while (i < k - 1)
		{
		   System.out.printf("%d,",B[i]);
		   i++;
		}
		System.out.printf("%d",B[k - 1]);
		return 0;
	}

}

