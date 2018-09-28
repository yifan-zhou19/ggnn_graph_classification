package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][42];
		int n;
		int[] len = new int[1000];
		int sum = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		for (i = 0;i < n;i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len[i] = String.valueOf(a[i]).length();
		}
		for (i = 0;i < n;i++)
		{
			if (sum + len[i] <= 80)
			{
				System.out.print(a[i]);
				sum += len[i];
				if (sum + 1 + len[i + 1] <= 80)
				{
					if (i != n - 1)
					{
					System.out.print(' ');
					sum++;
					}
				}
				else
				{
					System.out.print("\n");
					sum = 0;
				}
			}
		}
		System.out.print("\n");
			return 0;
	}
}

