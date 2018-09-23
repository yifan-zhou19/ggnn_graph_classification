package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		int j;
		int m;
		int n;
		int[] p = new int[20];
		int[] q = new int[20];
		int[] x = new int[20];
		int[] y = new int[20];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i <= 20;i++)
		{
			if (m >= 1)
			{
			x[i] = m;
			m = m / 2;
			}
			else
			{
				break;
			}
		}
		for (j = 0;j <= i;j++)
		{
			p[j] = x[i - j - 1];
		}
		for (i = 0;i <= 20;i++)
		{
			if (n >= 1)
			{
			y[i] = n;
			n = n / 2;
			}
			else
			{
				break;
			}
		}
		for (j = 0;j <= i;j++)
		{
			q[j] = y[i - j - 1];
		}
		for (i = 0;i <= 20;i++)
		{
			if (p[i] != q[i])
			{
				System.out.printf("%d",p[i - 1]);
				break;
			}
		}
	}














}

