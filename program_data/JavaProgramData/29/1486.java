package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		float[] a = new float[100];
		float[] b = {0.0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int i;
		int j;
		for (j = 0;j < m;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			float sum = 0F;

			 for (i = 0;i < n + 1;i++)
			 {
				if (i == 0)
				{
				a[i] = 1F;

				}
				if (i == 1)
				{
				a[i] = 2F;
				}
			   if (i > 1)
			   {
				a[i] = a[i - 1] + a[i - 2];
			   }
			 }
			for (i = 0;i < n;i++)
			{
				b[i] = (float)(a[i + 1] / a[i]);
				sum = sum + b[i];
			}
			System.out.printf("%.3f\n",sum);
		}
		return 0;
	}

}

