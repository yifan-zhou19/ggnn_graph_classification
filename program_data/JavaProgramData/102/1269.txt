package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int N;
		int i;
		int j;
		int p;
		int k;
		float d;
		float[] m = new float[100];
		float[] n = new float[100];
		String c = new String(new char[100]);
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		p = 0;
		k = 0;
		for (i = 0;i <= N - 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c.charAt(0) == 'm')
			{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m[p] = Float.parseFloat(tempVar3);
			}
			p++;
			}
			else
			{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				n[k] = Float.parseFloat(tempVar4);
			}
			k++;
			}
		}
		for (i = 1;i <= p - 1;i++)
		{
			for (j = 0;j <= i - 1;j++)
			{
				if (m[i] < m[j])
				{
					d = m[i];
					m[i] = m[j];
					m[j] = d;
				}
			}
		}
		for (i = 1;i <= k - 1;i++)
		{
			for (j = 0;j <= i - 1;j++)
			{
				if (n[i] > n[j])
				{
					d = n[i];
					n[i] = n[j];
					n[j] = d;
				}
			}
		}
		for (i = 0;i <= p - 1;i++)
		{
		System.out.printf("%.2f ",m[i]);
		}
		for (i = 0;i <= k - 2;i++)
		{
		System.out.printf("%.2f ",n[i]);
		}
		System.out.printf("%.2f",n[k - 1]);
		return 0;
	}
}

