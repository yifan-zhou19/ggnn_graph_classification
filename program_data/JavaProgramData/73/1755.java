package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k;
		int r;
		int[] c = new int[5];
		int m;
		int temp = 0;
		int d = 0;
		int count = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][j] = Integer.parseInt(tempVar);
			}
			}
		}
		for (j = 0;j < 5;j++)
		{
			m = a[j][0];
			c[d] = 0;
			for (i = 1;i < 5;i++)
			{
				if (a[j][i] > m)
				{
							 m = a[j][i];
							 c[d] = i;
				}

			} //printf ("%d %d\n",j,c[d]);
			d++;
		}
			for (i = 0;i < 5;i++)
			{
				 for (k = 0;k < 5;k++)
				 {
				 if (a[k][c[i]] < a[i][c[i]])
				 {
				 temp = 1;
				 //printf ("%d %d\n",k,c[i]);
				 break;
				 }
				 }
				 if (temp == 0)
				 {
				 System.out.printf("%d %d %d\n",i + 1,c[i] + 1,a[i][c[i]]);
			 count = 1;
				 }
				 temp = 0;
			}
			 if (count == 0)
			 {
			 System.out.print("not found");
			 }

			return 0;
	}

}

