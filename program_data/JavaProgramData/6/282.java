package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k;
		  int sum;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  int a;
		  int b;

		  for (i = 0;i < n;i++)
		  {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  b = Integer.parseInt(tempVar3);
			  }
			  sum = 0;
			  int[][][] c = new int[100][100][100];
			  for (j = 0;j < a;j++)
			  {
				  for (k = 0;k < b;k++)
				  {
				  String tempVar4 = ConsoleInput.scanfRead();
				  if (tempVar4 != null)
				  {
					  c[i][j][k] = Integer.parseInt(tempVar4);
				  }
				  }

			  }
			  for (j = 0;j < a;j++)
			  {
			  sum += c[i][j][0] + c[i][j][b - 1];
			  }
			  for (k = 0;k < b;k++)
			  {
			  sum += c[i][0][k] + c[i][a - 1][k];
			  }
			  sum = sum - c[i][0][0] - c[i][0][b - 1] - c[i][a - 1][0] - c[i][a - 1][b - 1];
			  System.out.printf("%d\n",sum);
		  }
	}


}

