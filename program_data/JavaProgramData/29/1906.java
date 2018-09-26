package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		double s;
		double l;
		double t;
		int i;
		int j;
		int k;
		int m;
		s = 2;
		l = 1;


		double b = 0;
		double c;
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}

			for (k = 1;k <= m;k++)
			{
			for (j = 1;j <= a[k];j++)
			{
				c = s / l;
				b = b + c;
				t = l + s;
				l = s;
				s = t;
			}
			System.out.printf("%.3f", b);
			b = 0;
			s = 2;
			l = 1;
			System.out.print("\n");
			}
			return 0;
	}
}

