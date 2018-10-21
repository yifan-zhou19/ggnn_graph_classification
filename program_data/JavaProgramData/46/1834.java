package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	  int i;
	  int j;
	  int h;
	  int l;
	  int x;
	  int y;
	  int k;
	  int[][] a = new int[hang][lie];


	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  h = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  l = Integer.parseInt(tempVar2);
	  }

	  for (i = 0;i < h;i++)
	  {
		for (j = 0;j < l;j++)
		{
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  a[i][j] = Integer.parseInt(tempVar3);
			  }
		}
	  }

	  k = 0;
	  x = 0;
	  i = 0;
	  while (k < (h * l))
	  {

		  for (j = x;j < l;j++)
		  {
			 System.out.printf("%d\n",a[i][j]);
			 k++;
			 a[i][j] = -1;
			 y = j;
			 if (a[i][j + 1] == -1)
			 {
				 break;
			 }
		  }
		  if (k == (h * l))
		  {
			 break;
		  }


		 for (i = x + 1;i < h;i++)
		 {
			 System.out.printf("%d\n",a[i][y]);
			 k++;
			 a[i][y] = -1;
			 x = i;
			 if (a[i + 1][y] == -1)
			 {
				 break;
			 }
		 }
		  if (k == (h * l))
		  {
			 break;
		  }


		  for (j = y - 1;j >= 0;j--)
		  {
			 System.out.printf("%d\n",a[x][j]);
			 k++;
			 a[x][j] = -1;
			 y = j;
			 if (a[x][j - 1] == -1)
			 {
				 break;
			 }
		  }
		  if (k == (h * l))
		  {
			 break;
		  }


		  for (i = x - 1;i >= 0;i--)
		  {
			 System.out.printf("%d\n",a[i][y]);
			 k++;
			 a[i][y] = -1;
			 x = i;
			 if (a[i - 1][y] == -1)
			 {
				 break;
			 }
		  }
		  if (k == (h * l))
		  {
			 break;
		  }

	  }


	return 0;
	}


}

