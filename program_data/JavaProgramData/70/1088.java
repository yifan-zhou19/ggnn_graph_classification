package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int n;
		 double[][] a = new double[100][2];
		 double k = 0;
		 double p;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 n = Integer.parseInt(tempVar);
		 }
		 for (int i = 0;i < n;i++)
		 {
			  String tempVar2 = ConsoleInput.scanfRead();
			  if (tempVar2 != null)
			  {
				  a[i] = Double.parseDouble(tempVar2);
			  }
			  String tempVar3 = ConsoleInput.scanfRead(" ");
			  if (tempVar3 != null)
			  {
				  a[i] + 1 = Double.parseDouble(tempVar3);
			  }
		 }
		 for (int i = 1;i < n;i++)
		 {
			  for (int j = 0;j < i;j++)
			  {
				  p = Math.sqrt((a[i][0] - a[j][0]) * (a[i][0] - a[j][0]) + (a[i][1] - a[j][1]) * (a[i][1] - a[j][1]));
				  if (p > k)
				  {
					  k = p;
				  }
			  }
		 }
		 System.out.printf("%.4lf",k);
	}

}

