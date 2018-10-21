package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	int[] a = new int[100];
	int n;
	int i;
	int sum = 0;
	for (i = 0;i < 100;i++)
	{
	a[i] = i + 1;
	}

	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
	if (a[i] % 7 == 0)
	{
	a[i] = 0;
	}
	else if ((a[i] - 7) % 10 == 0)
	{
	a[i] = 0;
	}
	else if ((a[i] / 10) - 7 == 0)
	{
	a[i] = 0;
	}
	}

	for (i = 0;i < n;i++)
	{
	sum = sum + a[i] * a[i];
	}

	System.out.printf("%d\n",sum);
	}

}

