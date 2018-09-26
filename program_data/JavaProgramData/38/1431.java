package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int n;
		int i;
		int j;
	 String tempVar = ConsoleInput.scanfRead();
	 if (tempVar != null)
	 {
		 k = Integer.parseInt(tempVar);
	 }
	 for (i = 0;i < k;i++)
	 {
		 double[] num = new double[100];
	  String tempVar2 = ConsoleInput.scanfRead();
	  if (tempVar2 != null)
	  {
		  n = Integer.parseInt(tempVar2);
	  }
	  double sum = 0;
	  for (j = 0;j < n;j++)
	  {
		  String tempVar3 = ConsoleInput.scanfRead();
		  if (tempVar3 != null)
		  {
			  num[j] = Double.parseDouble(tempVar3);
		  }
		sum += num[j];
	  }
	  double ave;
	  ave = sum / n;
	  double psum = 0;
	  double d;
	  for (j = 0;j < n;j++)
	  {
		  psum += Math.pow((num[j] - ave),2);
	  }
	  d = Math.sqrt(psum / n);
	  System.out.printf("%.5f\n",d);
	 }


	}


}

