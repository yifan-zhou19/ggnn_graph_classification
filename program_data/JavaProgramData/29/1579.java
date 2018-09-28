package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double sum;
		int m;
		int n;
		int k;
		int i;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= m;i++)
		{
			 sum = 0;
			 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			 float[] a = new float[n];
			 float[] b = new float[n];
			 a[0] = 2F;
			 a[1] = 3F; //??a[n]???????
			 b[0] = 1F;
			 b[1] = 2F; //??b[n]???????
			 for (k = 2;k < n;k++)
			 {
				  a[k] = a[k - 1] + a[k - 2]; //??a[n]??
				  b[k] = b[k - 1] + b[k - 2]; //??b[n]??
			 }
			 for (k = 0;k < n;k++)
			 {
				 sum = sum + a[k] / b[k];
			 }
			 System.out.printf("%.3f",sum); //??????
			 System.out.print("\n");
		}
		return 0;
	}

}

