package <missing>;

public class GlobalMembers
{
	public static int reverse(int n)
	{
		int m;
		int[] a = new int[32];
		int x;
		int i;
		int j;
		int b;
		if (n == 0)
		{
			m = 0;
		}
		else
		{
			i = 0;
			j = 0;
		   while (n != 0)
		   {
			b = n / 10;
			a[i] = n % 10;
			n = b;
			i++;
			j++;

		   }
		x = 0;
		i = 0;
		while (j != 0)
		{
			x = x * 10 + a[i];
			j--;
			i++;

		}
		m = x;
		}
		return (m);

	}



	public static void Main()
	{
		int i;
		int[] c = new int[6];
		int[] d = new int[6];
		int x;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				c[i] = Integer.parseInt(tempVar);
			}
		}
		for (i = 0;i < 6;i++)
		{
			x = c[i];
			d[i] = reverse(x);
			System.out.printf("%d\n",d[i]);
		}
	}
}

