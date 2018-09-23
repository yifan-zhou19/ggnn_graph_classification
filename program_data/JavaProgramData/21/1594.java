package <missing>;

public class GlobalMembers
{
	public static float cc(int x,float y)
	{
		if (x > y)
		{
			return (x - y);
		}
		else
		{
			return (y - x);
		}
	}
	public static void Main()
	{
		int n;
		int i;
		int p = 0;
		int j;
		float sum = 0F;
		float t = 0F;
		int[] a = new int[301];
		int[] b = new int[301];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[i] = Integer.parseInt(tempVar2);
			}
			sum += a[i];
		}
		sum = sum / n;
		for (i = 1;i <= n;i++)
		{
			if (cc(a[i], sum) > t)
			{
				t = cc(a[i], sum);
			}
		}
		for (i = 1;i <= n;i++)
		{
			if (cc(a[i], sum) == t)
			{
				p++;
				b[p] = a[i];
			}
		}
		for (i = 1;i < p;i++)
		{
			for (j = 1;j <= p - i;j++)
			{
				if (b[j] > b[j + 1])
				{
					t = b[j];
					b[j] = b[j + 1];
					b[j + 1] = t;
				}
			}
		}
		if (p == 1)
		{
			System.out.printf("%d",b[1]);
		}
		else
		{
			System.out.printf("%d",b[1]);
			for (i = 2;i <= p;i++)
			{
				System.out.printf(",%d",b[i]);
			}
		}
	}
}

