package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int j;
		int n;
		int k;
		int b;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = 0;
		for (j = 1;j <= n;j++)
		{
			b = 0;
			k = j;
			while (j > 0)
			{
				a = j % 10;
				j = j / 10;
				if (a == 7)
				{
					b = 1;
				}
			}
			if (k % 7 == 0)
			{
				b = 1;
			}
			if (b == 0)
			{
				sum += k * k;
			}
			j = k;
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}


}

