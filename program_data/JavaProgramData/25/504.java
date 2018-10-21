package <missing>;

public class GlobalMembers
{
	public static int[] a = {2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

	public static void cal(int[] a, int I, int n)
	{
		if (I == n)
		{
			int i;
			for (i = 199;i > 0;i--)
			{
				if (a[i] != 0)
				{
					break;
				}
			}
			for (;i >= 0;i--)
			{
				System.out.print(a[i]);
			}
			System.out.print("\n");
		}

		else
		{
			int[] result = new int[200];

			for (int i = 0;i < 200;i++)
			{
				result[i] += a[i] * 2;
				if (result[i] >= 10)
				{
					result[i + 1] += result[i] / 10;
					result[i] = result[i] % 10;
				}
			}

			cal(result, I + 1, n);
		}
	}

	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0)
		{
			System.out.print(1);
		}

		else
		{
			cal(a, 1, n);
		}



		return 0;
	}
}

