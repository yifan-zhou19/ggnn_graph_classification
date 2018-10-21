package <missing>;

public class GlobalMembers
{
	public static final int[] a = {3, 5, 7};

	public static int sum;
	public static int[] b = new int[10];

	public static int Main()
	{
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0;
		for (int i = 0; i < 3; i++)
		{
			if (N % a[i] == 0)
			{
				sum++;
				b[sum] = a[i];
			}
		}
		if (sum == 0)
		{
			System.out.print("n");
			System.out.print("\n");
		}
		else
		{
			System.out.print(b[1]);
			for (int i = 2; i <= sum; i++)
			{
				System.out.print(" ");
				System.out.print(b[i]);
			}
			System.out.print("\n");
		}
		return 0;
	}

}

