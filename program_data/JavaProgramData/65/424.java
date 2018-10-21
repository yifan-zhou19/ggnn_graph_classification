package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] A = new int[200];
		int[] B = new int[200];
		int countA = 0;
		int countB = 0;
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
			if ((A[i] - B[i] == -1) || (A[i] - B[i] == 2))
			{
				countA++;
			}
			else if ((A[i] - B[i] == 1) || (A[i] - B[i] == -2))
			{
				countB++;
			}
		}
		if (countA > countB)
		{
			System.out.print("A");
		}
		else if (countB > countA)
		{
			 System.out.print("B");
		}
		else
		{
			System.out.print("Tie");
		}
		return 0;
	}

}

