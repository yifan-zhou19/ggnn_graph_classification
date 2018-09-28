package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][40];
		int i;
		int n;
		int[] len = new int[1000];
		int max;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len[i] = String.valueOf(a[i]).length();
		}
		max = 81;
		for (i = 0; i < n; i++)
		{
			max += len[i] + 1;
			if (max > 80)
			{
				System.out.print("\n");
				max = len[i];
				System.out.print(a[i]);
			}
			else
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
		}
		System.out.print("\n");
		return 0;
	}
}

