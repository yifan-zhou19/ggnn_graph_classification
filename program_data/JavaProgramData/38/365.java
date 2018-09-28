package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 int k;
		 int i;
		 int n;
		 int j;
		 int p;
		 double[] x = new double[1000];
		 double a;
		 double b;
		 double s;
		 double S;
		 String tempVar = ConsoleInput.scanfRead();
		 if (tempVar != null)
		 {
			 k = Integer.parseInt(tempVar);
		 }
		 for (i = 0;i < k;i++)
		 {
			 a = 0;
				 s = 0;
				 S = 0;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					n = Integer.parseInt(tempVar2);
				}
				for (j = 0;j < n;j++)
				{
						String tempVar3 = ConsoleInput.scanfRead();
						if (tempVar3 != null)
						{
							x[j] = Double.parseDouble(tempVar3);
						}
						a = a + x[j];
				}
				b = a / n;

				j = 0;
				for (j = 0;j < n;j++)
				{
						s = s + (x[j] - b) * (x[j] - b);
				}

				S = Math.sqrt(s / n);
				System.out.printf("%.5lf\n",S);
		 }
		 //scanf("%d",&p);
		 return 0;
	}

}

