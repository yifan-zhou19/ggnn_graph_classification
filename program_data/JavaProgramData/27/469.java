package <missing>;

public class GlobalMembers
{
	/**************************** 
	*file:6.cpp
	*author:|? 
	*time:2013-10-9 
	*description:
	*?????????????? 
	*****************************/ 
	public static int Main()
	{
		int n; //??????n???n?????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[] a = new double[n]; //???????a,b,c,x,y;?????????????????????x,y?????
		double[] b = new double[n];
		double[] c = new double[n];
		double[] x = new double[n];
		double[] y = new double[n];
		double[] p = new double[n]; //???????p????????????
		for (int i = 0; i < n; i++)
		{
			a[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			b[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			c[i] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
		}
		for (int i = 0; i < n; i++)
		{
			p[i] = b[i] * b[i] - 4 * a[i] * c[i]; //p[i]????
			x[i] = b[i] / (2 * a[i]); //?????????????x[i]
			if (p[i] > 0) //?????0
			{
				y[i] = Math.sqrt(p[i]) / (2 * a[i]); //????????y[i]
				System.out.print("x1=");
				System.out.printf("%.5f", - x[i] + y[i]);
				System.out.printf("%.5f", ";x2=");
				System.out.printf("%.5f", - x[i] - y[i]);
				System.out.printf("%.5f", "\n");
			}
			if (p[i] < 0) //?????0
			{
				y[i] = Math.sqrt(-p[i]) / (2 * a[i]); //??y[i]?????????
				if (x[i] == 0) //?????????x[i]?0???????-0????x[i]==0???????????
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", 0.00000);
					System.out.printf("%.5f", '+');
					System.out.printf("%.5f", Math.abs(y[i]));
					System.out.printf("%.5f", 'i');
					System.out.printf("%.5f", ";x2=");
					System.out.printf("%.5f", 0.00000);
					System.out.printf("%.5f", '-');
					System.out.printf("%.5f", Math.abs(y[i]));
					System.out.printf("%.5f", 'i');
					System.out.printf("%.5f", "\n");
				} //????????????????5?????????0.00000
				else
				{
					System.out.printf("%.5f", "x1=");
					System.out.printf("%.5f", -x[i]);
					System.out.printf("%.5f", '+');
					System.out.printf("%.5f", Math.abs(y[i]));
					System.out.printf("%.5f", 'i');
					System.out.printf("%.5f", ";x2=");
					System.out.printf("%.5f", -x[i]);
					System.out.printf("%.5f", '-');
					System.out.printf("%.5f", Math.abs(y[i]));
					System.out.printf("%.5f", 'i');
					System.out.printf("%.5f", "\n");
				}
			} //?x[i]??0???????-0????????????????5???
			if (p[i] == 0) //?????0???
			{
				System.out.printf("%.5f", "x1=x2=");
				System.out.printf("%.5f", -x[i]);
				System.out.printf("%.5f", "\n");
			}
		}
		return 0;
	}

}

