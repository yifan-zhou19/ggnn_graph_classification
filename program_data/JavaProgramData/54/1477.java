package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int num;
		int i;
		int t;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		num = k;
		t = k;
		do
		{
			num = num + n;
			t = num;
			for (i = n - 1;i >= 1;i--)
			{
				if (num % (n - 1) != 0)
				{
					break;
				}
				else
				{
					num = num * n / (n - 1) + k;
				}
			}
			num = t;
		}while (i >= 1);
		for (i = 1;i < n;i++)
		{
			num = num * n / (n - 1) + k;
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}

}

