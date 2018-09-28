package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 double[][] a = new double[50][2];
	 double dis;
	 double temp;
	 int i;
	 int j;
	 int n;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 n = Integer.parseInt(tempVar);
	 }
	 for (i = 1;i <= n;i++)
	 {
		 String tempVar2 = ConsoleInput.scanfRead();
		 if (tempVar2 != null)
		 {
			 a[i][1] = Double.parseDouble(tempVar2);
		 }
		 String tempVar3 = ConsoleInput.scanfRead(" ");
		 if (tempVar3 != null)
		 {
			 a[i][2] = Double.parseDouble(tempVar3);
		 }
	 }
	 dis = 0;
	 for (i = 1;i < n;i++)
	 {
	  for (j = i + 1;j <= n;j++)
	  {
	   temp = Math.sqrt(Math.pow(a[i][1] - a[j][1],2) + Math.pow(a[i][2] - a[j][2],2));
	   if (temp > dis)
	   {
		   dis = temp;
	   }
	  }
	 }
	 System.out.printf("%.4f\n",dis);
	 return 0;
	}
}

