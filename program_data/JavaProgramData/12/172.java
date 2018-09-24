package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[16];
	public static int k;
	public static void scan()
	{

		int i;
		int j = 1;
		int n = 0;
		int h;
		int t;
		while (scanf("%d",a[j]) && a[j] != 0)
		{
			j++;
		}
		for (i = 0;i < j;i++)
		{
			for (h = i;h < j;h++)
			{
				if (a[i] > a[h])
				{
					t = a[i];
					a[i] = a[h];
					a[h] = t;
				}
			}
		}
		for (i = 0;i < j - 1;i++)
		{
			for (h = i + 1;h < j;h++)
			{
				if (a[h] == 2 * a[i])
				{
				n++;
				break;
				}
			}
		}
			System.out.printf("%d\n",n);
	}

	public static void Main()

	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		while (a[0] > 0)
		{
			scan();
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a[0] = Integer.parseInt(tempVar2);
			}
		}
	}
}

