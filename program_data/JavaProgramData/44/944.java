package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
			 double[] c = new double[6];
		void reverse(double c[]);
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				c[i] = Double.parseDouble(tempVar);
			}
		}
		 reverse(c);
	}

		public static void reverse(double[] c)
		{
			int i;
			int k;
			int m;
			int[] b = new int[6];
			int[] a = new int[6];
			for (i = 0;i < 6;i++)
			{
				m = (int)Math.log10(Math.abs(c[i])) + 1;
				a[i] = (int)c[i];
				b[i] = 0;
							   for (k = 0;k < m;k++)
							   {


						b[i] = 10 * b[i] + (a[i] % 10);
				   a[i] = a[i] / 10;
							   }
				System.out.printf("%d\n",b[i]);
			}
		}
}

