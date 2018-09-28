package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] A = new int[200];
		int[] B = new int[200];
		int V = 0;
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
			if (A[i] == 2 && B[i] == 0)
			{
				V++;
			}
			else if (A[i] == 0 && B[i] == 2)
			{
				V--;
			}
			else
			{
				if (A[i] > B[i])
				{
					V--;
				}
				else if (A[i] < B[i])
				{
					V++;
				}
			}
		}
		if (V > 0)
		{
			System.out.println("A");
		}
		else if (V < 0)
		{
			System.out.println("B");
		}
		else
		{
			System.out.println("Tie");
		}
		return 0;
	}
}

