//====================================================================================================
//The Free Edition of C++ to Java Converter limits conversion output to 100 lines per snippet.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================

package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int j;
		int q;
		int k;
		int i;
		int n;
		int m;
		int row;
		int col;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}

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


		if (row >= col)
		{
			if (col % 2 == 0)
			{
		  k = col / 2;
		  for (q = 1;q <= k;q++)
		  {

	i = 0;
	for (j = 0;j < col - 1;j++)
	{
	System.out.printf("%d\n",a[i][j]);
	}

	j = col - 1;
	for (i = 0;i < row - 1;i++)
	{
	System.out.printf("%d\n",a[i][j]);
	}

	i = row - 1;
	for (j = col - 1;j > 0;j--)
	{
	System.out.printf("%d\n",a[i][j]);
	}

	j = 0;
	for (i = row - 1;i > 0;i--)
	{
	System.out.printf("%d\n",a[i][j]);
	}


		  for (i = 1,n = 0;i < row - 1;i++,n++)
		  {
			for (j = 1,m = 0;j < col - 1;j++,m++)
			{
			 b[n][m] = a[i][j];
			}
		  }
			 for (i = 0;i < row;i++)
			 {
			for (j = 0;j < col;j++)
			{
			a[i][j] = b[i][j];
			}
			 }

	col = col - 2;
	row = row - 2;
		  }
			}

			else
			{

			k = col / 2;
			for (q = 1;q <= k;q++)
			{

	i = 0;
	for (j = 0;j < col - 1;j++)
	{
	System.out.printf("%d\n",a[i][j]);
	}

	j = col - 1;
	for (i = 0;i < row - 1;i++)
	{
	System.out.printf("%d\n",a[i][j]);
	}

	i = row - 1;
	for (j = col - 1;j > 0;j--)
	{
	System.out.printf("%d\n",a[i][j]);
	}

	j = 0;
	for (i = row - 1;i > 0;i--)
	{
	System.out.printf("%d\n",a[i][j]);
	}


		  for (i = 1,n = 0;i < row - 1;i++,n++)
		  {
			for (j = 1,m = 0;j < col - 1;j++,m++)
			{
			 b[n][m] = a[i][j];
			}
		  }
			 for (i = 0;i < row;i++)
			 {
			for (j = 0;j < col;j++)
			{
			a[i][j] = b[i][j];
			}
			 }

	col = col - 2;
	row = row - 2;
			}
			for (i = 0;i < row;i++)
			{
			   System.out.printf("%d\n",a[i][0]);
			}
			}
		}


		else
	{
			if (row % 2 == 0)
			{
		  k = row / 2;
		  for (q = 1;q <= k;q++)
		  {

	i = 0;
	for (j = 0;j < col - 1;j++)
	{
	System.out.printf("%d\n",a[i][j]);
	}

	j = col - 1;
	for (i = 0;i < row - 1;i++)
	{
	System.out.printf("%d\n",a[i][j]);
	}

	i = row - 1;
	for (j = col - 1;j > 0;j--)
	{
	System.out.printf("%d\n",a[i][j]);
	}

	j = 0;
	for (i = row - 1;i > 0;i--)
	{
	System.out.printf("%d\n",a[i][j]);
	}


		  for (i = 1,n = 0;i < row - 1;i++,n++)
		  {
			for (j = 1,m = 0;j < col - 1;j++,m++)
			{
			 b[n][m] = a[i][j];
			}
		  }
			 for (i = 0;i < row;i++)
			 {
			for (j = 0;j < col;j++)
			{
			a[i][j] = b[i][j];
			}
			 }

	col = col - 2;
	row = row - 2;
		  }
			}

			else
			{

			k = row / 2;
			for (q = 1;q <= k;q++)
			{


//====================================================================================================
//End of the allowed output for the Free Edition of C++ to Java Converter.

//To purchase the Premium Edition, visit our website:
//https://www.tangiblesoftwaresolutions.com/order/order-cplus-to-java.html
//====================================================================================================


