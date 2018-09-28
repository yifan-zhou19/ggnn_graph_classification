package <missing>;

public class GlobalMembers
{
	public static final int MAXNUM = 100;
	public static int Main()
	{
	 double[] data = new double[MAXNUM];
	 double sum;
	 double ans;
	 int casenum;
	 int n;
	 casenum = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (int i = 0;i < casenum;i++)
	 {
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  sum = 0;
	  ans = 0;
	  for (int j = 0;j < n;j++)
	  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  data[j] = Double.parseDouble(tempVar);
		  }
		  sum += data[j];
	  }

	  for (int k = 0;k < n;k++)
	  {
		  ans += (sum - n * data[k]) * (sum - n * data[k]);
	  }
	  ans = (double)Math.sqrt((double)ans / Math.pow(n,3));
	  System.out.printf("%.5lf\n",ans);
	 }
	 return 0;
	}

}

