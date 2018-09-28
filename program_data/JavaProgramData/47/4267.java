package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] A = new int[100];
		int[] B = new int[100];
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < m;i++)
		{
			B[i] = A[m - i - 1];
		}

		for (i = 0;i < m - 1;i++)
		{
			System.out.printf("%d ",B[i]);
		}
		System.out.printf("%d",B[m - 1]);
		return 0;
	}
}

