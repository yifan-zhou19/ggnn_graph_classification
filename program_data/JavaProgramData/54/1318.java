package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int m;
	int n;
	int k;
	int z = 1;
	int i;
	int x = 0;
	int y = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	for (m = n;;m++)
	{

		if ((m - k) % n == 0)
		{
			x = m;
			y = m;
			y = (n - 1) * (y - k) / n;
			z = 0;
			for (i = 1;i < n;i++)
			{
				if ((y - k) % n != 0)
				{
					z = 1;
					break;
				}
				y = (n - 1) * (y - k) / n;
			}
		}

		if (z == 0 && y != 0)
		{
			break;
		}
	}
		System.out.printf("%d",x);



	return 0;
	}

}

