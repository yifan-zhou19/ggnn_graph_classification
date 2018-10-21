package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[] a = new double[MAX];
		double[] b = new double[MAX];
		double sum = 0;
		double num = 0;
		double[] c = new double[MAX];
		double GPA;
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Double.parseDouble(tempVar2);
		}
		}
		for (i = 0;i < n;i++)
		{
		 String tempVar3 = ConsoleInput.scanfRead();
		 if (tempVar3 != null)
		 {
			 b[i] = Double.parseDouble(tempVar3);
		 }
		}
		for (i = 0;i < n;i++)
		{
		   if (b[i] < 60)
		   {
			   c[i] = 0;
		   }
		   else if (b[i] <= 63)
		   {
			   c[i] = 1.0;
		   }
		   else if (b[i] <= 67)
		   {
			   c[i] = 1.5;
		   }
		   else if (b[i] <= 71)
		   {
			   c[i] = 2.0;
		   }
		   else if (b[i] <= 74)
		   {
			   c[i] = 2.3f;
		   }
		   else if (b[i] <= 77)
		   {
			   c[i] = 2.7f;
		   }
		   else if (b[i] <= 81)
		   {
			   c[i] = 3.0;
		   }
		   else if (b[i] <= 84)
		   {
			   c[i] = 3.3f;
		   }
		   else if (b[i] <= 89)
		   {
			   c[i] = 3.7f;
		   }
		   else if (b[i] <= 100)
		   {
			   c[i] = 4.0;
		   }
		}
		for (i = 0;i < n;i++)
		{
			   sum += a[i] * c[i];
			   num += a[i];
		}
		GPA = sum / num;
		System.out.printf("%.2f",GPA);
		return 0;
	}
}

