package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[8][8];
		int m;
		int n;
		int i;
		int j;
		int max;
		int r = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
			max = 0;
		 for (j = 1;j < n;j++)
		 {
			 if (a[i][j] > a[i][max])
			 {
				 max = j;
			 }
		 }
		 for (j = 0;j < m;j++)
		 {
			 if (a[j][max] < a[i][max])
			 {
			 r = 0;
			 break;
			 }
		 }
		 if (r == 1)
		 {
			 System.out.printf("%d+%d\n",i,max);
			 break;
		 }
		}
		if (r == 0)
		{
			System.out.print("No");
		}
	}
}

