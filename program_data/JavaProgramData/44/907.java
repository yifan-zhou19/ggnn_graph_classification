package <missing>;

public class GlobalMembers
{
	public static int reverse(int a)
	{
		int n;
		int[] b = new int[10];
		int[] c = new int[10];
		int i;
		int ra;
		int sum = 0;
		if (a > 0)
		{
			n = Math.log10(a) + 1;
		for (i = 0;i < n;i++)
		{
			b[i] = a / (int)Math.pow(10,n - i - 1);
			c[i] = a % (int)Math.pow(10,n - i - 1);
			a = c[i];
		}
		for (i = 0;i < n;i++)
		{
			ra = b[i] * Math.pow(10,i);
			sum = sum + ra;
		}
		return (sum);
		}

		if (a < 0)
		{
			a = -a;
				n = Math.log10(a) + 1;
		for (i = 0;i < n;i++)
		{
			b[i] = a / (int)Math.pow(10,n - i - 1);
			c[i] = a % (int)Math.pow(10,n - i - 1);
			a = c[i];
		}
		for (i = 0;i < n;i++)
		{
			ra = b[i] * Math.pow(10,i);
			sum = sum + ra;
		}
		return (-sum);
		}

		if (a == 0)
		{
			return (0);
		}
	}

	public static void Main()
	{
		int i;
		int[] a = new int[6];
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",reverse(a[i]));
		}
	}
}

