package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i = 0;
	int num;
	int[] feibo = {1, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765};
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (i < n)
	{
	num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	System.out.print(feibo[num]);
	System.out.print("\n");
	i++;
	}
	return 0;
	}
}

