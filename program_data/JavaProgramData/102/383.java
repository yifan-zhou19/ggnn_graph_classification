package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[7]);
		int n;
		int i;
		int j;
		int p;
		int q;
		p = 0;
		q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		float[] m = new float[50];
		float[] f = new float[50];
		float g;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			if (a.charAt(0) == 'm')
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					m[p] = Float.parseFloat(tempVar3);
				}
				p = p + 1;
			}
			else
			{
				String tempVar4 = ConsoleInput.scanfRead();
				if (tempVar4 != null)
				{
					f[q] = Float.parseFloat(tempVar4);
				}
				q = q + 1;
			}
		}
		for (i = 0;i < p - 1;i++)
		{
			for (j = i + 1;j < p;j++)
			{
				if (m[i] > m[j])
				{
					g = m[i];
					m[i] = m[j];
					m[j] = g;
				}
			}
		}
		for (i = 0;i < p;i++)
		{
		System.out.printf("%0.2f ",m[i]);
		}
		for (i = 0;i < q - 1;i++)
		{
			for (j = i + 1;j < q;j++)
			{
				if (f[i] < f[j])
				{
					g = f[i];
					f[i] = f[j];
					f[j] = g;
				}
			}
		}
		for (i = 0;i < q - 1;i++)
		{
		System.out.printf("%0.2f ",f[i]);
		}
		System.out.printf("%0.2f",f[q - 1]);
		return 0;
	}

}

