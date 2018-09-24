package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String z = new String(new char[502]);
		int n;
		int a;
		int b;
		int c;
		int d;
		int max;
		int count;
		int len;
		int[] x = new int[502];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			z = tempVar2.charAt(0);
		}
		len = z.length();
		for (a = 0;a <= len;a++)
		{
			x[a] = 0;
		}
		for (a = 0;a <= len - n;a++)
		{
			for (b = a;b <= len - n;b++)
			{
				d = 0;
				for (c = 0;c <= n - 1;c++)
				{
					if (z.charAt(a + c) == z.charAt(b + c))
					{
						d++;
					}
					if (d == n)
					{
						x[a]++;
					}
				}
			}
		}

		max = x[0];
		count = 0;
		for (a = 0;a <= len - n;a++)
		{
			if (max < x[a])
			{
				count = 1;
				max = x[a];
			}
			if (max == x[a])
			{
				count++;
			}
		}
		if (max == 1)
		{
			System.out.print("NO");
			return 0;
		}
		System.out.printf("%d\n",max);
		//for(a=0;a<=count-1;a++)
		//{
			for (b = 0;b <= len - n;b++)
			{
				if (x[b] == max)
				{
					for (c = 0;c <= n - 1;c++)
					{
						System.out.printf("%c",z.charAt(b + c));
					}
					System.out.print("\n");
				}
			}
			System.out.print("\n");
		//}
		return 0;
	}
}

