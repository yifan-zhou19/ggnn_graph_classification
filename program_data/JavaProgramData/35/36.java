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
		int k;
		int p;
		int t = 0;
		int s = 0;
		int r = 0;

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
			for (j = 0;j < n;j++)
			{
				s = 0;
				t = 0;
				for (k = 0;k < n;k++)
				{
				  if (a[i][j] < a[i][k])
				  {
				  t = 1;
				  }
				}
				for (p = 0;p < m;p++)
				{
					if (a[i][j] > a[p][j])
					{
					s = 1;
					}
				}
				if ((t == 0) && (s == 0))
				{
					System.out.printf("%d+%d",i,j);
					r = 1;
					break;
				}

			}
			if (r == 1)
			{
				break;
			}
		 }
		 if (r == 0)
		 {
			 System.out.print("No");
		 }
	}


}

