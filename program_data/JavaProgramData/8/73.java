package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int i;
		int j;
		int t;
		int[] a = new int[100];
		int[] b = new int[100];
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
		for (i = 0;i < x;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < y;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		for (j = 0;j <= x - 1;j++)
		{
			for (i = 0;i < x - j - 1;i++)
			{
			if (a[i] > a[i + 1])
			{
				t = a[i];
				a[i] = a[i + 1];
				a[i + 1] = t;
			}
			}
		}
		for (j = 0;j <= y - 1;j++)
		{
			for (i = 0;i < y - j - 1;i++)
			{
			if (b[i] > b[i + 1])
			{
				t = b[i];
				b[i] = b[i + 1];
				b[i + 1] = t;
			}
			}
		}
			for (i = 0;i < x;i++)
			{
					System.out.printf("%d ",a[i]);
			}
				for (i = 0;i < y - 1;i++)
				{
					System.out.printf("%d ",b[i]);
				}
				System.out.printf("%d",b[y - 1]);
	}
}

