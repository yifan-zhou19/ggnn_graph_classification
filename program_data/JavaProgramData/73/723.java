package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] a = new int[5][5];
		  int[][] b = new int[5][5];
		  int i;
		  int j;
		  int k;
		  int js;
		  for (i = 0;i < 5;i++)
		  {
			  String tempVar = ConsoleInput.scanfRead();
			  if (tempVar != null)
			  {
				  a[i][0] = Integer.parseInt(tempVar);
			  }
			  String tempVar2 = ConsoleInput.scanfRead(" ");
			  if (tempVar2 != null)
			  {
				  a[i][1] = Integer.parseInt(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  a[i][2] = Integer.parseInt(tempVar3);
			  }
			  String tempVar4 = ConsoleInput.scanfRead(" ");
			  if (tempVar4 != null)
			  {
				  a[i][3] = Integer.parseInt(tempVar4);
			  }
			  String tempVar5 = ConsoleInput.scanfRead(" ");
			  if (tempVar5 != null)
			  {
				  a[i][4] = Integer.parseInt(tempVar5);
			  }
		  }
		  for (i = 0;i < 5;i++)
		  {
			  for (j = 0;j < 5;j++)
			  {
				  b[i][j] = 1;
			  }
		  }
		  js = 0;
		  for (i = 0;i < 5;i++)
		  {
			  for (j = 0;j < 5;j++)
			  {
				  for (k = 0;k < 5;k++)
				  {
					  if (a[i][j] > a[k][j])
					  {
						  b[i][j] = 0;
					  }
				  }
				  for (k = 0;k < 5;k++)
				  {
					  if (a[i][j] < a[i][k])
					  {
						  b[i][j] = 0;
					  }
				  }
				  if (b[i][j] == 1)
				  {
					   System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
					   js = 1;
				  }
			  }
		  }
		  if (js == 0)
		  {
			 System.out.print("not found");
		  }
		  System.in.read();
		  System.in.read();
		  System.in.read();
	}

}

