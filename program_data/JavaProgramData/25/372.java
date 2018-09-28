package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[] a = new int[40];
	a[0] = 1;
	while (n != 0)
	{
		int j = 0;
		for (i = 0;i < 40;i++)
		{
			a[i] = 2 * a[i] + j;
			j = 0;
			if (a[i] > 9)
			{
				a[i] = a[i] - 10;
				j = 1;
			}
		}
		n--;
	}
	for (i = 39;i >= 0;i--)
	{
		if (a[i] != 0)
		{
			break;
		}
	}
	for (;i >= 0;i--)
	{
		System.out.print(a[i]);
	}
	return 0;
	}

}

