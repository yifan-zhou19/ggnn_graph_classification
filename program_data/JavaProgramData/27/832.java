package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float[] a = new float[100];
		float[] b = new float[100];
		float[] c = new float[100];
		double x1;
		double x2;
		double y;
		double s;
		double z;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
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
		for (i = 1;i <= n;i++)
		{
			y = b[i] * b[i] - 4 * a[i] * c[i];
			if (y >= 0.00)
			{
				x1 = (-b[i] + Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
				x2 = (-b[i] - Math.sqrt(b[i] * b[i] - 4 * a[i] * c[i])) / (2 * a[i]);
				if (x1 == x2)
				{
					System.out.printf("x1=x2=%.5f\n",x1);
				}
				else
				{
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
				}
			}
			else
			{
				z = Math.sqrt(-y) / (2 * a[i]);
				if (b[i] == 0.0F)
				{
					System.out.printf("x1=0.00000+%.5fi;x2=0.00000-%.5fi\n",z,z);
				}
				else
				{
					s = -b[i] / (2 * a[i]);
					System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",s,z,s,z);
				}
			}
		}
		return 0;
	}

}

