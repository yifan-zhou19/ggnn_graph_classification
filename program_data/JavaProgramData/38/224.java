package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		while (k-- != 0)
		{
			int n;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			double[] a = new double[200];
		  int i;
		  for (i = 0;i < n;i++)
		  {
			  String tempVar3 = ConsoleInput.scanfRead();
			  if (tempVar3 != null)
			  {
				  a[i] = Double.parseDouble(tempVar3);
			  }
		  }
		  double sum = 0;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		  double * p;
		  for (p = a;p < a + n;p++)
		  {
			  sum += *p;
		  }
		  double ave;
		  ave = sum / n;

		  double result = 0;
		  for (p = a;p < a + n;p++)
		  {
			  result += (*p - ave) * (*p - ave);
		  }
		  result = Math.sqrt(result / n);


		  System.out.printf("%.5lf\n",result);
		}
		return 0;
	}
}

