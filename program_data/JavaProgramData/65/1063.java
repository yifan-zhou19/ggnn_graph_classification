package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int[] A = new int[200];
		int[] B = new int[100];
		int a;
		int b;
		a = 0;
		b = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
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
		if ((A[i] == 0 && B[i] == 1) || (A[i] == 1 && B[i] == 2) || (A[i] == 2 && B[i] == 0))
		{
		a = a + 1;
		}
		else if ((B[i] == 0 && A[i] == 1) || (B[i] == 1 && A[i] == 2) || (B[i] == 2 && A[i] == 0))
		{
		b = b + 1;
		}
		else if ((A[i] == 0 && B[i] == 0) || (A[i] == 1 && B[i] == 1) || (A[i] == 2 && B[i] == 2))
		{
			 continue;
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
		else
		{
		System.out.print("B");
		}

			return 0;
	}

}

