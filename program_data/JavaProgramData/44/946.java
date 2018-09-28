package <missing>;

public class GlobalMembers
{
	public static int reverse(int m)
	{
		int[] a = new int[20];
		int i;
		int p;
		int w;
		int sum = 0;
		if (m == 0)
		{
			return (0); //????0????????M??0???????0
		}
		if (m > 0)
		{
		for (i = 1;i < 20;i++)
		{
			if (m == 0)
			{
				p = i - 1;
				break;
			}
			a[i] = m % 10;
			m = (m - a[i]) / 10;
		}
		for (i = 1;i <= p;i++)
		{
			w = (int)Math.pow(10,p - i);
			sum = sum + a[i] * w;
		}
			return (sum);
		}

		if (m < 0)
		{
			m = (int)Math.abs(m);
			for (i = 1;i < 20;i++)
			{
			if (m == 0)
			{
				p = i - 1;
				break;
			}
			a[i] = m % 10;
			m = (m - a[i]) / 10;
			}
			for (i = 1;i <= p;i++)
			{
				w = (int)Math.pow(10,p - i);
				sum = sum + a[i] * w;
			}

			   return (-sum);

		}
	}
	public static void Main()
	{
		int[] a = new int[6];
		int i;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			a[i] = reverse(a[i]);
		}

		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
	}


}

