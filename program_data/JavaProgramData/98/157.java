package <missing>;

public class GlobalMembers
{
	public static int n = 0;
	public static int[] len = new int[1001];
	public static int sum = 0;
	public static char[][] str =
	{
		{0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	};
	public static void f(int start)
	{
		int sum = 0;
		int k = 0;
		if (start > n)
		{
		}
		else
		{
			System.out.print(str[start]);
			sum = String.valueOf(str[start]).length();
			for (k = start + 1;k <= n;k++)
			{
				if ((sum + len[k]) < 80)
				{
					sum += len[k] + 1;
					System.out.print(" ");
					System.out.print(str[k]);
				}
				else
				{
					break;
				}
			}
			start = k;
			System.out.print("\n");
			f(start);
		}
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= n;i++)
		{
			str[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len[i] = String.valueOf(str[i]).length();
		}
		f(1);
		return 0;
	}
}

