package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x;
		int y;
		int i;
		int[] a = new int[20];
		int[] b = new int[20];
		int p = 1;
		int q = 1;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		a[0] = x;
		for (i = 1;i < 20;i++)
		{
			a[i] = a[i - 1] / 2;
			if (a[i] == 0)
			{
				break;
			}
			p = p + 1;
		}
		b[0] = y;
		for (i = 1;i < 20;i++)
		{
			b[i] = b[i - 1] / 2;
			if (b[i] == 0)
			{
				break;
			}
			q = q + 1;
		}
		for (i = 0;i < 20;i++)
		{
			if (p == 1 || q == 1)
			{
				System.out.printf("%d",a[0]);
				break;
			}
			if (p != 1 || q != 1)
			{
				if ((a[p - 1 - i] == b[q - 1 - i]) && (a[p - 1 - i - 1] != b[q - 1 - i - 1]))
				{
				System.out.printf("%d",a[p - 1 - i]);
				break;
				}
			}
		}
		return 0;
	}

}

