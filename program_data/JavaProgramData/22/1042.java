package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[300];
		int i = 0;
		int n;
		int max;
		int second;
		char c;
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
		while (c == ',')
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[++i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(null, 1);
			if (tempVar4 != null)
			{
				c = tempVar4.charAt(0);
			}
		}
		n = i + 1;
		max = a[0];
		second = -10000;
		for (i = 0;i < n;i++)
		{
			if (a[i] > max)
			{
				second = max;
				max = a[i];
			}
			else if (a[i] < max && a[i]> second)
			{
				second = a[i];
			}
		}
		if (second == -10000)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d",second);
		}
	}
}

