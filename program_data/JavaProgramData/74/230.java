package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] s = new int[1000];
		int m;
		int n;
		int i;
		int j;
		int t;
		int a;
		int b;
		int c;
		int k;
		int h = 0;
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
		a = m;
		for (i = 0;i <= (n - m);i++,a++)
		{
			t = Math.sqrt(a);
			k = 1;
			b = 0;
			for (j = 2;j <= t;j++)
			{
				if (a % j == 0)
				{
					k = 0;
					break;
				}
			}
				if (k == 1)
				{
					for (c = a;c >= 1;c = c / 10)
					{
						b = b * 10 + c % 10;
					}
					if (a == b)
					{
						s[h] = a;
						h++;
					}
				}
		}
		if (h == 0)
		{
			System.out.print("no");
		}
		else
		{
			for (i = 0;i < h;i++)
			{
				System.out.printf("%d",s[i]);
				if (i < h - 1)
				{
					System.out.print(",");
				}
			}
		}
	}
}

