package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int reverse = int n;
		int i;
		int[] a = new int[6];
		int[] b = new int[6];
		for (i = 0;i <= 5;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i <= 5;i++)
		{
			b[i] = reverse(a[i]);
		}
		for (i = 0;i <= 5;i++)
		{
			System.out.printf("%d\n",b[i]);
		}
	}

	public static int reverse(int n)
	{
		int f = 0;
		int i;
		int j;
		int m;
		int p;
		int q;
		int[] c = new int[10];
		int[] d = new int[10];
		if (n > 0)
		{
			p = Math.log10(n);
			for (i = 0;i <= p;i++)
			{
				q = Math.pow(10,(p - i));
				c[i] = (n - n % q) / q;
				n = n - c[i] * q;
			}
			for (i = 0;i <= p;i++)
			{
				d[i] = c[p - i];
			}
			for (i = 0;;i++)
			{
				if (d[i] > 0)
				{
					break;
				}
			}
			for (j = i;j <= p;j++)
			{
				f = f + d[j] * Math.pow(10,p - j);
			}
		}
		else if (n == 0)
		{
			f = 0;
		}
		else
		{
			n = -n;
			p = Math.log10(n);
			for (i = 0;i <= p;i++)
			{
				q = Math.pow(10,(p - i));
				c[i] = (n - n % q) / q;
				n = n - c[i] * q;
			}
			for (i = 0;i <= p;i++)
			{
				d[i] = c[p - i];
			}
			for (i = 0;;i++)
			{
				if (d[i] > 0)
				{
					break;
				}
			}
			for (j = i;j <= p;j++)
			{
				f = f + d[j] * Math.pow(10,p - j);
			}
			f = -f;
		}
		return (f);
	}
}

