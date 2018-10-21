package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum = 0;
		int i;
		int b;
		int[] a = new int[100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i = i + 1)
		{
			b = 0;
			if (i % 7 == 0)
			{
				b = 1;
			}
			if (i % 10 == 7)
			{
				b = 1;
			}
			if ((i - i % 10) % 100 == 70)
			{
				b = 1;
			}
			if (b == 0)
			{
				sum = sum + i * i;
			}
		}
		System.out.print(sum);
		return 0;
	}


}

