package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int n;
		int m;
		int[][] yao = new int[8][8];
		int lie = 0;
		int han = 0;
		int iu = 0;
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
					yao[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				han = 0;
				lie = 0;
				for (k = 0;k < m;k++)
				{

				   if (yao[i][j] > yao[i][k])
				   {
					 han++;
				   }
				   else
				   {
					   han = han;
				   }

				}
				for (l = 0;l < n;l++)
				{
				  if (yao[i][j] < yao[l][j])
				  {
					  lie++;
				  }
				  else
				  {
					   lie = lie;
				  }
				}
				if (lie == (n - 1) && han == (m - 1))
				{
					System.out.printf("%d+%d",i,j);
				}
				else
				{
					iu++;
				}
			}
		}
		if (iu == n * m)
		{
			System.out.print("No\n");
		}
		return 0;
	}
}

