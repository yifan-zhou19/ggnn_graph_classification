package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0;
		int i;
		int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] n = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (a % 4 != 0)
		{
			if (b == 1)
			{
				System.out.print(c);
				System.out.print("\n");
			}
			if (b > 1)
			{
			for (i = 0;i < b - 1;i++)
			{
				sum = sum + m[i];
			}
			sum = sum + c;
			System.out.print(sum);
			System.out.print("\n");
			}
		}

		if (a % 4 == 0)
		{
			if (a % 100 != 0)
			{
			if (b == 1)
			{
				System.out.print(c);
				System.out.print("\n");
			}
			if (b > 1)
			{
			for (i = 0;i < b - 1;i++)
			{
				sum = sum + n[i];
			}
			sum = sum + c;
			System.out.print(sum);
			System.out.print("\n");
			}
			}
		if (a % 100 == 0 && a % 400 != 0)
		{
			if (b == 1)
			{
						System.out.print(c);
						System.out.print("\n");
			}
					if (b > 1)
					{
					for (i = 0;i < b - 1;i++)
					{
						sum = sum + m[i];
					}
					sum = sum + c;
					System.out.print(sum);
					System.out.print("\n");
					}
		}
		if (a % 400 == 0)
		{
			if (b == 1)
			{
						System.out.print(c);
						System.out.print("\n");
			}
					if (b > 1)
					{
					for (i = 0;i < b - 1;i++)
					{
						sum = sum + n[i];
					}
					sum = sum + c;
					System.out.print(sum);
					System.out.print("\n");
					}
		}
		}
		return 0;
	}

}

