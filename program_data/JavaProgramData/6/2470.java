package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p[400],m,n,a,i,j,k,l,sum,counter,b,matrix[100][100];
		int[] p = new int[400];
		int m;
		int n;
		int a;
		int i;
		int j;
		int k;
		int l;
		int sum;
		int counter;
		int b;
		int[][] matrix = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		for (k = 0;k < a;k++)
		{
						sum = 0;
						counter = 0;
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							m = Integer.parseInt(tempVar2);
						}
						String tempVar3 = ConsoleInput.scanfRead(" ");
						if (tempVar3 != null)
						{
							n = Integer.parseInt(tempVar3);
						}
						for (i = 0;i < m;i++)
						{
										for (j = 0;j < n;j++)
										{
														String tempVar4 = ConsoleInput.scanfRead();
														if (tempVar4 != null)
														{
															matrix[i][j] = Integer.parseInt(tempVar4);
														}
														if (i == 0 || i == m - 1 || j == 0 || j == n - 1)
														{
																  p[counter] = matrix[i][j];
																  counter++;
														}
										}
						}
						for (l = 0;l < counter;l++)
						{
											  sum += p[l];
						}
						System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

