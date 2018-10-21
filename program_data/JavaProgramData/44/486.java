package <missing>;

public class GlobalMembers
{
	public static void a(int t)
	{
		if (t < 0)
		{
		System.out.print('-');
	t = -t;
		}
	if (t > 0)
	{
		System.out.print(t % 10);
	a(t / 10);
	}
	}
	public static int Main()
	{
		int[] t = new int[6];
	int i;
	for (i = 0;i < 6;i++)
	{
	t[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	while (t[i] % 10 == 0)
	{
		t[i] = t[i] / 10;
	}
	a(t[i]);
	System.out.print("\n");
	}
	return 0;
	}

}

