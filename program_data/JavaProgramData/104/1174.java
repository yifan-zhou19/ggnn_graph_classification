package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[] a = new int[11];
		int[] b = new int[11];
		int i;
		int j;
		int p;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b[0] = Integer.parseInt(tempVar2);
		}
		for (i = 1;i <= 10;i++)
		{
			a[i] = a[i - 1] / 2;
			if (a[i] == 1)
			{
				break;
			}
		}
		for (j = 1;j <= 10;j++)
		{
			b[j] = b[j - 1] / 2;
			if (b[j] == 1)
			{
				break;
			}
		}
		for (i = 0;i <= 10;i++)
		{
			for (j = 0;j <= 10;j++)
			{
				if (a[i] == b[j])
				{
					System.out.printf("%d",a[i]);
					p = 1;
					break;
				}
			}
			if (p == 1)
			{
				break;
			}
		}
	}
}

