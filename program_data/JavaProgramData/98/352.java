package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int k = 0;
		int sum = 0;
		int len = 0;
		int[] flag = new int[100];
		char[][] word = new char[1000][41];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		flag[0] = 0;
		for (i = 0; i < n; i++)
		{
			len = String.valueOf(*(word + i)).length();
			sum += len;
			if (sum + i - flag[k] > 80)
			{
				flag[++k] = i;
				i--;
				sum = 0;
			}
		}
		flag[k + 1] = n;
		for (i = 0; i <= k; i++)
		{
			for (j = flag[i]; j < flag[i + 1] - 1; j++)
			{
				System.out.print((word + j));
				System.out.print(" ");
			}
			System.out.print((word + flag[i + 1] - 1));
			System.out.print("\n");
		}
		return 0;
	}

}

