package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 int n;
	 int[] num = new int[100];
	 int i;
	 int j;
	 double[][] data = new double[100][30];
	 double[] fang = new double[100];
	 double[] aver = new double[100];
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
		  num[i] = Integer.parseInt(tempVar2);
	  }
	  for (j = 0;j < num[i];j++)
	  {
	  String tempVar3 = ConsoleInput.scanfRead();
	  if (tempVar3 != null)
	  {
		  data[i][j] = Double.parseDouble(tempVar3);
	  }
	  }
	 }
	 for (i = 0;i < n;i++)
	 {
	  aver[i] = 0;
	  fang[i] = 0;
	  for (j = 0;j < num[i];j++)
	  {
	   aver[i] = (double)(aver[i] + (double)(data[i][j] / num[i]));
	  }
	  for (j = 0;j < num[i];j++)
	  {
	   fang[i] = fang[i] + (double)((data[i][j] - aver[i]) * (data[i][j] - aver[i]));
	  }
	   fang[i] = (double)(fang[i] / num[i]);
	   fang[i] = Math.sqrt(fang[i]);
	  System.out.printf("%.5lf\n",fang[i]);
	 }
	}
}

