package <missing>;

public class GlobalMembers
{
	public static int Main()

	{

	  int row;
	  int col;
	  int i;
	  int j;
	  int t;
	  int max;
	  int min;
	  int l = 0;
	  int k;

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  row = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(",");
	  if (tempVar2 != null)
	  {
		  col = Integer.parseInt(tempVar2);
	  }

	  int[][] a = new int[row][col];

	  for (i = 0;i < row;i++)

	  {

	   for (j = 0;j < col;j++)

	   {

	 String tempVar3 = ConsoleInput.scanfRead();
	 if (tempVar3 != null)
	 {
		 a[i][j] = Integer.parseInt(tempVar3);
	 }

	   }

	  }

	   for (i = 0;i < row;i++)

	   {

	   max = a[i][0];

	   k = 0;

	   for (j = 1;j < col;j++)

	   {

		if (a[i][j] > max)

		{

		  max = a[i][j];

		  k = j;

		}

	   }

	   min = a[0][k];

	   for (t = 1;t < row;t++)

	   {

	   if (a[t][k] < min)

	   {

		 min = a[t][k];

	   }

	   }

	   if (max == min)

	   {

		System.out.printf("%d+%d",i,k);

		l++;

	   }

	   }

	  if (l == 0)
	  {

	  System.out.print("No");
	  }

	  return 0;

	}



}

