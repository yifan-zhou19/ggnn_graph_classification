package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		double delta;
		double x1;
		double x2;
		double re;
		double im1;
		double im2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		float[] a = new float[n];
		float[] b = new float[n];
		float[] c = new float[n];
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
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	//ORIGINAL LINE: #define a a[i]
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	//ORIGINAL LINE: #define b b[i]
	//C++ TO JAVA CONVERTER NOTE: The following #define macro was replaced in-line:
	//ORIGINAL LINE: #define c c[i]
			delta = b[i] * b[i] - 4 * a[i] * c[i];
			if (delta > 0)
			{
				x1 = (-b[i] + Math.sqrt(delta)) / (2 * a[i]);
				x2 = (-b[i] - Math.sqrt(delta)) / (2 * a[i]);
				System.out.printf("x1=%.5f;x2=%.5f\n",x1,x2);
			}
			if (delta == 0)
			{
				x1 = -b[i] / (2 * a[i]);
				System.out.printf("x1=x2=%.5f\n",x1);
			}
			if (delta < 0)
			{
				re = -b[i] / (2 * a[i]);
				if (re == -0)
				{
					re = 0;
				}
				im1 = Math.sqrt(-delta) / (2 * a[i]);
				im2 = -im1;
				if (im1 > 0)
				{
				   System.out.printf("x1=%.5f+%.5fi;x2=%.5f-%.5fi\n",re,im1,re,im1);
				}
			}
		}

		return 0;
	}

}

