package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int n;
		int j;
		int a;
		int b;
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		for (i = 0;i < m;i++)
		{
			float sum = 0F;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			int a1 = 1;
			int a2 = 1;
			int b1 = 0;
			int b2 = 1;
			for (j = 0;j < n;j++)
			{
				a = a1 + a2;
				b = b1 + b2;
				sum = sum + 1.0 * a / b;
				t = a;
				a1 = a2;
				a2 = t;
				t = b;
				b1 = b2;
				b2 = t;
			}
			System.out.printf("%.3f\n",sum);
		}
		return 0;
	}

}

