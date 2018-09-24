package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char exp;
		int i;
		int c;
		int t;
		int w;
		int n;
		int s;
		int t2;
		int j;
		int k;
		int[] a = new int[16];
		int m;
		int e;
		float x;
		float y;
		double r;
		double d;
		double b;
		double h;
		double[] g = new double[100];



		for (; ;)
		{
			for (i = 0;i <= 15;i++)
			{
				a[i] = 0;
			}
			for (i = 0;i <= 15;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				if (a[i] == 0)
				{
					break;
				}
				if (a[i] == -1)
				{
					return 0;
				}

			}
			n = i;
			s = 0;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[j] == 2 * a[i])
					{
						s = s + 1;
					}
				}
			}
			System.out.printf("%d\n",s);
		}
		return 0;
	}

}

