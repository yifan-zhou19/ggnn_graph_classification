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
		int[][] sz = new int[n][2];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i][0]) = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				(sz[i][1]) = Integer.parseInt(tempVar3);
			}
		}
		int A = 0;
		int B = 0;
		int k;
		for (i = 0;i < n;i++)
		{
			k = sz[i][0] - sz[i][1];
			if (k == -1 || k == 2)
			{
				A++;
			}
			if (k == 1 || k == -2)
			{
				B++;
			}
		}
		if (A > B)
		{
			System.out.print("A");
		}
		if (A < B)
		{
			System.out.print("B");
		}
		if (A == B)
		{
			System.out.print("Tie");
		}
		return 0;
	}
}

