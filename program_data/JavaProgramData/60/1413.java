package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int f;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n <= 4)
		{
			System.out.print("empty");
			return 0;
		}
		for (i = 3;i <= n - 2;i += 2)
		{
			f = 1;
			for (j = 2;j < i;j++)
			{
				if ((i % j == 0) || ((i + 2) % j == 0))
				{
					f = 0;
					break;
				}
			}
			if (f == 1)
			{
				System.out.print(i);
				System.out.print(' ');
				System.out.print(i + 2);
				System.out.print("\n");
			}
		}
		//while(1);
	}
}

