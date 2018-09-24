package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int j;
		int n;
		float[] a = new float[1000];
		float[] b = new float[1000];
		float[] c = new float[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (j = 1;j <= n;j++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[j] = Float.parseFloat(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				b[j] = Float.parseFloat(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c[j] = Float.parseFloat(tempVar4);
			}
		}

		for (j = 1;j <= n;j++)
		{
			if (b[j] * b[j] - 4 * a[j] * c[j] > 0F)
			{
				System.out.printf("x1=%.5f;x2=%.5f\n",(float)(-b[j] + Math.sqrt(b[j] * b[j] - 4 * a[j] * c[j])) / (2 * a[j]),(float)(-b[j] - Math.sqrt(b[j] * b[j] - 4 * a[j] * c[j])) / (2 * a[j]));
			}
			if (b[j] * b[j] - 4 * a[j] * c[j] == 0F)
			{
				System.out.printf("x1=x2=%.5f\n",(float)(-b[j] / (2 * a[j])));
			}
			if (b[j] * b[j] - 4 * a[j] * c[j] < 0F)
			{
				System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",(float)(-b[j] / (2 * a[j])),(float)(Math.sqrt(4 * a[j] * c[j] - b[j] * b[j]) / (2 * a[j])),(float)(-b[j] / (2 * a[j])),(float)(Math.sqrt(4 * a[j] * c[j] - b[j] * b[j]) / (2 * a[j])));
			}
		}
	}
}

