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
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int y;
	   String tempVar = ConsoleInput.scanfRead();
	   if (tempVar != null)
	   {
		   m = Integer.parseInt(tempVar);
	   }
	   for (i = 1;i <= m;i++)
	   {
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   y = Integer.parseInt(tempVar2);
		   }
		x = 0;
		for (j = 0;j <= y - 1;j++)
		{
			x += cal(0, j, 2.0);
		}
		System.out.printf("%.3lf\n",x);
	   }


	}

}

