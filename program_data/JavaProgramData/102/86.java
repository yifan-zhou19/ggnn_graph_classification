package <missing>;

public class GlobalMembers
{
	public static float[] m = new float[50];
	public static float[] f = new float[50];
	public static int Main()
	{
		int total;
		int count;
		float meter;
		String str = new String(new char[10]);
		int mt;
		int ft;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			total = Integer.parseInt(tempVar);
		}
		mt = ft = 0;
		for (count = 0;count < total;count++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				str = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				meter = Float.parseFloat(tempVar3);
			}

			if (!strcmp(str,"male"))
			{
				m[mt++] = meter;
			}
			else
			{
				f[ft++] = meter;
			}
		}
		for (i = 0;i < mt;i++)
		{
			for (j = i + 1;j < mt;j++)
			{
				if (m[i] > m[j])
				{
					meter = m[i];
					m[i] = m[j];
					m[j] = meter;
				}
			}
		}
		for (i = 0;i < ft;i++)
		{
			for (j = i + 1;j < ft;j++)
			{
				if (f[i] < f[j])
				{
					meter = f[i];
					f[i] = f[j];
					f[j] = meter;
				}
			}
		}
		for (i = 0;i < mt;i++)
		{
			System.out.printf("%.2f ",m[i]);
		}
		for (i = 0;i < ft - 1;i++)
		{
			System.out.printf("%.2f ",f[i]);
		}
		System.out.printf("%.2f\n",f[i]);
		return 0;
	}
}

