package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int x;
		int y;
		int i;
		int j;
		int max;
		int min;
		int[] a = new int[100];
		int[] b = new int[100];
		int t = 0;
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
	max = (x > y)?x:y;
	min = (x < y)?x:y;
	a[0] = max;
	b[0] = min;
	for (i = 0;i <= 20;i++)
	{
		a[i + 1] = a[i] / 2;
	b[i + 1] = b[i] / 2;
	}
	for (i = 0;i <= 20;i++)
	{
		if (t == 1)
		{
			break;
		}
		for (j = 0;j <= 20;j++)
		{
			if (a[i] == b[j])
			{
		System.out.printf("%d",a[i]);
		t = 1;
			}
		}
	}
	}
}

