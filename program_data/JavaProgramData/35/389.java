package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int t;
		int s;
		int max = 0;
		int k;
		int r = 0;
		int[][] a = new int[8][8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		t = 0;
		for (i = 0;i < n;i++)
		{
			r = 0;
			max = a[i][0];
			for (j = 0;j < m;j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					r = j;
				}
			}
			s = 0;
			for (k = 0;k < n;k++)
			{
			 if (a[k][r] < max)
			 {
					s++;
			 }
			}
			if (s == 0)
			{
					System.out.printf("%d+%d\n",i,r);
					t++;
					break;
			}
		}
		if (t == 0)
		{
			System.out.print("No");
		}


	}

}

