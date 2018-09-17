package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s = new String(new char[7]);
		int p;
		int ma;
		int cf = 0;
		int cm = 0;
		int i;
		int j;
		float h;
		float[] m = new float[40];
		float[] f = new float[40];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			p = Integer.parseInt(tempVar);
		}
		for (i = 0;i < p;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				s = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				h = Float.parseFloat(tempVar3);
			}
			if (strcmp("female",s) == 0)
			{
				f[cf] = h;
				cf++;
			}
			else
			{
				m[cm] = h;
				cm++;
			}
		}
		for (i = 0;i < cm;i++)
		{
			ma = i;
			for (j = i;j < cm;j++)
			{
				if (m[j] < m[ma])
				{
					ma = j;
				}
			}
			h = m[ma];
			m[ma] = m[i];
			m[i] = h;
			System.out.printf("%.2f ",m[i]);
		}
		for (i = 0;i < cf;i++)
		{
			ma = i;
			for (j = i;j < cf;j++)
			{
				if (f[j] > f[ma])
				{
					ma = j;
				}
			}
			h = f[ma];
			f[ma] = f[i];
			f[i] = h;
			System.out.printf("%.2f",f[i]);
			if (i != cf - 1)
			{
				System.out.print(" ");
			}
		}
		return 0;
	}

}

