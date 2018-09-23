package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int[] a = new int[30];
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 1 ; i <= k ; i++)
	{
	a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	int[] sum = new int[30];
	for (int i = 0 ; i <= k ; i++)
	{
	sum[i] = 1;
	}
	for (int i = 2 ; i <= k ; i++)
	{
	for (int j = i - 1 ; j > 0 ; j--)
	{
	if (a[j] >= a[i] != 0 && sum[i] < sum[j] + 1)
	{
	sum[i] = sum[j] + 1;
	}
	}
	}
	int max = 1;
	for (int i = 1 ; i <= k; i++)
	{
	if (max < sum[i])
	{
	max = sum[i];
	}
	}
	System.out.print(max);
	System.out.print("\n");
	return 0;
	}

}

