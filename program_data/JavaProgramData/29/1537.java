package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 double[] a = new double[100];
	 double[][] b = new double[2][100];
	 double c;
	 a[0] = 1;
	 a[1] = 2;
	int n;
	int i;
	int j;
	int m;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (i = 0;i < n;i++)
	 {
	  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (j = 2;j <= m;j++)
	  {
	   a[j] = a[j - 1] + a[j - 2];
	  }

	  b[0][0] = 2;
	  b[1][0] = 1;
	 for (j = 1;j < m;j++)
	 {
		  b[0][j] = b[0][j - 1] * a[j] + a[j + 1] * b[1][j - 1];
	   b[1][j] = b[1][j - 1] * a[j];
	 }
	 c = b[0][m - 1] / b[1][m - 1];
	 System.out.printf("%.3f",c);
	 System.out.print("\n");
	 }
	 System.in.read();
	 System.in.read();
	 System.in.read();
	 System.in.read();
	return 0;
	}

}

