package <missing>;

public class GlobalMembers
{
	//????
	public static int Main()
	{
		int n;
		int[] a = new int[10];
		int[] b = new int[10];
		int[] c = new int[10];
		int s = 0;
		int[] x = new int[100];
		int[] y = new int[100];
		int ht;
		double[] d = new double[100];
		double max;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			c[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0;i < n;i++)
		{
		   for (int j = i + 1;j < n;j++)
		   {
			   d[s] = Math.sqrt((a[i] * 1.0 - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]) + (c[i] - c[j]) * (c[i] - c[j]));
			   x[s] = i;
			   y[s] = j;
			   s++;

		   }
		} //???????
		   for (int i = 0;i < n * (n - 1) / 2;i++)
		   {
			   for (s = 0;s < n * (n - 1) / 2 - 1;s++)
			   {
			   if (d[s] < d[s + 1])
			   {
				  max = d[s];
				  d[s] = d[s + 1];
				  d[s + 1] = max;
				  ht = x[s];
				  x[s] = x[s + 1];
				  x[s + 1] = ht;
				  ht = y[s];
				  y[s] = y[s + 1];
				  y[s + 1] = ht;
			   } //????
			   }
		   }
		   for (s = 0;s <= n * (n - 1) / 2 - 1;s++)
		   {

				System.out.print('(');
				System.out.print(a[x[s]]);
				System.out.print(',');
				System.out.print(b[x[s]]);
				System.out.print(',');
				System.out.print(c[x[s]]);
				System.out.print(")-(");
				System.out.print(a[y[s]]);
				System.out.print(',');
				System.out.print(b[y[s]]);
				System.out.print(',');
				System.out.print(c[y[s]]);
				System.out.print(')');
				System.out.print('=');
				System.out.printf("%.2f", d[s]);
				System.out.printf("%.2f", "\n");
		   }

		return 0;

	}

}

