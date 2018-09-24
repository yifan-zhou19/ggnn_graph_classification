package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int k;
		int j;
		int m;
		int x = 0;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	for (i = 1;i <= 999999999;i++)
	{
		m = i;
		j = n;
	while (j > 0)
	{
		if (m % n == k)
		{
		m = m / n * (n - 1);
		j--;
		}
	else
	{
		break;
	}
	}
	if (j == 0 && m / (n - 1) >= 1)
	{
		System.out.printf("%d",i);
		x++;
	}
	if (x == 1)
	{
		break;
	}
	}
	}
}

