package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1000];
	public static int[] b = new int[1000];
	public static int Main()
	{
		char c;
		int n;
		int i = 0;
		int j;
		int MAX;
		int t;
		int min;
		int max;
		while (1 == 1)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			i = i + 1;
			if (c != ',')
			{
				break;
			}
		}
		i = 0;
		while (1 == 1)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				b[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
			i = i + 1;
			if (c != ',')
			{
				break;
			}
		}
		n = i;
		min = a[0];
		for (i = 0;i < n;i++)
		{
			if (a[i] < min)
			{
				min = a[i];
			}
		}
		max = b[0];
		for (i = 0;i < n;i++)
		{
			if (b[i] > max)
			{
				max = b[i];
			}
		}
		MAX = 0;
		for (i = min;i < max;i++)
		{
			t = 0;
			for (j = 0;j < n;j++)
			{
				if (b[j] > i && a[j] <= i)
				{
					t++;
				}
			}
			if (t > MAX)
			{
				MAX = t;
			}
		}
		System.out.printf("%d %d",n,MAX);
		return 0;
	}
}

