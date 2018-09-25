package <missing>;

public class GlobalMembers
{
	public static int ar(int n, int m)
	{
		int c;
		if (n < 5 && m < 5)
		{
			c = 1;
		}
		else
		{
			c = 0;
		}
		return (c);
	}
	public static void Main()
	{
		int a;
		int b;
		int t;
		int[][] A = new int[5][5];
		int i;
		int j;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					A[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b = Integer.parseInt(tempVar3);
		}
		if (ar(a, b) == 1)
		{
			for (j = 0;j < 5;j++)
			{
				t = A[a][j];
				A[a][j] = A[b][j];
				A[b][j] = t;
			}
			for (i = 0;i < 5;i++)
			{
			   for (j = 0;j < 5;j++)
			   {
				System.out.printf("%d",A[i][j]);
				if (j != 4)
				{
					System.out.print(" ");
				}
			   }
			   System.out.print("\n");
			}
		}
		else
		{
			System.out.print("error");
		}
	}
}

