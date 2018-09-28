package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String c = new String(new char[501]);
		int i;
		int j;
		int k;
		int l;
		int[] a = new int[500];
		int m;
		int y;
		int max;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			c = tempVar2.charAt(0);
		}
		l = c.length();
		for (i = 0;i <= l;i++)
		{
			a[i] = 1;
		}
		i = 0;
		while (i <= l)
		{
			j = i + 1;
			while (j <= l)
			{
				y = 1;
				for (m = 0;m < k;m++)
				{
					if (c.charAt(m + j) != c.charAt(i + m))
					{
						y = 0;
					}
				}
				if (y != 0)
				{
					a[i]++;
					a[j] = 0;
				}
				j++;
			}
			i++;
		}
		max = 0;
		for (i = 0;i <= l;i++)
		{
			if (a[i] > a[max])
			{
				max = i;
			}
		}
		if (a[max] == 1)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",a[max]);
		for (i = 0;i <= l;i++)
		{
			if (a[i] == a[max])
			{
				for (m = 0;m < k;m++)
				{
					System.out.printf("%c",c.charAt(i + m));
				}
				System.out.print("\n");
			}
		}
		}
	}
}

