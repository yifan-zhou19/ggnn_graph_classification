package <missing>;

public class GlobalMembers
{
	public static double cal(int i,int n,double x)
	{
		double s;
	  if (i == n)
	  {
		  return x;
	  }
	  else
	  {
		  s = 1 + 1 / cal(i + 1, n, x);
		  return s;
	  } //1+1/cal(i+1,n,x);
	}
	public static int Main()
	{
		double x;
		int m;
		int n;
		int y;
		int i;
		int j;
		int k;

		int[] a = new int[10004];
		for (i = 2;i <= 5000;i++)

		{
			if (a[i] == 0)
			{
				for (j = 2;j * i <= 10000;j++)
				{
					a[j * i] = 1;
				}
			}

		}



	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   y = m / 2;
	   for (i = 3;i <= y;i += 2)
	   {
	   if (!(a[i]) && (a[m - i] == 0))
	   {
		   System.out.printf("%d %d\n",i,m - i);
	   }
	   }



	}

}

