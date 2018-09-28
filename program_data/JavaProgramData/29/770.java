package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		float[] b = new float[9999];
		float[] as = new float[9999];
		float c;
		for (k = 0;k < m;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			as[0] = 1F;
			as[1] = 2F;
			c = 0F;
			for (i = 0;i < n;i++)
			{
				as[i + 2] = as[i] + as[i + 1];
				b[i] = as[i + 1] / as[i];
				c += b[i];
			}
			System.out.printf("%.3f\n",c);
		}
		return 0;
	}

}

