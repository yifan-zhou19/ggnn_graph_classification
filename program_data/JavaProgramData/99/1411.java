package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a = 0;
		int b = 0;
		int c = 0;
		int e = 0;
		int[] m = new int[100];
		double a1;
		double b1;
		double c1;
		double e1;

			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			for (i = 1;i <= n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					m[i] = Integer.parseInt(tempVar2);
				}
			}
			for (i = 1;i <= n;i++)
			{
				if (m[i] < 19)
				{
					a = a + 1;
				}
				else if ((m[i] > 18) && (m[i] < 36))
				{
					b = b + 1;
				}
				else if ((m[i] > 35) && (m[i] < 61))
				{
					c = c + 1;
				}
				else if (m[i] > 60)
				{
					e = e+1;
				}


			}
			a1 = (double)a / n;
			b1 = (double)b / n;
			c1 = (double)c / n;
			e1 = (double)e / n;
			System.out.printf("1-18: %.2lf%%\n19-35: %.2lf%%\n36-60: %.2lf%%\n60??: %.2lf%%",a1 * 100,b1 * 100,c1 * 100,e1 * 100);
			return 0;

	}
}

