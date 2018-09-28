package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int row;
		  int col;
		  int i;
		  int j;
		  int k;
		  int s;
		  int p;
		  int q;
		  int[][] a = new int[100][100];
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  row = Integer.parseInt(tempVar);
		  }
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  col = Integer.parseInt(tempVar2);
		  }
		  int temp_r;
		  int temp_c;
		  for (p = 0;p < row;p++)
		  {
			  for (q = 0;q < col;q++)
			  {
				  String tempVar3 = ConsoleInput.scanfRead();
				  if (tempVar3 != null)
				  {
					  a[p][q] = Integer.parseInt(tempVar3);
				  }
			  }
		  }
		  for (i = 0;i < col;i++)
		  {
			  temp_r = 0;
			  temp_c = i;
			  while (temp_r >= 0 && temp_r < row && temp_c >= 0 && temp_c < col)
			  {
				  System.out.printf("%d\n",a[temp_r][temp_c]);
				  temp_r++;
				  temp_c--;
			  }
		  }
		  for (j = 1;j < row;j++)
		  {
			  temp_r = j;
			  temp_c = col - 1;
			  while (temp_r >= 0 && temp_r < row && temp_c >= 0 && temp_c < col)
			  {
				  System.out.printf("%d\n",a[temp_r][temp_c]);
				  temp_r++;
				  temp_c--;
			  }
		  }
		  System.in.read();
		  System.in.read();

	}

}

