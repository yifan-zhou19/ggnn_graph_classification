package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int j = 0;
		int l = 0;
		int k;
		float h;
		float[] x = new float[100];
		float[] y = new float[100];
		float e;
		String a = new String(new char[100]);
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
				a = tempVar2.charAt(0);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				h = Float.parseFloat(tempVar3);
			}
			if (a.charAt(0) == 'm')
			{
				x[j] = h;
				j++;
			}
			else
			{
				y[l] = h;
				l++;
			}
		}
		for (k = 1;k < j;k++)
		{
			for (i = 0;i < j - k;i++)
			{
				if (x[i] > x[i + 1])
				{
					e = x[i + 1];
					x[i + 1] = x[i];
					x[i] = e;
				}
			}
		}
		for (k = 1;k < l;k++)
		{
			for (i = 0;i < l - k;i++)
			{
				if (y[i] > y[i + 1])
				{
					e = y[i + 1];
					y[i + 1] = y[i];
					y[i] = e;
				}
			}
		}
		System.out.printf("%.2f",x[0]);
		for (i = 1;i < j;i++)
		{
			System.out.printf(" %.2f",x[i]);
		}
		for (i = l - 1;i >= 0;i--)
		{
			System.out.printf(" %.2f",y[i]);
		}
		return 0;
	}

}

