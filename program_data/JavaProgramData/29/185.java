package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;

		float sum;
		int a;
		int b;
		int c;
		int m;
		sum = 0.0F;
		a = 2;
		b = 1;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
			for (j = 0;j < m;j++)
			{
				sum += (float)a / b;
				c = a;
				a = a + b;
				b = c;
			}
			System.out.printf("%.3f",sum);
		sum = 0.0F;
		a = 2;
		b = 1;
		for (i = 1;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m = Integer.parseInt(tempVar3);
			}
			for (j = 0;j < m;j++)
			{
				sum += (float)a / b;
				c = a;
				a = a + b;
				b = c;
			}
			System.out.printf("\n%.3f",sum);
			sum = 0.0F;
		 a = 2;
		   b = 1;

		}


		return 0;
	}
}

