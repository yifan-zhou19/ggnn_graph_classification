package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		float ave;
		float x;
		float sum = 0F;
		float[] a = new float[100];
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
				a[i] = Float.parseFloat(tempVar2);
			}
			sum += a[i];
		}
		ave = sum / n;

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n - 1;j++)
			{
				if (a[j] > a[j + 1])
				{
					x = a[j];
					a[j] = a[j + 1];
					a[j + 1] = x;
				}
			}
		}

		if ((ave - a[0]) < (a[n - 1] - ave))
		{
			System.out.printf("%d\n",(int)a[n - 1]);
		}
		else if ((ave - a[0]) > (a[n - 1] - ave))
		{
			System.out.printf("%d\n",(int)a[0]);
		}
		else
		{
			System.out.printf("%d,%d\n",(int)a[0],(int)a[n - 1]);
		}
	}
}

