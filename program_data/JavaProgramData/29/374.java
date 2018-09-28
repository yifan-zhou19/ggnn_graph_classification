package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		double sum = 3.500;
		int[] a = new int[1000];
		int[] b = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  m = Integer.parseInt(tempVar2);
		  }
		  if (m == 1)
		  {
			System.out.print("2.000");
			System.out.print("\n");
		  }
		  else if (m == 2)
		  {
			System.out.print("3.500");
			System.out.print("\n");
		  }
		  else
		  {
			 if (m >= 3)
			 {
			 a[1] = 1;
			 a[2] = 2;
			 b[1] = 2;
			 b[2] = 3;
			 for (j = 0;j < m - 2;j++)
			 {
			  a[3 + j] = a[1] + a[2];
			  b[3 + j] = b[1] + b[2];
			  sum = sum + (double)b[3 + j] / a[3 + j];
			  a[1] = a[2 + j];
			  a[2] = a[3 + j];
			  b[1] = b[2 + j];
			  b[2] = b[3 + j];
			 }
			 System.out.printf("%.3lf\n",sum);
			 }
		  }
		   sum = 3.500;
		}
		return 0;
	}

}

