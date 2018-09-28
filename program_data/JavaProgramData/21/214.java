package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int p = 0;
		float m;
		float[] a = new float[300];
		float sum = 0F;
		float t;
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
				a[i] = Float.parseFloat(tempVar2);
			}
			sum = sum + a[i];
		}
	   m = sum / n;
	   for (i = 0;i < (n - 1);i++)
	   {
		   for (j = (i + 1);j < n;j++)
		   {
			   if (Math.abs(a[i] - m) < Math.abs(a[j] - m))
			   {
				   t = a[i];
				   a[i] = a[j];
				   a[j] = t;
			   }
		   }
	   }
	   for (i = 0;i < n;i++)
	   {
	   if (Math.abs(a[i] - m) == Math.abs(a[0] - m))
	   {
		   p = p + 1;
	   }
	   }
	   for (i = 0;i < (p - 1);i++)
	   {
		   for (j = (i + 1);j < p;j++)
		   {
			   if (a[i] > a[j])
			   {
				   t = a[i];
				   a[i] = a[j];
				   a[j] = t;
			   }
		   }
	   }

		System.out.printf("%.0f",a[0]);
	   for (i = 1;i < p;i++)
	   {

		System.out.printf(",%.0f",a[i]);
	   }



	}


}

