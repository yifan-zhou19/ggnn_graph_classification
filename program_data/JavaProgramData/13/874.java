package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] count = new int[100];
		int[] num = new int[90];
		int i = 1;
		int a;
		int j = 0;
		for (i; i <= n; i++)
		{
			a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (count[a] == 0)
			{
				num[j] = a;
				j += 1;
			}
			count[a] = count[a] + 1;
		}
		i = 0;
		for (i; i < j - 1; i++)
		{
			System.out.print(num[i]);
			System.out.print(" ");
		}
		System.out.print(num[j - 1]);
		System.out.print("\n");
		return 0;
	}
}

