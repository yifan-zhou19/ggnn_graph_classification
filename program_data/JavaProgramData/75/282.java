package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[1111];
		int[] b = new int[1111];
		int[] m = new int[1110];
		int n;
		int w;
		int max = 0;
		int j;
		int i = -1;
		char c = ',';
		while (c == ',')
		{
			i++;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			c = System.in.read();
		}
		w = i + 1;
		c = ',';
		i = -1;
		while (c == ',')
		{
			i++;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				b[i] = Integer.parseInt(tempVar2);
			}
			c = System.in.read();
		}
		for (n = 0;n <= 999;n++)
		{
			for (j = 0;j <= i;j++)
			{
				if ((n >= a[j]) && (n < b[j]))
				{
					m[n]++;
				}
			}
		}
		for (n = 0;n <= 999;n++)
		{
			if (m[n] > max)
			{
				max = m[n];
			}
		}
		System.out.printf("%d ",w);
		System.out.printf("%d\n",max);
	}


}

