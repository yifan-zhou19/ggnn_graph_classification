package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		int b = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[][] A = new int[200][200];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				A[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				A[i][1] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (A[i][0] == 0)
			{
				if (A[i][1] == 1)
				{
					a++;
				}
				if (A[i][1] == 2)
				{
					b++;
				}
			}
			if (A[i][0] == 1)
			{
				if (A[i][1] == 0)
				{
					b++;
				}
				if (A[i][1] == 2)
				{
					a++;
				}
			}
			if (A[i][0] == 2)
			{
				if (A[i][1] == 0)
				{
					a++;
				}
				if (A[i][1] == 1)
				{
					b++;
				}
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

