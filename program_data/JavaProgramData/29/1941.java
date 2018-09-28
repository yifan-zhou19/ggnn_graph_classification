package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int j;
		int a = 2;
		int b = 1;
		int t;
		int i;
		float s;
		float k = 0.0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}

		for (i = 1;i <= m;i++)
		{
			k = 0.0F;
			a = 2;
			b = 1;

			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			if (n == 1)
			{
				System.out.print("2.000\n");
			}
			else
			{

			 for (j = 1;j <= n - 1;j++)
			 {
				 t = a;
				 a = a + b;
				 b = t;
				 s = 1.0 * a / b;
				 k = k + s;
			 }
			 k = k + 2;

			 System.out.printf("%.3f\n",k);

			}

		}
		return 0;
	}

}

