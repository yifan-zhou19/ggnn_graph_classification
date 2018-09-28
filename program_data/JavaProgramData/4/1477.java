package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int k;
		int[][] yao = new int[300][300];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
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
	  for (i = n;i < 300;i++)
	  {
			for (j = 0;j < 300;j++)
			{
			   yao[i][j] = 00;
			}
	  }

		for (k = 0;k <= n + m - 2;k++)
		{



			  for (i = 0;i <= k;i++)
			  {
				 if (yao[i][k - i] != 00)
				 {
				   System.out.printf("%d\n",yao[i][k - i]);
				 }
			  }





		}
		return 0;
	}
}

