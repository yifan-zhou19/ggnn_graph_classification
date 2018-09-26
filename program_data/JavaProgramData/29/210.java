package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int a = 2;
		int aa = 1;
		int b = 1;
		int bb = 1;
		int x = 0;
		int y = 0;
		float sum = 2.000F;
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			for (j = 1;j < n;j++)
			{
				x = aa;
				aa = a;
				a = a + x;
				y = bb;
				bb = b;
				b = b + y;
				sum += (float)a / (float)b;
			}
			System.out.printf("%.3f\n",sum);
			a = 2;
			aa = 1;
			b = 1,bb = 1;
			x = 0,y = 0;
			sum = 2.000F;
		}

		return 0;
	}
}

