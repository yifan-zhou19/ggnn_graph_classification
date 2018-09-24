package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int[] A = new int[210];
		int[] B = new int[210];
		int a = 0;
		int b = 0;
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
			if ((A[i] == 0 && B[i] == 1) || (A[i] == 1 && B[i] == 2) || (A[i] == 2 && B[i] == 0))
			{
				a = a + 1;
			}
			if ((B[i] == 0 && A[i] == 1) || (B[i] == 1 && A[i] == 2) || (B[i] == 2 && A[i] == 0))
			{
				b = b + 1;
			}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		if (a < b)
		{
			System.out.print("B");
		}
		if (a == b)
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

