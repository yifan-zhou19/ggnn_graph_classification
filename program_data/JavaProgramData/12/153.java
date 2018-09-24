package <missing>;

public class GlobalMembers
{
	public static int f(int h)
	{
		int[] a = new int[15];
		int i;
		int j;
		int n;
		int m = 0;
		a[0] = h;
		if (a[0] == -1)
		{
			return -1;
		}
		else
		{
			for (i = 1;i <= 15;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i] = Integer.parseInt(tempVar);
				}
				if (a[i] == 0)
				{
					break;
				}
			}
			n = i;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (a[i] == a[j] * 2)
					{
						m += 1;
						break;
					}
				}
			}
			return (m);
		}
	}
	public static void Main()
	{
		int[] a = new int[100];
		int h;
		int i = 0;
		while (true)
		{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				h = Integer.parseInt(tempVar);
			}
			a[i] = f(h);
			if (a[i] == -1)
			{
				break;
			}
			i++;
		}
		System.out.printf("%d",a[0]);
		for (i = 1;a[i] != -1;i++)
		{
			System.out.printf("\n%d",a[i]);
		}
	}

}

