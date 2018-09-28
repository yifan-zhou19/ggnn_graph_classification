package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] x = new int[4];
	char[] x1 = {'z', 'q', 's', 'l'};
	int i;
	int j;
	for (x[0] = 10;x[0] <= 50;x[0] = x[0] + 10)
	{
		for (x[1] = 10;x[1] <= 50;x[1] = x[1] + 10)
		{
		if (x[1] == x[0])
		{
	continue;
		}
	for (x[2] = 10;x[2] <= 50;x[2] = x[2] + 10)
	{
		if (x[2] == x[0] || x[2] == x[1])
		{
	continue;
		}
						  for (x[3] = 10;x[3] <= 50;x[3] = x[3] + 10)
						  {
		if (x[3] == x[0] || x[3] == x[1] || x[3] == x[2])
		{
	continue;
		}
	if ((x[0] + x[1]) == (x[2] + x[3]) && (x[0] + x[3]) > (x[2] + x[1]) && (x[0] + x[2]) < x[1])
	{
		for (i = 10;i <= 50;i = i + 10)
		{
		for (j = 0;j < 4;j++)
		{
		if (x[j] == 60 - i)
		{
		System.out.print(x1[j]);
		System.out.print(" ");
		System.out.print(60 - i);
		System.out.print("\n");
		}
		}
		}
	}
						  }


	}
		}
	}
	return 0;
	}
}
