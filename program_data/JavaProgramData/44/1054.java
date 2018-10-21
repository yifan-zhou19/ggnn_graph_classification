package <missing>;

public class GlobalMembers
{
	public static int f(int k)
	{
		int p = 1;
		int y = 0;
		int j;
		int i;
		int q;
		if (k < 0)
		{
	p = -1;
		}
		k = Math.abs(k);
	int[] a = new int[5];
	for (i = 4;i >= 0;i--)
	{
		a[i] = k / Math.pow(10,i);
	k = k - a[i] * Math.pow(10,i);
	}

	for (i = 4;i >= 0;i--)
	{
	if (a[i] != 0)
	{
	break;
	}
	}
	for (j = 0;j < 5;j++)
	{
	if (a[j] != 0)
	{
	break;
	}
	}
	for (q = j;q <= i;q++)
	{
		y = a[q] * Math.pow(10,i - q) + y;
	}
	y = y * p;
	return (y);
	}
	public static void Main()
	{
		int i;
	int[] a = new int[6];
	for (i = 0;i < 6;i++)
	{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[i] = Integer.parseInt(tempVar);
	}
	}
		for (i = 0;i < 6;i++)
		{
			System.out.printf("%d\n",f(a[i]));
		}
	}
}

