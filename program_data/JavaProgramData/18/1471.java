package <missing>;

public class GlobalMembers
{
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int f_s = 0;
	public static int f(int[][] a, int n)
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int s=0;
		int i;
		int j;
		double m1;
		double m2;
//C++ TO JAVA CONVERTER TODO TASK: Java does not have an equivalent to pointers to value types:
//ORIGINAL LINE: int *p;
		int p;

		if (n == 1)
		{
			System.out.printf("%d\n",f_s);
			f_s = 0;
		}

		if (n > 1)
		{
		for (i = 0;i < n;i++)
		{
			p = a[i];
		m1 = 100000;
		for (j = 0;j < n;j++)
		{
		if (p[j] <= m1)
		{
			m1 = p[j];
		}
		}
		for (j = 0;j < n;j++)
		{
		p[j] = p[j] - m1;
		}
		}

		for (j = 0;j < n;j++)
		{
			m2 = 100000;
		for (i = 0;i < n;i++)
		{
		if (a[i][j] <= m2)
		{
			m2 = a[i][j];
		}
		}
		for (i = 0;i < n;i++)
		{
		a[i][j] -= m2;
		}
		}

		f_s += a[1][1];

		for (i = 1;i < n - 1;i++)
		{
			for (j = 0;j < n;j++)
			{
		a[i][j] = a[i + 1][j];
			}
		}
		for (j = 1;j < n - 1;j++)
		{
			for (i = 0;i < n - 1;i++)
			{
		a[i][j] = a[i][j + 1];
			}
		}

		f(a, n - 1);
		}
	}

	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k;
		  int[][] a = new int[100][100];

		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  n = Integer.parseInt(tempVar);
		  }
		  for (i = 1;i <= n;i++)
		  {
		  for (j = 0;j < n;j++)
		  {
			  for (k = 0;k < n;k++)
			  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  a[j][k] = Integer.parseInt(tempVar2);
		  }
			  }
		  }
		  f(a, n);
		  }

	}





}

