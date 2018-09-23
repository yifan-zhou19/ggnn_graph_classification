package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int temp = 0;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		a[0] = m;
		b[0] = n;
		for (i = 1;;i++)
		{
			a[i] = a[i - 1] / 2;
			if (a[i] == 1)
			{
				break;
			}
		}
		for (i = 1;;i++)
		{
			b[i] = b[i - 1] / 2;
			if (b[i] == 1)
			{
				break;
			}
		}
		for (i = 0;i < 1000;i++)
		{
			for (j = 0;j < 1000;j++)
			{
				if (a[i] == b[j])
				{
					temp = 1;
					break;
				}
			}
			if (temp == 1)
			{
				break;
			}
		}
		System.out.printf("%d",a[i]);
		return 0;
	}
}

