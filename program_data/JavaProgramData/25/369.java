package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int i = 0;
	int j = 0;
	int[] a = new int[100];
	a[1] = 1;
	for (i = 1;i <= n;i++)
	{
		for (j = 1;j < 100;j++)
		{
			a[j] = a[j] * 2;
		}
		for (j = 1;j < 100;j++)
		{
			if (a[j] >= 10)
			{
				a[j + 1] = a[j + 1] + a[j] / 10;
				a[j] = a[j] % 10;
			}
		}
	}
	for (i = 99;i > 1;i--)
	{
	if (a[i] != 0)
	{
		break;
	}
	}
	for (;i >= 1;i--)
	{
	System.out.print(a[i]);
	}
	System.out.print("\n");
	return 0;
	}
}

