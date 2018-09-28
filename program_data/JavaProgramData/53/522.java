package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] A = new int[300];
		int[] B = new int[300];
		int n;
		int i;
		int j;
		int t;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			A[0] = Integer.parseInt(tempVar2);
		}
		B[0] = A[0];
		j = 1;
		for (i = 1;i < n;i++)
		{
			t = 0;
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				A[i] = Integer.parseInt(tempVar3);
			}
			for (k = i - 1;k >= 0;k--)
			{
				if (A[i] == A[k])
				{
					t = 1;
					break;
				}
			}
			if (t == 0)
			{
				B[j] = A[i];
				j = j + 1;
			}
		}
		k = j;
		for (j = 0;j < k - 1;j++)
		{
			System.out.printf("%d,",B[j]);
		}
		System.out.printf("%d",B[k - 1]);
	}
}

