package <missing>;

public class GlobalMembers
{
	// b[j][k] * c[k][i] = a[j][i]
	public static void matrix(int[][] b, int[][] c, int[][] a, int nx, int ny, int nk)
	{
	int i;
	int j;
	int k;
	for (j = 0;j < ny;j++)
	{
		for (i = 0;i < nx;i++)
		{
			a[j][i] = null;
		}
	}
	for (j = 0;j < ny;j++)
	{
	for (i = 0;i < nx;i++)
	{
	for (k = 0;k < nk;k++)
	{
		a[j][i] += b[j][k] * c[k][i];
	}
	};
	};
	}


	public static int Main()
	{
	int i;
	int j;
	int k;
	int tmp;
	int b_row;
	int b_col;
	int c_row;
	int c_col;
	int a_row;
	int a_col;
	int[][] b;
	int[][] c;
	int[][] a;

	// ??B ? ?? ??

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		b_row = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		b_col = Integer.parseInt(tempVar2);
	}
	c_row = b_col;

	b = new int[b_row];
	for (j = 0;j < b_row;j++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	b[j] = (int) malloc((Integer.SIZE / Byte.SIZE) * b_col);
	}

	// ??B???

	for (j = 0;j < b_row;j++)
	{
	for (i = 0;i < b_col;i++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		tmp = Integer.parseInt(tempVar3);
	}
	b[j][i] = tmp;
	}
	}
	// ??C? ??

	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		c_row = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		c_col = Integer.parseInt(tempVar5);
	}
	a_row = b_row;
	a_col = c_col;
	c = new int[c_row];
	for (j = 0;j < c_row;j++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	c[j] = (int) malloc((Integer.SIZE / Byte.SIZE) * c_col);
	}
	// ??C???

	for (j = 0;j < c_row;j++)
	{
	for (i = 0;i < c_col;i++)
	{
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		tmp = Integer.parseInt(tempVar6);
	}
	c[j][i] = tmp;
	}
	}

	a = new int[a_row];
	for (j = 0;j < a_row;j++)
	{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	a[j] = (int) malloc((Integer.SIZE / Byte.SIZE) * a_col);
	}
	if (!c[c_row - 1])
	{
	System.out.print("no enought memory\n");
	System.exit(0);
	}



	matrix(b, c, a, a_col, a_row, b_col);

	for (j = 0;j < a_row;j++)
	{
	for (i = 0;i < a_col;i++)
	{
		  if (i != a_col - 1)
		  {
	  System.out.printf("%d ",a[j][i]);
		  }
		else
		{
		System.out.printf("%d",a[j][i]);
		}
	}
	System.out.print("\n");
	};


	}

}

