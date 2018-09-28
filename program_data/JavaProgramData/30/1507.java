package <missing>;

public class GlobalMembers
{
	/*************************************
	*file                           ******
	*author                           ****
	*date                              ***
	*description                         *
	*************************************/

	public static int Main()
	{
		int n;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		int k;
		int l;
		for (i = 1;i <= n;i++)
		{
			j = i / 10;
			if (i % 7 == 0 || i % 10 == 7 || j % 10 == 7)
			{
				continue;
			}
			sum += i * i;
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}
}

