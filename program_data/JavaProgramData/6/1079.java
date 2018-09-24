package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int e;
		int f;
		int j;
		int h = 0;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			 String tempVar2 = ConsoleInput.scanfRead();
			 if (tempVar2 != null)
			 {
				 e = Integer.parseInt(tempVar2);
			 }
			 String tempVar3 = ConsoleInput.scanfRead(" ");
			 if (tempVar3 != null)
			 {
				 f = Integer.parseInt(tempVar3);
			 }
			 int[][] a = new int[100][100];
			 for (i = 0;i < e;i++)
			 {
			  for (j = 0;j < f;j++)
			  {
			   a[i][j] = 0;
			  }
			 }
			 for (i = 0;i < e;i++)
			 {
			   for (j = 0;j < f;j++)
			   {
			   String tempVar4 = ConsoleInput.scanfRead();
			   if (tempVar4 != null)
			   {
				   a[i][j] = Integer.parseInt(tempVar4);
			   }
			   }
			 }
			 for (i = 0;i < e;i++)
			 {
				  h = h + a[i][0] + a[i][f - 1];
			 }
			  for (j = 1;j < f - 1;j++)
			  {
				   h = h + a[0][j] + a[e-1][j];
			  }
			  System.out.printf("%d\n",h);
			  h = 0;
			  e = 0;
			  f = 0;

		}
	}

}

