package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int nanrenshu = 0;
		int nvrenshu = 0;
		String zfc = new String(new char[7]);
		final String male = "male";
		final String female = "female";
		float[] nan = new float[41];
		float[] nv = new float[41];
		float jh;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= 40;i++)
		{
			nan[i] = 0F;
			nv[i] = 0F;
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				zfc = tempVar2.charAt(0);
			}
			if (strcmp(zfc,male) == 0)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					nan[i] = Float.parseFloat(tempVar3);
				}
				nanrenshu++;
			}
			if (strcmp(zfc,male) != 0)
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					nv[i] = Float.parseFloat(tempVar4);
				}
				nvrenshu++;
			}
		}
		for (i = 1;i < n;i++)
		{
			for (j = 1;j < n - i + 1;j++)
			{
				if (nan[j] < nan[j + 1])
				{
					jh = nan[j];
					nan[j] = nan[j + 1];
					nan[j + 1] = jh;
				}
				if (nv[j] < nv[j + 1])
				{
					jh = nv[j];
					nv[j] = nv[j + 1];
					nv[j + 1] = jh;
				}
			}
		}
		System.out.printf("%.2f",nan[nanrenshu]);
		for (i = nanrenshu - 1;i > 0;i--)
		{
			System.out.printf(" %.2f",nan[i]);
		}
		for (i = 1;i <= nvrenshu;i++)
		{
			System.out.printf(" %.2f",nv[i]);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			n = Integer.parseInt(tempVar5);
		}
		return 0;
	}
}

