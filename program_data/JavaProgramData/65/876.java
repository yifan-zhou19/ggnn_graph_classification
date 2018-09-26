package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] A = new int[n];
		int[] B = new int[n];
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				B[i] = Integer.parseInt(tempVar3);
			}
		}
		int x = 0;
		int y = 0;
		for (int i = 0;i < n;i++)
		{
			if ((A[i] == 0 && B[i] == 1) || (A[i] == 1 && B[i] == 2) || (A[i] == 2 && B[i] == 0))
			{
				x = x + 1;
			}
			if ((B[i] == 0 && A[i] == 1) || (B[i] == 1 && A[i] == 2) || (B[i] == 2 && A[i] == 0))
			{
				y = y + 1;
			}
		}
		if (x > y)
		{
			System.out.print("A");
		}
		if (x < y)
		{
			System.out.print("B");
		}
		if (x == y)
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

