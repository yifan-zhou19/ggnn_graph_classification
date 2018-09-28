package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[301];
		int i;
		int max;
		int sec_max;
		int n = 0;
		char c;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[n++] = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(null, 1);
			if (tempVar2 != null)
			{
				c = tempVar2.charAt(0);
			}
			if (c != ',')
			{
				break;
			}
		}
		max = a[0];
		sec_max = a[0];
		for (i = 0;i < n;i++)
		{
			if (a[i] >= max)
			{
				max = a[i];
			}
			else
			{
				sec_max = a[i];
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] < max && a[i] >= sec_max)
			{
				sec_max = a[i];
			}
		}
		if (max == sec_max)
		{
			System.out.print("No");
		}
		else
		{
			System.out.printf("%d\n", sec_max);
		}
		return 0;

	}
}

