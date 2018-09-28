package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int n;
	 double ss;
	 double max;
	 double[][] spot = new double[100][2];
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
		  spot[i][0] = Double.parseDouble(tempVar2);
	  }
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  spot[i][1] = Double.parseDouble(tempVar3);
	  }
	 }
	 for (i = 0;i < n - 1;i++)
	 {
	 for (j = i + 1;j < n;j++)
	 {
	  ss = Math.sqrt((spot[i][0] - spot[j][0]) * (spot[i][0] - spot[j][0]) + (spot[i][1] - spot[j][1]) * (spot[i][1] - spot[j][1]));
	  if (max <= ss)
	  {
	  max = ss;
	  }
	 }
	 }
	 System.out.printf("%.4lf",max);
	}

}

