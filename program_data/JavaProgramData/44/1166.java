package <missing>;

public class GlobalMembers
{
	public static int reverse(int n)
	{
		int lenth = 0;
		int a;
		int num = 0;
		int i;
		int b;
		int c;
		int k;
		double d;

		a = n;
		while (a >= 1)
		{
			a = a / 10;
			lenth++;
		}
		k = 0;
		for (i = lenth;i > 0;i--)
		{

			b = n % (int)Math.pow(10,i);
			c = n % (int)Math.pow(10,(i - 1));
			d = Math.pow(10,(1 - lenth + 2 * k));
			k++;
			num += (b - c) * d;
		}

		return num;
	}

	public static void Main(String[] args)
	{
		int[] a = new int[6];
		int[] b = new int[6];
		int i;

		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			if (a[i] >= 0)
			{
				b[i] = reverse(a[i]);
				System.out.printf("%d\n",b[i]);
			}
			else
			{
				b[i] = reverse(-a[i]);
				System.out.printf("%d\n",-b[i]);
			}
		}

	}
}

