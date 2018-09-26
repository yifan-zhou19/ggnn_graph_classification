package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[100];
		int j;
		int i;
		float[] b = new float[100];
		float[] c = new float[100];
		float[] d = new float[100];
		float sum = 3.500F;
		c[0] = 1.0F;
		c[1] = 2.0F;
		d[0] = 2.0F;
		d[1] = 3.0F;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			sum = 3.5F;
			if (a[i] == 1)
			{
				System.out.print("2.000\n");
			}
			else if (a[i] == 2)
			{
				System.out.print("3.500\n");
			}
			else
			{
			for (j = 2;j < a[i];j++)
			{
				c[j] = c[j - 1] + c[j - 2];
				d[j] = d[j - 1] + d[j - 2];
				b[j] = d[j] / c[j];
				sum = sum + b[j];
			}
			System.out.printf("%.3f\n",sum);
			}
		}
		return 0;
	}
}

