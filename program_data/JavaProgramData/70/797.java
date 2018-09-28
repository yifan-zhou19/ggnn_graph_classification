package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int n;
		   int N;
		   int i;
		   int j;
		   int s = 0;
		   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		   N = n * (n - 1) / 2;

		   float[] a = new float[n];
		   float[] b = new float[n];
		   double[] dis = new double[N];
		   double max = 0;

		   for (i = 0; i < n; i++)
		   {
					a[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
					b[i] = Float.parseFloat(ConsoleInput.readToWhiteSpace(true));
		   }

		   for (i = 0; i < n; i++)
		   {
					for (j = i + 1; j < n; j++)
					{
					dis[s] = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]));
					s = s + 1;
					}
		   }

		   for (s = 0; s < N; s++)
		   {
					if (dis[s] > max)
					{
						max = dis[s];
					}
		   }


		   System.out.printf("%.4f\n",max);

		   return 0;


	}

}

