package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int e = 0;
		int p = 0;
		int q = 0;
		int a;
		int s;
		int b;
		int k;
		int i;
		int t = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}

		for (a = m;a <= n;a++)
		{
			s = 0;
			b = 0;
			k = 0;
			for (i = 2;i <= Math.sqrt(a);i++)
			{
				if (a % i == 0)
				{
					s = s + 1;
				}
			}
			if (s == 0)
			{
				p++;
				t = a;
				while (t != 0)
				{
					k = t % 10;
					b = b * 10 + k;
					t = t / 10;
				}
				if (b == a)
				{
					if (e == 0)
					{
						System.out.printf("%d",a);
						e = 1;
					}
					else
					{
						System.out.printf(",%d",a);
					}
				}
				else
				{
					q++;
				}
			}
		}
			if (p == q)
			{
				System.out.print("no");
			}
	}

}

