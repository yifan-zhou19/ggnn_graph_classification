package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] A;
		int[] B;
		A = new int[n];
		B = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A[i] = Integer.parseInt(tempVar2);
			}
			B[n - 1 - i] = A[i];
		}
		for (i = 0;i < n;i++)
		{
			if (i < (n - 1))
			{
			System.out.printf("%d ",B[i]);
			}
			else
			{
				System.out.printf("%d",B[i]);
			}

		}

	}


}

