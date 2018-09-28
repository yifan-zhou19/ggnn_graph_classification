package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int[] n = new int[N];
		int i;
		int a;
		int b;
		int j;
		int e;
		double c;
		double s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}


		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n[i] = Integer.parseInt(tempVar2);
			}
		}

		for (i = 0;i < m;i++)
		{

			  a = 1;
				 b = 1;
			  s = 0;
			for (j = 0;j < n[i];j++)
			{
			  c = (double)(a + b) / b;
			  s += c;
			  e = b;
			  b = a + e;
			  a = e;

			}
			System.out.printf("%.3lf\n",s);

		}

		return 0;
	}
}

