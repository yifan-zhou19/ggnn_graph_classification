package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] A = new int[8][8];
		int i;
		int j;
		int a;
		int b;
		int[] Line = new int[8];
		int[] Row = new int[8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < a;i++)
		{
			int t = 0;
			for (j = 0;j < b;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					A[i][j] = Integer.parseInt(tempVar3);
				}
				if (A[i][j] > t)
				{
					Line[i] = j; //Line[i]???i???????j?
					t = A[i][j];

				}
			}
		}
		for (i = 0;i < b;i++)
		{
		   int t = 100;
		  for (j = 0;j < a;j++)
		  {
			  if (A[j][i] < t)
			  {
				  Row[i] = j; //Row[i]???i???????j?
				  t = A[j][i];
			  }
		  }
		}
		int f = 0;
		for (i = 0;i < a;i++)
		{
			int t;
			t = Line[i];
			if (Row[t] == i)
			{
				f++;
				System.out.printf("%d+%d",i,Line[i]);
			}
		}
		if (f == 0)
		{
			System.out.print("No");
		}
		return 0;
	}


}

