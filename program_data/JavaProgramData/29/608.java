package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int m;
	float[] a = new float[100];
	int[][] b = new int[100][100];
	int[][] c = new int[100][100];


	for (int d = 0;d < n;d++)
	{
		a[d] = 3.5000000F;
	}

	for (int i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	  for (int j = 0;j < m;j++)
	  {
		  if (j == 0)
		  {
			  b[i][j] = 2;
		  }
		  if (j == 1)
		  {
			  b[i][j] = 3;
		  }
		  if (j >= 2)
		  {
			  b[i][j] = b[i][j - 1] + b[i][j - 2];
		  }
		  if (m != 1 && j > 1)
		  {
			  a[i] += 1.0000 * b[i][j] / b[i][j - 1];
		  }
		  if (m == 1)
		  {
			  a[i] = 2.0000000F;
		  }

	  }

	}

	for (int o = 0;o < n;o++)
	{
	System.out.printf("%.3f\n",a[o]);

	}


	return 0;
	}
}

