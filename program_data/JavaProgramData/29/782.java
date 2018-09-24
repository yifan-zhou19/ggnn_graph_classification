package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] n = new int[sum];

		int i;
		int j;
		int m;
		int e;
		int a = 1;
		int b = 1;
		double s = 0;
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
			for (j = 0;j < n[i];j++)
			{
				e = a;
				a = a + b;
				b = e;
				s += 1.0 * a / b;
			}
			System.out.printf("%.3lf",s);
			System.out.print("\n");
				a = 1;
				b = 1;
		   s = 0;
		}


		return 0;
	}

}

