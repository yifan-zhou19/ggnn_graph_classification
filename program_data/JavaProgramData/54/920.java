package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int c;
		int t;
		int A;
	double s;
	double num = new double(int n,int t,int b,int a);

	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  String tempVar2 = ConsoleInput.scanfRead(" ");
	  if (tempVar2 != null)
	  {
		  k = Integer.parseInt(tempVar2);
	  }
	  t = n;
	  for (A = t - 1;;A = A + t - 1)
	  {

		 s = num(n, t, k, A);
		if (s - (int)s < 0.000000001)
		{
			break;
		}


	  }

	  System.out.printf("%ld\n",(int)s);
	  return 0;
	}



	public static double num(int n,int t,int b,int a)
	{
		double S;
		int j;

		 t = (float)t;
		if (n > 1)
		{
			S = (double)num(n - 1, t, b, a) * (float)t / (float)(t - 1) + (float)b;
		}
		if (n == 1)
		{
			S = (double)a * (float)t / (float)(t - 1) + (float)b;
		}

	  return S;
	}
}

