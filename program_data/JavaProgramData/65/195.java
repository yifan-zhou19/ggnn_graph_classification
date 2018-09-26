package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[][] a = new int[1000][2];
		int i;
		int j;
		int A = 0;
		int B = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < 2;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i][0] == 0 && a[i][1] == 0)
			{
				;
			}
			if (a[i][0] == 1 && a[i][1] == 1)
			{
				;
			}
			if (a[i][0] == 2 && a[i][1] == 2)
			{
				;
			}
			if (a[i][0] == 0 && a[i][1] == 1)
			{
				A++;
			}
			if (a[i][0] == 0 && a[i][1] == 2)
			{
				B++;
			}
			if (a[i][0] == 1 && a[i][1] == 0)
			{
				B++;
			}
			if (a[i][0] == 1 && a[i][1] == 2)
			{
				A++;
			}
			if (a[i][0] == 2 && a[i][1] == 0)
			{
				A++;
			}
			if (a[i][0] == 2 && a[i][1] == 1)
			{
				B++;
			}
		}
		if (A > B)
		{
			System.out.print("A");
		}
		else if (A < B)
		{
			System.out.print("B");
		}
		else if (A = B)
		{
			System.out.print("Tie");
		}

		return 0;
	}
}

