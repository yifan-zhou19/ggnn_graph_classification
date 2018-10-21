package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k = 0;
		int[] sum = new int[2000];
		char[][] word = new char[2000][45];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 0;i < n - 1;i++)
		{
			sum[k] = sum[k] + String.valueOf(word[i]).length() + 1; //????????
			if (sum[k] - 1 <= 80 && sum[k] + String.valueOf(word[i + 1]).length() <= 80) //???????????????
			{
				if (i != n - 2)
				{
					System.out.print(word[i]);
					System.out.print(' ');
				}
				else
				{
					System.out.print(word[i]);
					System.out.print(' ');
					System.out.print(word[i + 1]);
				}
			}
			else if (sum[k] - 1 <= 80 && sum[k] + String.valueOf(word[i + 1]).length()>80)
			{
				System.out.print(word[i]);
				System.out.print("\n");
				k++;
			}
		}
		return 0;
	}
}

