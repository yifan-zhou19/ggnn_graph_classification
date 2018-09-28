package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
		int[] a = new int[300];
		float d = 0F;
		float m = 0F;
		float p = 0F;
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
			d = d + a[i];
		}
		d = (float)d;
		d = d / n;
		for (i = 0;i < n;i++)
		{
			if (a[i] - d >= 0F)
			{
				if (a[i] - d > p)
				{
				p = a[i] - d;
				j = i;
				}
			}
			else
			{
				if (d - a[i] > m)
				{
				m = d - a[i];
				k = i;
				}
			}
		}
		if (p > m)
		{
			System.out.printf("%d",a[j]);
		}
		else if (p < m)
		{
			System.out.printf("%d",a[k]);
		}
			else
			{
				System.out.printf("%d,%d",a[k],a[j]);
			}
	}
}

