package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		int b = 0;
		int[] A = new int[201];
		int[] B = new int[201];
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
				(A[i]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(B[i]) = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (A[i] == 0 && B[i] == 1)
			{
				a += 1;
			}
			else if (A[i] == 0 && B[i] == 2)
			{
				b += 1;
			}
			else if (A[i] == 1 && B[i] == 0)
			{
				b += 1;
			}
			else if (A[i] == 1 && B[i] == 2)
			{
				a += 1;
			}
			else if (A[i] == 2 && B[i] == 0)
			{
				a += 1;
			}
			else if (A[i] == 2 && B[i] == 1)
			{
				b += 1;
			}
			else
			{
				a = a;
				b = b;
			}
		}
		if (a < b)
		{
			System.out.print("B");
		}
		else if (a > b)
		{
			System.out.print("A");
		}
		else
		{
			System.out.print("Tie");
		}
		return 0;
	}




}

