package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k = 0;
		int j = 0;
		int b;
		float a;
		float e;
		float[] m = new float[40];
		float[] f = new float[40];
		String p = new String(new char[10]);
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
				p = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a = Float.parseFloat(tempVar3);
			}
			if (p.charAt(0) == 'f')
			{
				f[k] = a;
				k++;
			}
			else
			{
				m[j] = a;
				j++;
			}
		}
		for (i = 1;i < j;i++)
		{
			for (b = 0;b < j - i;b++)
			{
				if (m[b] > m[b + 1])
				{
					e = m[b + 1];
					m[b + 1] = m[b];
					m[b] = e;
				}
			}
		}
		for (i = 0;i < j;i++)
		{
			System.out.printf("%.2f ",m[i]);
		}
		for (i = 1;i < k;i++)
		{
			for (b = 0;b < k - i;b++)
			{
				if (f[b] < f[b + 1])
				{
					e = f[b + 1];
					f[b + 1] = f[b];
					f[b] = e;
				}
			}
		}
		for (i = 0;i < k;i++)
		{
			if (i != k - 1)
			{
			   System.out.printf("%.2f ",f[i]);
			}
			else
			{
			   System.out.printf("%.2f",f[i]);
			}
		}
		return 0;
	}

}

