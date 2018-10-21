package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int p = 1;
		float[] a = new float[100];
		float[] b = new float[100];
		float[] c = new float[10000];
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
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
		}
		c[0] = 0F;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				c[p] = Math.sqrt((a[i] - a[j]) * (a[i] - a[j]) + (b[i] - b[j]) * (b[i] - b[j]));
				if (c[p] > c[0])
				{
				   c[0] = c[p];
					p++;
				}
			}
		}
			System.out.printf("%.4f\n",c[0]);
			return 0;
	}



}

