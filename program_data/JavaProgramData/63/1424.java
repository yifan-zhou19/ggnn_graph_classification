package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int x1;
	int y1;
	int x2;
	int y2;
	int i;
	int j;
	int k;
	int[][] a = new int[100][100];
	int[][] b = new int[100][100];
	int[][] c = new int[100][100];
	//////////////////////////////////////////
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x1 = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		y1 = Integer.parseInt(tempVar2);
	}
	for (i = 0;i <= (x1 - 1);i++)
	{
			 for (j = 0;j <= (y1 - 1);j++)
			 {
			   String tempVar3 = ConsoleInput.scanfRead();
			   if (tempVar3 != null)
			   {
				   a[i][j] = Integer.parseInt(tempVar3);
			   }
			 }
	}
	//////////////////////////////////////////
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		x2 = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		y2 = Integer.parseInt(tempVar5);
	}
	for (i = 0;i <= (x2 - 1);i++)
	{
			 for (j = 0;j <= (y2 - 1);j++)
			 {
			   String tempVar6 = ConsoleInput.scanfRead();
			   if (tempVar6 != null)
			   {
				   b[i][j] = Integer.parseInt(tempVar6);
			   }
			 }
	}
	for (i = 0;i <= (x1 - 1);i++)
	{
							for (j = 0;j <= (y2 - 1);j++)
							{
							c[i][j] = 0;
							}
	}
							/*&#190;&#216;&#213;�3&#203;��?&#196;&#188;&#198;&#203;&#227;�&#189;��: 
	&#182;&#212;��&#190;&#216;&#213;�A[m][q]*B[q][n], 
	&#207;�3&#203;?&#196;&#189;�1&#251;&#206;a&#190;&#216;&#213;�C[m][n]&#199;�&#182;&#212;��&#190;&#216;&#213;�C&#214;D&#195;&#191;�&#187;&#207;&#238;&#182;&#188;�D 
	C[i][j] = A[i][0]*B[0][j] + A[i][1]*B[1][j] + ..... + A[i][q]*B[q][j] 
	*/  
	for (i = 0;i <= (x1 - 1);i++)
	{
		for (j = 0;j <= (y2 - 1);j++)
		{
								for (k = 0;k <= (x2 - 1);k++)
								{
								c[i][j] = c[i][j] + a[i][k] * b[k][j];
								}
		}
	}
	for (i = 0;i <= (x1 - 1);i++)
	{
							for (j = 0;j <= (y2 - 1);j++)
							{
							if (j < (y2 - 1))
							{
							System.out.printf("%d ",c[i][j]);
							}
							else
							{
								System.out.printf("%d\n",c[i][j]);
							}
							}
	}


	}

}

