package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] cnt = new int[1000];
		int sum;
		char[][] w = new char[1000][50];
		String p = w;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n;i++)
		{
			*(w + i) = ConsoleInput.readToWhiteSpace(true);
		}

		for (i = 0; i < n; i++)
		{
			cnt[i] = String.valueOf(*(w + i)).length();
		}
		sum = 0;
		for (i = 0; i < n;i++)
		{
			sum = sum + cnt [i];
			if (sum > 80)
			{
				System.out.print("\n");
				System.out.print(w [i]);
				System.out.print(" ");
				sum = cnt [i] + 1;
			}
			else
			{
				System.out.print(w[i]);
				if (sum + cnt [i + 1] + 1 <= 80 && i != n - 1)
				{
					System.out.print(" ");
				}
				sum = sum + 1;
			}
		}
		return 0;
	}


}

