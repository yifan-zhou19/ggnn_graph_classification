package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int k = 0;
	int n = 0;
	int r = 0;
	int m = 0;
	int[] a = new int[400];

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		r = Integer.parseInt(tempVar);
	}

	for (n = 0;n < r;n++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[n] = Integer.parseInt(tempVar2);
	}
	}

	for (n = 0;n < r;n++)
	{
	if (n != 777)
	{
	for (k = n + 1;k < r;k++)
	{
		if (a[k] == a[n])
		{
			a[k] = 777;
		}
	}
	}
	}

	System.out.printf("%d",a[0]);

	for (n = 1;n < r;n++)
	{
		if (a[n] != 777)
		{
			System.out.printf(",%d",a[n]);
		}
	}

	}
}

