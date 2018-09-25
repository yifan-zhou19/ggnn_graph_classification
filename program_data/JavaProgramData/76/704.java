package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] A = new int[50000][2];
		int a;
		int b;
		int c = 0;
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
				A[i][0] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				A[i][1] = Integer.parseInt(tempVar3);
			}
		}
		a = A[0][0];
		b = A[0][1];
		for (i = 0;i < n;i++)
		{
			for (j = 1;j < n;j++)
			{
				if (!(a > A[j][1] || b < A[j][0]))
				{
					if (a > A[j][0])
					{
						a = A[j][0];
					}
					if (b < A[j][1])
					{
						b = A[j][1];
					}
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a > A[i][1] || b < A[i][0])
			{
				c++;
			}
		}
		if (c != 0)
		{
			System.out.print("no");
		}
		else
		{
			System.out.printf("%d %d",a,b);
		}
		return 0;
	}

}

