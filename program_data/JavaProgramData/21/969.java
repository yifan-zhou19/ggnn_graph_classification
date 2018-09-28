package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void pai(double a[],int n,double c[]);
	  double[] a = new double[100];
	  double sum = 0;
	  double ave = 0;
	  double[] b = new double[100];
	  int i = 0;
	  int n = 0;
	  int[] c = new int[100];
	  int k = 1;
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
			  a[i] = Double.parseDouble(tempVar2);
		  }
		sum = sum + a[i];

	  }
			ave = sum / n;
		for (i = 0;i < n;i++)
		{
			b[i] = Math.abs(a[i] - ave);


		}
		pai(b, n, a);
		for (i = 0;i < n;i++)
		{
			if (b[i] == b[i + 1])
			{
		   k = k + 1;
			}
		   else
		   {
			   break;
		   }
		}
		pai(a, k, b);
		for (i = k - 1;i >= 0;i--)
		{
			System.out.printf("%d",(int)a[i]);
		  if (i > 0)
		  {
		   System.out.print(",");
		  }
		}
			return (0);
	}
	public static void pai(double[] a, int n, double[] c)
	{
		double t = 0;
	  int i = 0;
	  int t1 = 0;
	  int j = 0;
	  for (i = 0;i < n;i++)
	  {
		   for (j = 0;j < n - i - 1;j++)
		   {
			  if (a[j] < a[j + 1])
			  {
				 t = a[j];
			   a[j] = a[j + 1];
			   a[j + 1] = t;
			   t = c[j];
			   c[j] = c[j + 1];
			   c[j + 1] = t;
			  }
		   }
	  }
	}
}

