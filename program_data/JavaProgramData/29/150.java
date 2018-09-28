package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int n;
		int i;
		int j;
		int a = 2;
		int b = 1;
		int t;
		float sum;
		int[] d = new int[100];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
				   sum = 0F;
				   a = 2;
				   b = 1;
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					d[i] = Integer.parseInt(tempVar2);
				}

				for (j = 0;j < d[i];j++)
				{

					 sum = sum + 0.1 * 10 * a / b;
					   t = a + b;
					   b = a;
					   a = t;
				}
				System.out.printf("%.3f\n",sum);
		}


	return 0;
	}
}

