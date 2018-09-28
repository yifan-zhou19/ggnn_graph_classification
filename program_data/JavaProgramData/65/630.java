package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		int b = 0;
		int[] A = new int[200];
		int[] B = new int[200];
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
			int c = A[i] - B[i];
			if (c == -1 || c == 2)
			{
				a++;
			}
			else if (c == 1 || c == -2)
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
		else
		{
			System.out.print("B");
		}
		return 0;
	}
}

