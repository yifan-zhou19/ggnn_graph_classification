package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String a = new String(new char[500]);
		int n;
		int max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		int i;
		int j;
		int k;
		int l;
		int x;
		l = a.length();
		int[] c = new int[500];
		c[0] = 1;
		for (i = 1;i <= l - n;i++)
		{
			for (j = 0;j < i;j++)
			{
				for (k = 0;k < n;k++)
				{
					if (a.charAt(i + k) != a.charAt(j + k))
					{
						break;
					}
				}
				if (k == n)
				{
						c[j]++;
						c[i] = 0;
						break;
				}
			}
			if (j == i)
			{
				c[i] = 1;
			}
		}
		for (i = 0;i <= l - n;i++)
		{
			if (max < c[i])
			{
				max = c[i];
			}
		}
		if (max > 1)
		{
		System.out.printf("%d\n",max);
		for (i = 0;i <= l - n;i++)
		{
			if (c[i] == max)
			{
				for (j = i;j < i + n;j++)
				{
					System.out.printf("%c",a.charAt(j));
				}
				System.out.print("\n");
			}
		}
		}
		else
		{
			System.out.print("NO");
		}
		scanf("\n");
	}
}

