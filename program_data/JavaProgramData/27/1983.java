package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		double[][] a = new double[100][6];
		p = 1;
		m = 1;
		while (m <= n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[m][1] = Double.parseDouble(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				a[m][2] = Double.parseDouble(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				a[m][3] = Double.parseDouble(tempVar4);
			}
			m++;
		}
		while (p <= n)
		{
			a[p][4] = a[p][2] * a[p][2] - 4 * a[p][1] * a[p][3];
			if (0 == a[p][4])
			{
				a[p][5] = -a[p][2] / (2 * a[p][1]);
				System.out.printf("x1=x2=%.5f\n",a[p][5]);
			}
		   else if (a[p][4] > 0)
		   {
				 if (a[p][2] != 0)
				 {
				a[p][5] = (-a[p][2] + Math.sqrt(a[p][4])) / (2 * a[p][1]);
				a[p][6] = (-a[p][2] - Math.sqrt(a[p][4])) / (2 * a[p][1]);
				System.out.printf("x1=%.5f;x2=%.5f\n",a[p][5],a[p][6]);
				 }
				if (a[p][2] == 0)
				{
				a[p][5] = +Math.sqrt(a[p][4]) / (2 * a[p][1]);
				a[p][6] = -Math.sqrt(a[p][4]) / (2 * a[p][1]);
			 System.out.printf("x1=%.5f;x2=%.5f\n",a[p][5],a[p][6]);
				}
		   }
			else
			{
				a[p][5] = -a[p][2] / (2 * a[p][1]);
				a[p][6] = Math.sqrt(-a[p][4]) / (2 * a[p][1]);
				if (a[p][5] != 0)
				{
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",a[p][5],a[p][6],a[p][5],a[p][6]);
				}
				else
				{
				System.out.printf("x1=0.00000+%.5fi;x2=0.00000-%.5fi\n",a[p][6],a[p][6]);
				}
			}
			p++;
		}
		System.in.read();
		System.in.read();
		System.in.read();
		System.in.read();
	}

}

