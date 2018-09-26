package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int[][] a = new int[8][8];
		int[] b = new int[8];
		int[] d = new int[8];
		char c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		for (i = 0 ; i < n ; i++)
		{
			for (j = 0 ; j < m ; j++)
			{
			 String tempVar4 = ConsoleInput.scanfRead();
			 if (tempVar4 != null)
			 {
				 a[i][j] = Integer.parseInt(tempVar4);
			 }
		   if (a[i][j] > a[i][b [i]])
		   {
			   b [i] = j;
		   }
		   if (a[i][j] < a[b [j]][j])
		   {
			   d[j] = i;
		   }
			}
		}
		 j = 1;
		for (i = 0 ; i < n ; i++)
		{
			if (d [b[i]] == i)
			{
			System.out.printf("%d+%d", i, b[i]);
			j = 0;
			}
		}
		if (j != 0)
		{
			System.out.print("No");
		}

		return 0;
	}

}

