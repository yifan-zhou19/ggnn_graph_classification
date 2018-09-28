package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] a = new int[6];
	int i;
	int j;
	int time;
	while (a[0] != 0)
	{
	for (j = 0;j <= 5;j++)
	{
	a[j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	if (a[0] == 0)
	{
	return 0;
	}
	}
	System.out.print((a[3] + 12) * 60 * 60 + a[4] * 60 + a[5] - a[0] * 60 * 60 - a[1] * 60 - a[2]);
	System.out.print("\n");
	}

	return 0;
	}

}

