package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int reverse = int num;
		int[][] a = new int[6][1];
		int i;
		int l = 0;
		for (i = 0;i < 6;i++)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][0] = Integer.parseInt(tempVar);
			}
			l = reverse(a[i][0]);
			System.out.printf("%d\n",l);
		}

		return 0;
	}




		public static int reverse(int num)
		{
			int a = 0;
			int b = 0;
			int c = 0;
			int p = 0;
			int q = 0;
			int d = 0;
			int e = 0;
			int k = 0;
			k = Math.abs(num);
			e = k / 10000;
			a = (k / 1000) % 10;
			b = k % 10;
			c = (k / 10) % 10;
			d = (k / 100) % 10;
			if (e != 0)
			{
			p = b * 10000 + c * 1000 + d * 100 + a * 10 + e;
			}
			if (e == 0 && a != 0)
			{
			p = b * 1000 + c * 100 + d * 10 + a;
			}
			if (e == 0 && a == 0 && d != 0)
			{
			p = b * 100 + c * 10 + d;
			}
			if (e == 0 && a == 0 && d == 0 && c != 0)
			{
			p = b * 10 + c;
			}
			if (e == 0 && a == 0 && d == 0 && c == 0)
			{
			p = b;
			}

		if (num > 0)
		{
		   q = p;
		}
		if (num < 0)
		{
			q = -p;
		}
		return q;
		}
}

