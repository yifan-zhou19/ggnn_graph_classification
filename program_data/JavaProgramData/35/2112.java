package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[8][8];
		int i;
		int t;
		int k;
		int tempx;
		int tempy;
		int temp = 0;
		int[][] b = new int[1][2];
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
		   for (t = 0;t < n;t++)
		   {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   a[i][t] = Integer.parseInt(tempVar3);
			   }
		   }
		}
	for (k = 0;k < m;k++)
	{
		b[0][0] = a[k][0],tempx = 0;
		for (i = 0;i < n;i++)
		{

			if (a[k][i] > b[0][0])
			{
				b[0][0] = a[k][i];
				tempx = i;
			}
		}
		b[0][1] = a[k][tempx],tempy = 0;
		for (i = 0;i < m;i++)
		{

			if (a[i][tempx] < b[0][1])
			{
				b[0][1] = a[i][tempx];
			tempy = i;
			}
		}
			if (b[0][0] == b[0][1])
			{
				System.out.printf("%d+%d",tempy,tempx);
			}
			else
			{
				temp += 1;
			}
	}

		if (temp == m)
		{
			System.out.print("No");
		}




		return 0;
	}
}

