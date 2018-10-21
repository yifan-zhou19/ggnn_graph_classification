package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int[][] a = new int[8][8];
		int i;
		int j;
		int[] h = new int[8];
		int[] l = new int[8];
		int k = 0;
		int c = 0;
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
			c = a[i][0];
			h[i] = 0;
			for (j = 0;j < n;j++)
			{
			   if (c < a[i][j])
			   {
				   h[i] = j;
				   c = a[i][j];
			   }


			}
		}


		for (i = 0;i < n;i++)
		{
			c = a[0][i];
			l[i] = 0;
			for (j = 0;j < m;j++)
			{
				 if (c > a[j][i])
				 {
					 l[i] = j;
					 c = a[j][i];
				 }

			}
			if (h[l[i]] == i)
			{
					 System.out.printf("%d+%d\n",l[i],h[l[i]]);
				 k = k + 1;
			}
		}
		if (k == 0)
		{
		System.out.print("No");
		}
	}
}

