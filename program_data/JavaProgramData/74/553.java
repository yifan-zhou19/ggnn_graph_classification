package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int m;
		int n;
		int i = 0;
		int j = 0;
		int k = 0;
		int[] b = new int[100];
		int[] a = new int[12];
		int s = 0;
		int h;
		double l;
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
			i = 0;
			k = m;
			while (m != 0)
			{
				a[i] = m % 10;
				m = m / 10;
				i++;
			}
			h = i;
			m = k;
			for (i = 0;i < h;i++)
			{
				l = (double)(h - 1 - i);
				s = s + a[i] * Math.pow(10.0,l);
			}
			if (m == s)
			{
				k = 0;
				for (i = 2;i < s;i++)
				{
					if (s % i == 0)
					{
						k = 1;
					}
				}
				if (k == 0)
				{
					b[j] = s;
					j++;
				}
			}
			s = 0;
		}
		k = j;
		if (j == 0)
		{
			System.out.print("no");
		}
		else
		{
			if (j == 1)
			{
				System.out.printf("%d",b[0]);
			}
			else
			{
		for (j = 0;j < k - 1;j++)
		{
			System.out.printf("%d,",b[j]);
		}
		System.out.printf("%d",b[j]);
			}
		}
	}







}

