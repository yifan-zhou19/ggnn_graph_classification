package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
		a = i / 10;
		b = i % 10;
		if (a != 7 && i % 7 != 0 && b != 7)
		{
			sum = sum + i * i;
		}
		}
		System.out.print(sum);
		return 0;
	}


}

