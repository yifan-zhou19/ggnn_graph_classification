package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[100];
	int i;
	int n;
	int squarsum = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		a[i] = i + 1;
		if (a[i] % 7 == 0 || a[i] / 10 == 7 || a[i] - a[i] / 10 * 10 == 7)
		{
			continue;
		}
		squarsum += a[i] * a[i];
	}
		System.out.printf("%d",squarsum);
	return 0;
	}


}

