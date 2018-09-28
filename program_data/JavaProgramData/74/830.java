package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int a;
		int b;
		int c;
		int d;
		int k;
		int e;
		int i;
		int t;
		int h;
		int s = 0;
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
		for (;m <= n;m++)
		{
			for (k = 1,i = 1;m - k >= 0;i++)
			{
				k = 10 * k;
			}
			c = m,d = m,e = 1;
			do
			{
				a = c % 10;
				c = (c - a) / 10;
				k = k / 10;
				b = d / k;
				d = d - b * k;
				e++;
				if (e == i)
				{
					h = m;
					for (t = 2;t < h && s == 0;t++)
					{
						if (h % t == 0)
						{
							break;
						}
						else if (t == h - 1)
						{
							System.out.printf("%d",h);
							s = s + 1;
						}
						else
						{
							continue;
						}
					}
					if (s == 1)
					{
						s = s + 1;
						continue;
					}
					for (t = 2;t < h && s>1;t++)
					{
						if (h % t == 0)
						{
							break;
						}
						else if (t == h - 1)
						{
							System.out.printf(",%d",h);
						}
						else
						{
							continue;
						}
					}
				}
			}while (a == b && e < i);

		}
		if (s == 0)
		{
			System.out.print("no");
		}

	}


}

