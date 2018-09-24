package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] apple = new int[n + 1];
		for (int j = 1;j <= 100000000;j++)
		{
			apple[n] = j * n + k;
			int i;
			for (i = n;i >= 2;i--)
			{
				if (apple[i] % (n - 1) == 0)
				{
					apple[i - 1] = apple[i] * n / (n - 1) + k;
				}
				else
				{
					break;
				}
			}
			if (i == 1)
			{
				break;
			}
		}
		System.out.print(apple[1]);
		System.out.print("\n");
		return 0;
	}
}

