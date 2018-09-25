package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] base = new int[5][5];
		  int[] tem = new int[5];
		  int i;
		  int j;
		  int a;
		  int b;
		  for (i = 0;i < 5;i++)
		  {
			  for (j = 0;j < 5;j++)
			  {
				  String tempVar = ConsoleInput.scanfRead();
				  if (tempVar != null)
				  {
					  base[i][j] = Integer.parseInt(tempVar);
				  }
			  }
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a = Integer.parseInt(tempVar2);
		  }
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  b = Integer.parseInt(tempVar3);
		  }
		  if (a < 0 || a>4 || b < 0 || b>4)
		  {
			  System.out.print("error");
		  }
		  else
		  {
			  for (i = 0;i < 5;i++)
			  {
				  tem[i] = base[a][i];
			  }
			  for (i = 0;i < 5;i++)
			  {
				  base[a][i] = base[b][i];
			  }
			  for (i = 0;i < 5;i++)
			  {
				  base[b][i] = tem[i];
			  }

			  for (i = 0;i < 5;i++)
			  {
				  for (j = 0;j < 4;j++)
				  {
					  System.out.printf("%d ",base[i][j]);
				  }
				  System.out.printf("%d\n",base[i][4]);
			  }
		  }
	}

}

