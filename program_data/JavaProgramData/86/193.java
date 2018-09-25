package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int k;
	int m;
	int[] a = new int[100];
	int temp = 0;
	int flag = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		flag = 0;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		m = Integer.parseInt(tempVar2);
	}
	if (m == 0)
	{
		temp = 60;
	}
	for (k = 1;k <= m;k++)
	{
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		a[k] = Integer.parseInt(tempVar3);
	}

	if (flag == 0 && a[k] + 3 * k >= 63)
	{
	temp = 60 - 3 * (k - 1);

	flag = 1;
	}


	if (flag == 0 && (60 < a[k] + 3 * k) && (a[k] + 3 * k < 63))
	{
	temp = a[k];

	flag = 1;
	}

	if (flag == 0 && a[k] + 3 * k <= 60)
	{
	temp = 60 - 3 * m;

	}
	}

	System.out.printf("%d\n",temp);
	}
	return 0;
	}
}

