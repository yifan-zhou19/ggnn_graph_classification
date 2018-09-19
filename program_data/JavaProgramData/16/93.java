package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] sv = new int[4];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 10000)
		{
			System.out.print("00001");
			System.out.print("\n");
		}
		else if (n / 1000 != 0 && n != 10000 && n >= 1000)
		{
			for (i = 0;i < 4;i++)
			{
				sv[i] = n % 10;
				n = n / 10;
			}
			for (i = 0;i < 4;i++)
			{
				System.out.print(sv[i]);
			}
			System.out.print("\n");
		}
		else if (n / 100 != 0 && n >= 100)
		{
			for (i = 0;i < 3;i++)
			{
				sv[i] = n % 10;
				n = n / 10;
			}
			for (i = 0;i < 3;i++)
			{
				System.out.print(sv[i]);
			}
			System.out.print("\n");
		}
		else if (n / 10 != 0 && n >= 10)
		{
			for (i = 0;i < 2;i++)
			{
				sv[i] = n % 10;
				n = n / 10;
			}
			for (i = 0;i < 2;i++)
			{
				System.out.print(sv[i]);
			}
			System.out.print("\n");
		}
		else
		{
			System.out.print(n);
			System.out.print("\n");
		}
		return 0;
	}
}

