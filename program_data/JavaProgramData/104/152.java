package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int a;
		int b;
		int i;
		int j;
		int m;
		int q;
		int[] c = new int[12];
		int[] d = new int[12];
		int[] e = new int[12];
		int[] f = new int[12];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		 c[11] = a;
		for (i = 10;i >= 0;i--)
		{
			m = a % 2;
			if (m == 0)
			{
				c[i] = a / 2;
			}
			 else if (m == 1)
			 {
				c[i] = (a - 1) / 2;
			 }
			a = c[i];
		}

		d[11] = b;
		for (i = 10;i >= 0;i--)
		{
			m = b % 2;
			if (m == 0)
			{
				d[i] = b / 2;
			}
			 else if (m == 1)
			 {
				d[i] = (b - 1) / 2;
			 }
			b = d[i];
		}

		j = 0;
		for (i = 0;i < 12;i++)
		{

				if (c[i] != 0)
				{
					e[j] = c[i];
				j = j + 1;
				}
				else
				{
					continue;
				}
		}

		j = 0;
		for (i = 0;i < 12;i++)
		{

				if (d[i] != 0)
				{
					f[j] = d[i];
				j = j + 1;
				}
				else
				{
					continue;
				}
		}

		for (i = 0;i < 11;i++)
		{
			if (e[i] == f[i])
			{
				if (e[i] <= c[11] != 0 && 0 < e[i])
				{
					q = e[i];
				}
				else
				{
					q = e[i - 1];
				}
			}
			else
			{
				break;
			}
		}
		System.out.printf("%d",q);

	}
}

