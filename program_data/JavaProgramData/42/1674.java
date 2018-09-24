package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int flag = 0;
	int n;
	n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	int[] w = new int[100001];
	for (int i = 0;i < n;i++)
	{
	w[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	}
	int k;
	k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 0;i < n;i++)
	{
		if (w[i] != k)
		{
	if (flag != 0)
	{
		System.out.print(' ');
	}
	else
	{
		flag = 1;
	}
	System.out.print(w[i]);
		}
	}
	System.out.print("\n");
	return 0;
	}
}

