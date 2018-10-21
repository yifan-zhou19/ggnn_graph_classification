package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int k;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		int i;
		float[] sz = new float[100];
		for (i = 1;i <= k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				n = Integer.parseInt(tempVar2);
			}
			int j;
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[j] = tempVar3;
				}
			}
			float a = 0F;
			for (j = 0;j < n;j++)
			{
				a = a + sz[j];
			}
			a = a / n;
			double s = 0;
			for (j = 0;j < n;j++)
			{
				s = s + (sz[j] - a) * (sz[j] - a);
			}
			s = s / n;
			s = Math.sqrt(s);
			System.out.printf("%.5lf\n",s);
		}
	}
}

