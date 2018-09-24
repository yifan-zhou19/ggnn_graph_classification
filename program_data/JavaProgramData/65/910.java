package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int b = 0;
		int a = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] A = new int[n];
		int[] B = new int[n];
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
		}
		for (i = 0;i < n;i++)
		{
			if ((A[i] == 0 && B[i] == 1) || (A[i] == 1 && B[i] == 2) || (A[i] == 2 && B[i] == 0))
			{
				a++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if ((A[i] == 0 && B[i] == 2) || (A[i] == 1 && B[i] == 0) || (A[i] == 2 && B[i] == 1))
			{
				b++;
			}
		}
		if (a > b)
		{
			System.out.print("A");
		}
		else if (a == b)
		{
			System.out.print("Tie");
		}
		else if (a < b)
		{
			System.out.print("B");
		}
		return 0;
	}

}

