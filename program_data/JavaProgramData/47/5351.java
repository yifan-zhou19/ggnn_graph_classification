package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n; //????
	int a;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[] value = new int[100]; //????
	for (a = 1;a <= n;a = a + 1)
	{
	value[a] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	for (a = n;a > 1;a = a - 1)
	{
		System.out.print(value[a]);
		System.out.print(' ');
	}
	System.out.print(value[1]);
	return 0;
	}
}

