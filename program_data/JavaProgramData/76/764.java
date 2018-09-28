package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int n;
		int min;
		int max;
		int a;
		int b;
		int j;
		int[] c = new int[10001];
		int[] w = new int[10001];
		for (i = 0;i < 10001;i++)
		{
			c[i] = 0;
			w[i] = 0;
		}
		min = 10001;
		max = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b = Integer.parseInt(tempVar3);
			}
			if (min > a)
			{
				min = a;
			}
			if (max < b)
			{
				max = b;
			}
			for (j = a;j <= b;j++)
			{
				if (j == a || j == b)
				{
					if (w[j] == 0 && c[j] == 0)
					{
						c[j] = 0;
						w[j] = 1;
					}
					else
					{
						c[j] = 1;
					}
				}
				else
				{
					c[j] = 1;
				}
			}
		}
		for (i = min;i <= max;i++)
		{
			if (c[i] == 0)
			{
				if (i == min || i == max)
				{
				}
				else
				{
					break;
				}
			}
		}
		if (i < max + 1)
		{
			System.out.print("no");
		}
		if (i == max + 1)
		{
			System.out.printf("%d %d",min,max);
		}
	}


}

