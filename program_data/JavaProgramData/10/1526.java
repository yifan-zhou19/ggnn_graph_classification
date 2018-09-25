package <missing>;

public class GlobalMembers
{
	public static int max(int[] b)
	{
		int i;
		int t = b[0];
	for (i = 0;i < 25;i++)
	{
		if (b[i] > t)
		{
			t = b[i];
		}
	}
	return t;
	}
	public static int destroy(int[] a, int t)
	{
		int[] b = {1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
	int i;
	int j;
	for (j = t - 1;j >= 0;j--)
	{
		for (i = j + 1;i <= t;i++)
		{
			if (a[j] >= a[i] != 0 && (b[i] + 1) > b[j])
			{
				b[j] = b[i] + 1;
			}
		}
	}
	return max(b) + 1;
	}
	public static void Main()
	{
		int x;
		int i = 0;
	int[] a = new int[25];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		x = Integer.parseInt(tempVar);
	}
	for (i = 0;i <= x - 1;i++)
	{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[i] = Integer.parseInt(tempVar2);
		}
	}
	System.out.printf("%d",destroy(a, x - 1));
	}

}

