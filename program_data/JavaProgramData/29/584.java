package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int i;
		int j;
		int[] s = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
			for (j = 1;j <= m;j++)
			{
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   s[j] = Integer.parseInt(tempVar2);
			   }
			}
		for (j = 1;j <= m;j++)
		{
			int a = 2;
			int b = 1;
			double sum = (double)a / b;
			for (i = 1;i < s[j];i++)
			{
			int c = a + b;
			b = a;
			a = c;
			double x = (double)a / b;
			sum = sum + x;
			}
		System.out.printf("%.3lf\n",sum);
		}
	return 0;
	}
}

