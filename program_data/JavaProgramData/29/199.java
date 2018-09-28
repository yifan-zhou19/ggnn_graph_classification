package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] as = new int[200];
		as[0] = 1;
		as[1] = 2;
		for (i = 2;i < 200;i++)
		{
			as[i] = as[i - 1] + as[i - 2];
		}
		int[] a = new int[100];
		for (i = 0;i < m;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		double sum = 0;
		for (i = 0;i < m;i++)
		{
			for (j = 0,sum = 0;j < a[i];j++)
			{
				sum = sum + (double)as[j + 1] / (double)as[j];
			}
			System.out.printf("%.3lf\n",sum);
		}
	}





}

