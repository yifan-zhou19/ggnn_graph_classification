package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[] a = new int[400];
		for (i = 0;i < 400;i++)
		{
			a[i] = 10000;
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
				a[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != 10000)
			{
			for (k = i + 1;k < n;k++)
			{
				if (a[k] == a[i])
				{
					a[k] = 10000;
				}
			}
			}
			else
			{
				continue;
			}
		}
		int h = 0;
		for (i = 0;i < n;i++)
		{
			if (a[i] != 10000)
			{
				h++;
			}
		}
		for (i = 0;i < n;i++)
		{
			if (a[i] != 10000)
			{
				System.out.printf("%d",a[i]);
				h--;
				if (h != 0)
				{
					System.out.print(",");
				}
			}
		}
		return 0;
	}
}

