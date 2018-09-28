package <missing>;

public class GlobalMembers
{
	//???      1000062705    ?7???????
	public static int Main()
	{
		int n;
		int i;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			if (i % 7 == 0)
			{
				continue;
			}
			else if ((i - 7) % 10 == 0 || i / 10 == 7)
			{
				continue;
			}
			else
			{
				sum = sum + i * i;
			}
		}
			System.out.print(sum);
			System.out.print("\n");
		return 0;
	}

}

