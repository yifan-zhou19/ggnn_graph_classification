package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char a = 44;
		char b;
		char c;
	int[] x = new int[301];
	int y;
	int z;
	int i = 1;
	int j;
	while (a == 44)
	{
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x[i] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(null, 1);
		if (tempVar2 != null)
		{
			a = tempVar2.charAt(0);
		}
		if (a != 44)
		{
			y = i;
		}
		i++;
	}
	for (i = 1;i <= y - 1;i++)
	{
		if (x[i] > x[i + 1])
		{
			z = x[i];
			x[i] = x[i + 1];
			x[i + 1] = z;
		}
	if (x[i] == x[i + 1])
	{
		x[i] = 0;
	}
	}
	for (i = 1;i <= y - 2;i++)
	{
		if (x[i] > x[i + 1])
		{
			z = x[i];
			x[i] = x[i + 1];
			x[i + 1] = z;
		}
	}

	if (x[y] == x[y - 1] || y == 1 || x[y - 1] == 0)
	{
		System.out.print("No");
	}
	else
	{
		System.out.printf("%d",x[y - 1]);
	}
	}
}

