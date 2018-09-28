package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] l = new int[10000];
		int num = -1;
		int i;
		char[][] str = new char[10000][41];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			str[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l[i] = String.valueOf(str[i]).length();
		}
		for (int i = 0; i < n; i++)
		{
			if (i == n - 1)
			{
				System.out.print(str[i]);
				break;
			}
			if (num <= 0)
			{
				num = l[i];
			}
			num = num + l[i + 1];
			if (num >= 80)
			{
				num = -1;
				System.out.print(str[i]);
				System.out.print("\n");
			}
			else
			{
				System.out.print(str[i]);
				System.out.print(" ");
			}
			num++;
		}
		return 0;
	}
}

