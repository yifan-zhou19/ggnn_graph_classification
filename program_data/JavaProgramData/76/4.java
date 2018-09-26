package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] c = new int[10001];
		int i;
		int j;
		int p;
		int n;
		int min;
		int max;
		int a;
		int b;
		min = 10000;
		max = 0;
		for (i = 0;i < 10001;i++)
		{
			c[i] = 1;
		}
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
			if (a < min)
			{
				min = a;
			}
			if (b > max)
			{
				max = b;
			}
			for (j = a + 1;j < b;j++)
			{
				c[j] = 0;
			}
			if (c[a] == 1)
			{
				c[a] = 2;
			}
			else if (c[a] == 2)
			{
				c[a] = 0;
			}
			if (c[b] == 1)
			{
				c[b] = 2;
			}
			else if (c[b] == 2)
			{
				c[b] = 0;
			}
		}
		for (p = min + 1;p < max;p++)
		{
			if (c[p] != 0)
			{
				break;
			}
		}
		if (p == max)
		{
			System.out.printf("%d %d",min,max);
		}
		else if (p < max)
		{
			System.out.print("no");
		}
	}
}

