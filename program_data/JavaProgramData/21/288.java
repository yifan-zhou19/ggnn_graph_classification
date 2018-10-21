package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int sum = 0;
		int max = 0;
		int i;
		int j;
		int t;
		int[] a = new int[400];
		float f;
		float f1;
		float f2;
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
			sum = sum + a[i];
		}
		f = (double)sum / n;
		for (i = 0;i < n - 1;i++)
		{
		  for (j = 0;j < n - 1 - i;j++)
		  {
			  if (a[j] > a[j + 1])
			  {
				  t = a[j];
				  a[j] = a[j + 1];
				  a[j + 1] = t;
			  }
		  }
		}
			  f1 = (double)a[0];
			  f2 = (double)a[n - 1];

			  if (Math.abs(f - f1) == Math.abs(f - f2))
			  {
				  System.out.printf("%d,%d",a[0],a[n - 1]);
			  }
			  else if (Math.abs(f - f1) > Math.abs(f - f2))
			  {
				  System.out.printf("%d",a[0]);
			  }
			  else
			  {
				  System.out.printf("%d",a[n - 1]);
			  }
	}


}

