package <missing>;

public class GlobalMembers
{
	public static int function(int num,int k)
	{
	int j;
	int m = 0;
	if (num > 1)
	{
		for (j = k;j <= num;j++)
		{
		if (num % j == 0)
		{
		m = m + function(num / j, j);
		}

		}
	return m;
	}
	else
	{
	return 1;
	}
	}
	public static int Main()
	{
		int i;
		int j;
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[] num = new int[100];

	for (i = 0;i < n;i++)
	{
		num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}

	for (i = 0;i < n;i++)
	{
		System.out.print(function(num[i], 2));
		System.out.print("\n");
	}

	return 0;
	}
}

