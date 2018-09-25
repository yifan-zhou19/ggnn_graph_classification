package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] p = new int[10001];
		int[] q = new int[10001];
		int n;
		int a;
		int b;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;;i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (a == 0 && b == 0)
			{
				break;
			}
			p[b]++;
			q[a] = 1;
		}
		for (i = 0;i < n;i++)
		{
			if (p[i] == n - 1 && q[i] == 0)
			{
				System.out.print(i);
				System.out.print("\n");
				break;
			}
		}
		if (i == n)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
	return 0;
	}
}

