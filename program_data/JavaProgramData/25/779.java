package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[50];

	public static int length()
	{
		int i;
		for (i = 49; i >= 0; i--)
		{
			if (a[i] != 0)
			{
				return (i + 1);
			}
		}
		return 0;
	}

	public static void power(int N)
	{
		int i;
		int temp;
		int add = 0;
		if (N == -1)
		{
			System.out.print("1");
			System.out.print("\n");
		}
		else if (N == 0)
		{
			for (i = length() - 1; i >= 0; i--)
			{
				System.out.print(a[i]);
			}
			System.out.print("\n");
			return;
		}
		else
		{
			for (i = 0; i < length(); i++)
			{
				temp = add + a[i] * 2;
				a[i] = temp % 10;
				add = temp / 10;
			}
			a[i] = add;
			power(N - 1);
		}
	}




	public static int Main()
	{
		int N;
		a[0] = 2;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		power(N - 1);
		return 0;
	}


}

