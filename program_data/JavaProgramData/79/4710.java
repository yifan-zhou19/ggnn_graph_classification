package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int n1 = 0;
	int p = 0;
	int r;
	int[] mon = new int[300];
	for (int k = 1;k <= 100;k++)
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
	if ((n == 0) && (m == 0))
	{
		break;
	}
	else
	{
	n1 = 0;
	p = 0;
	r = n;
	for (int i = 0;i < n;i++)
	{
		mon[i] = 1;
	}
	while (r > 1)
	{
		while (n1 < m)
		{
			if (mon[p] == 1)
			{
				n1++;
				if (n1 == m)
				{
					mon[p] = 0;
				}
			}
			p++;
			p = p % n;
		}
		n1 = 0;
		r--;
	}
	for (int j = 0;j < n;j++)
	{
		if (mon[j] == 1)
		{
			System.out.printf("%d\n",j + 1);
			break;
		}
	}
	}
	}
	return 0;
	}





}

