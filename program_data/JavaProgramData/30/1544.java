package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m = 0;
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n < 100)
		{
			for (m = 1;m < n + 1;m++)
			{
					if (m % 7 == 0 || m % 10 == 7 || Math.floor(m / 10) == 7)
					{
					sum = sum;
					}
					else
					{
						sum = sum + m * m;
					}
			}
				System.out.print(sum);
				System.out.print("\n");
		}
		else
		{
			System.out.print("no count");
			System.out.print("\n");
		}
	}



}

