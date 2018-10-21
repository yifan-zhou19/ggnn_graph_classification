package <missing>;

public class GlobalMembers
{
	// ?????? ???1000010500
	// ?7???????
	public static int Main()
	{
		int n;
		int i;
		int k;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			k = i / 10; // k??i?????
			if (i % 7 == 0 || i % 10 == 7 || k == 7)
			{
			continue;
			}
			sum = sum + i * i;
		}
		System.out.print(sum);
		return 0;
	}
}

