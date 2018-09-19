package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[300];
		int sum = 0;
		int t1;
		double aver;
		double[] b = new double[300];
		double t2;
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
				a[i] = Integer.parseInt(tempVar2);
			}
			sum += a[i];
		}
		aver = (double)sum / n;
		 for (i = 0;i < n;i++)
		 {
			 b[i] = Math.abs(a[i] - aver);
		 }
		 for (i = 1;i < n;i++)
		 {
			 for (j = 0;j < n - i;j++)
			 {
				 if (b[j] < b[j + 1])
				 {
					 t2 = b[j];
					 b[j] = b[j + 1];
					 b[j + 1] = t2;

					 t1 = a[j];
					 a[j] = a[j + 1];
					 a[j + 1] = t1;
				 }
			 }
		 }
			 for (i = 0;i < n;i++)
			 {
				 if (b[i] == b[0])
				 {
					 System.out.printf("%d%c",a[i],(b[i + 1] == b[i])?',':'\n');
				 }
			 }
	}




}

