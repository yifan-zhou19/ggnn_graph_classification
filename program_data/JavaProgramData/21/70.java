package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int n,i,a[400],s=0,t=0;
		int n;
		int i;
		int[] a = new int[400];
		int s = 0;
		int t = 0;
		float p = 0F;
		float max;
		float[] b = new float[400];
		float[] c = new float[400];
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
			s = s + a[i];
		}
		p = (float)s / (float)n;
		for (i = 0;i < n;i++)
		{
			c[i] = (float)a[i];
			b[i] = qjdz(c[i],p);
		}
		max = b[0];
		for (i = 0;i < n;i++)
		{
			if (max < b[i])
			{
				max = b[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (b[i] == max)
			{
				if (t > 0)
				{
					System.out.print(",");
				}
				System.out.printf("%d",a[i]);
				t = 1;
			}
		}
	}
}

