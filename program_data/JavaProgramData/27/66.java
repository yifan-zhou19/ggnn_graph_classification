package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		float[] a = new float[100];
		float[] b = new float[100];
		float[] c = new float[100];
		float[] d = new float[100];
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
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				c[i] = Float.parseFloat(tempVar4);
			}
		}
		for (i = 0;i < n;i++)
		{
			d[i] = b[i] * b[i] - 4 * a[i] * c[i];
			if (d[i] == 0F)
			{
				System.out.printf("x1=x2=%.5f\n",(-b[i]) / (2 * a[i]));
			}
			if (d[i] > 0F && c[i] == 0F)
			{
				   System.out.printf("x1=0.00000;x2=%.5f\n", (-b[i] - Math.sqrt(d[i])) / (2 * a[i]));
			}
			if (d[i] > 0F && c[i] != 0F)
			{
				   System.out.printf("x1=%.5f;x2=%.5f\n",(-b[i] + Math.sqrt(d[i])) / (2 * a[i]), (-b[i] - Math.sqrt(d[i])) / (2 * a[i]));
			}

			if (d[i] < 0F)
			{
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",-b[i] / (2 * a[i]),Math.sqrt(-d[i]) / (2 * a[i]),-b[i] / (2 * a[i]),Math.sqrt(-d[i]) / (2 * a[i]));
			}
		}
		return 0;
	}
}

