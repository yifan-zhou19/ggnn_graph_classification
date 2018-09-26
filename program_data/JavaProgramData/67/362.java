package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int n;
		   int i;
		   int[] a = new int[1000];
		   int[] b = new int[1000];
		double m;
		double p;
			 String tempVar = ConsoleInput.scanfRead();
			 if (tempVar != null)
			 {
				 n = Integer.parseInt(tempVar);
			 }
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
		}
			m = (double)b[0] / (double)a[0];
		for (i = 1; i < n; i++)
		{
			p = (double)b[i] / (double)a[i];
			if (m - p > 0.05)
			{
			System.out.print("worse\n");
			}
			else if (p - m > 0.05)
			{
			System.out.print("better\n");
			}
			else if (m - p <= 0.05 || p - m <= 0.05)
			{
				System.out.print("same\n");
			}
		}
		return 0;
	}
}

