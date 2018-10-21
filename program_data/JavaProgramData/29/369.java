package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[] a = new int[1000];
		int[] b = new int[1000];
		float sum = 0F;
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
				n = Integer.parseInt(tempVar2);
			}
			a[0] = 2;
			b[0] = 1;
			sum = (float)a[0] / b[0];
			for (j = 0;j < n - 1;j++)
			{
				a[j + 1] = a[j] + b[j];
				b[j + 1] = a[j];
				sum += (float)a[j + 1] / b[j + 1];
			}
			System.out.printf("%.3f\n",sum);
		}
	}
}

