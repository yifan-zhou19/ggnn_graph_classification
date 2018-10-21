package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sum = new int[100];
		int[] eff = new int[100];
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sum[0] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			eff[0] = Integer.parseInt(tempVar3);
		}
		double result;
		result = (double)eff[0] / sum[0];
		double[] a = new double[100];
		for (int i = 1;i < n;i++)
		{
		 String tempVar4 = ConsoleInput.scanfRead();
		 if (tempVar4 != null)
		 {
			 sum[i] = Integer.parseInt(tempVar4);
		 }
		 String tempVar5 = ConsoleInput.scanfRead();
		 if (tempVar5 != null)
		 {
			 eff[i] = Integer.parseInt(tempVar5);
		 }
		 a[i] = (double)eff[i] / sum[i];
		 if (a[i] > result)
		 {
		   if ((a[i] - result) > 0.05)
		   {
		   System.out.print("better\n");
		   }
		   else if ((a[i] - result) <= 0.05)
		   {
		   System.out.print("same\n");
		   }
		 }
		 else if (a[i] < result)
		 {
		  if ((result - a[i]) > 0.05)
		  {
		   System.out.print("worse\n");
		  }
		  else if ((result - a[i]) <= 0.05)
		  {
		   System.out.print("same\n");
		  }
		 }
		 else if (a[i] == result)
		 {
		   System.out.print("same\n");
		 }
		}
	return 0;
	}



}

