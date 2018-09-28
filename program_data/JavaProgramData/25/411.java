package <missing>;

public class GlobalMembers
{
	public static char[] result = {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'};
	public static void mul()
	{
		int k;
		int div = 0;
		k = result.length();
		for (int i = 0; i < k; i++)
		{
		   int t;
		   t = result[i] - '0';
		   t = t * 2;
		   result[i] = t % 10 + div + '0';
		   div = t / 10;
		   if (i == k - 1 && div != 0)
		   {
				result[i + 1] = div + '0';
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
				mul();
			}
			for (i = result.length() - 1; i >= 0; i--)
			{
				System.out.print(result[i]);
			}
		}
		return 0;
	}


}

