package <missing>;

public class GlobalMembers
{
	public static void change(int[] a)
	{
		int i;
		for (i = 1;i < 10000 && a[i - 1] != 1;i++)
		{
			a[i] = (int)(a[i - 1] / 2);
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int x;
		int y;
		int[] a = new int[10];
		int[] b = new int[10];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			y = Integer.parseInt(tempVar2);
		}
		a[0] = x;
		b[0] = y;
		change(a);
		change(b);
		for (i = 0;i < 10;i++)
		{
			for (j = 0;j < 10;j++)
			{
				if (a[i] == b[j])
				{
					System.out.printf("%d\n",a[i]);
					return 0;
				}
			}
		}
	}

}

