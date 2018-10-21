package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int i;
	int n;
	int[] a = new int[50000];
	int[] b = new int[50000];
	int[] m = new int[20000];
	int x;
	int y;
	int k;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < 20000;i++)
	{
		m[i] = 0;
	}
	for (i = 0;i < n;i++)
	{

		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			b[i] = Integer.parseInt(tempVar3);
		}
		for (k = 2 * a[i];k < 2 * b[i];k++)
		{
			m[k] = 1;
		}
		if (i == 0)
		{
			x = a[i];
			y = b[i];
		}
		else
		{
			if (b[i] > y)
			{
				y = b[i];
			}
			if (a[i] < x)
			{
				x = a[i];
			}
		}
	}
	for (k = 2 * x;k < 2 * y;k++)
	{
		if (m[k] == 0)
		{
			System.out.print("no");
			break;
		}
						 if (k == 2 * y - 1)
						 {
							 System.out.printf("%d %d",x,y);
						 }
	}
	 return 0;
	}
}

