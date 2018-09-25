package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int m;
	public static int i;
	public static int[] a = new int[100];
	public static int[] b = new int[100];
	public static void passed(int x,int y)
	{
		int j;
		int t;
		for (i = 1;i < x;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[i - j] < a[i - 1 - j])
				{
					t = a[i - j];
					a[i - j] = a[i - 1 - j];
					a[i - 1 - j] = t;
				}
				else
				{
					break;
				}
			}
		}
		for (i = 1;i < y;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (b[i - j] < b[i - 1 - j])
				{
					t = b[i - j];
					b[i - j] = b[i - 1 - j];
					b[i - 1 - j] = t;
				}
				else
				{
					break;
				}
			}
		}
		System.out.printf("%d",a[0]);
		for (i = 1;i < x;i++)
		{
			System.out.printf(" %d",a[i]);
		}
		for (i = 0;i < y;i++)
		{
			System.out.printf(" %d",b[i]);
		}
	}
	public static int Main()
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				a[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < m;i++)
		{
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				b[i] = Integer.parseInt(tempVar4);
			}
		}
		passed(n, m);
	}
}

