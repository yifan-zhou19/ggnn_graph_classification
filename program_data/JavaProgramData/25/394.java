package <missing>;

public class GlobalMembers
{
	public static char[] result = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};

	public static void Multiply()
	{
		int i = 0;
		int up = 0;
		int len = result.length();
		for (i = 0; i < len; i++)
		{
			int temp = result[i] - '0';
			temp *= 2;
			result[i] = temp % 10 + up + '0';
			up = temp / 10;
			if (i == len - 1 && up != 0)
			{
				result[i + 1] = up + '0';
			}
		}
	}

	public static int Main()
	{
		int n;
		result[0] = '1';
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		if (n == 0)
		{
			System.out.print(result);
			System.out.print("\n");
		}
		else
		{
			for (i = 1; i <= n; i++)
			{
				Multiply();
			}
			for (i = result.length() - 1; i >= 0; i--)
			{
				System.out.print(result[i]);
			}
		}
		return 0;
	}
}

