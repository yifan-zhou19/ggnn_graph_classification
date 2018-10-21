package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int n;
		int i;
		double[] a = new double[100];
		double s = 0.0;
		double b = 0.0;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k != 0)
		{
			k--;
	s = 0.0,b = 0.0;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a + i = tempVar;
				}
				b += a[i];
			}
			b = b / n;
			for (i = 0;i < n;i++)
			{
				s += (a[i] - b) * (a[i] - b);
			}
			s = Math.sqrt(s / n);
			System.out.printf("%.5f\n",s);
		}
		return 0;
	}
}

