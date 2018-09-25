package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[20];
		int[] y = new int[20];
		int i;
		int[] h = new int[20];
		int j;
		int s;
		for (i = 0;i < 20;i++)
		{
			x[i] = 0;
			y[i] = 0;
			h[i] = 0;
		}
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		x[1] = a;
		y[1] = b;
		for (i = 2;x[i - 1] > 1;i++)
		{
			x[i] = x[i - 1] / 2;
		}
		for (i = 2;y[i - 1] > 1;i++)
		{
			y[i] = y[i - 1] / 2;
		}
		for (j = 1;y[j] != 0;j++)
		{
		for (i = 1;x[i] != 0;i++)
		{
			if (x[i] == y[j])
			{
				h[i] = x[i];
			}
		}
		}
		for (i = 1;;i++)
		{
			if (h[i] != 0)
			{
			s = h[i];
			break;
			}
		}
		System.out.printf("%d",s);
		return 0;
	}
}

