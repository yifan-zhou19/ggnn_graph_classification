package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		float[] a = new float[1000];
		float[] b = new float[1000];
		float[] c = new float[1000];
		float delta;
		float p;
		float q;
		float x1;
		float x2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n - 1;i++)
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
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				c[i] = Float.parseFloat(tempVar4);
			}
		}
		for (i = 0;i <= n - 1;i++)
		{
			delta = b[i] * b[i] - 4 * a[i] * c[i];
			p = -b[i] / (2 * a[i]);
			if (delta == 0F)
			{
				System.out.printf("x1=x2=%.5f\n",p);
			}
			else
			{
				if (delta > 0F)
				{
					q = Math.sqrt(delta) / (2 * a[i]);
					x1 = p + q;
					x2 = p - q;
					System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
				}
				else
				{
					delta = -delta;
					q = Math.sqrt(delta) / (2 * a[i]);
					if (b[i] == 0F)
					{
						p = Math.abs(p);
						System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",p,q,p,q);
					}
					else
					{
						System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",p,q,p,q);
					}
				}
			}
		}
		return 0;
	}

}

