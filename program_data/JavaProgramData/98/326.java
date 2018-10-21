package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int sum;
		int[] len = new int[1000];
		char[][] word = new char[1000][41];
		String p; //?????????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = 0;
		for (int i = 0; i < n;i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len[i] = String.valueOf(word[i]).length() + 1;
		}
		for (int i = 0; i < n - 1;i++)
		{
			p = word[i]; //????????????
			if (sum + len[i] <= 81)
			{
				if (sum + len[i] + len[i + 1] > 81) //????????
				{
					System.out.print(word[i]);
				sum += len[i];
				}
				else //??????
				{
						System.out.print(word[i]);
						System.out.print(' ');
					sum += len[i];
				}
			}
			else
			{
				System.out.print("\n");
				System.out.print(word[i]);
				System.out.print(' ');
				sum = len[i];
			}
		}
		System.out.print(word[n - 1]);
		System.out.print("\n");
		return 0;
	}

}

