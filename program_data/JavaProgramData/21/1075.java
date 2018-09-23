package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   int i;
	   int j;
	   int n;
	   int x;
	   int sum = 0;
	   int[] a = new int[300];
	   double average;
	   double[] b = new double[300];
	   double t;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 0;i < n;i++)
	   {
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = sum + a[i];
	   }
		 for (i = 0;i < n - 1;i++)
		 {
		   for (j = 0;j < n - 1 - i;j++)
		   {
			 if (a[j] > a[j + 1])
			 {
				x = a[j];
				a[j] = a[j + 1];
				a[j + 1] = x;
			 }
		   }
		 }
	   for (i = 0;i < n;i++)
	   {
		  average = (sum + 0.0) / n;
	   }
		for (i = 0;i < n;i++)
		{
		   b[i] = Math.abs(a[i] - average);
		}
		 for (i = 0;i < n - 1;i++)
		 {
		   for (j = 0;j < n - 1 - i;j++)
		   {
				if (b[j] < b[j + 1])
				{
				t = b[j];
				b[j] = b[j + 1];
				b[j + 1] = t;
				x = a[j];
				a[j] = a[j + 1];
				a[j + 1] = x;
				}
		   }
		 }
		 for (i = 0;i < n;i++)
		 {
			if (b[i + 1] != b[i])
			{
				System.out.print(a[i]);
				System.out.print("\n");
				break;
			}
			else
			{
				System.out.print(a[i]);
				System.out.print(",");
			}
		 }
		  return 0;
	}


}

