package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[6];
		int[] b = new int[6];
		int i;
		int t;
		int c;
		int s;
		int x;
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
			if (a[i] < 0)
			{
				a[i] = -a[i];
				c = 1;
			}
			else
			{
				c = 0;
			}
			t = Math.log(a[i]);
			s = t;
			while (s >= 0)
			{
				x = a[i] / Math.pow(10,s);
				b[i] += x * Math.pow(10,t - s);
				a[i] -= x * Math.pow(10,s);
				s--;
			}
			if (c != 0)
			{
				b[i] = -b[i];
			}
		}
		for (i = 0;i < 6;i++)
		{
			while (b[i] % 10 == 0)
			{
		b[i] = b[i] / 10;
			}
		System.out.printf("%d\n",b[i]);
		}
	}
}

