package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int num = 1;
		int sum = 0;
		int a;
		int b;
		while (num <= n)
		{
			if (num % 7 == 0)
			{
				num += 1;
			}
			else
			{
				a = num / 10;
				b = num - a * 10;
				if ((a == 7) || (b == 7))
				{
					num += 1;
				}
				else
				{
						sum = sum + num * num;
						num += 1;
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

