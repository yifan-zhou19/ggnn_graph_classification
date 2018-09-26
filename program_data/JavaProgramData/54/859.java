package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int sum;
		int i;
		int j;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 1;j > 0;j++)
		{
			sum = (n - 1) * j;
			t = 0;
			for (i = 0;i < n;i++)
			{
				if (sum % (n - 1) == 0)
				{
					sum = sum / (n - 1) * n + k;
					t = t + 1;
				}
				else
				{
					break;
				}
			}
			if (t == n)
			{
				break;
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

