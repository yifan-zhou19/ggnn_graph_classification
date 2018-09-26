package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] len = new int[1000];
		char[][] word = new char[1000][41];
		(char)(*p)[41] = word;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			*(p + i) = ConsoleInput.readToWhiteSpace(true);
			len[i] = String.valueOf(*(p + i)).length();
		}
		int m = 0;
		int j = 0;
		while (m <= 80 && j < n)
		{
			if ((m + len[j] <= 80) && (j < n - 1))
			{
				m = m + len[j] + 1;
				System.out.print((p + j));
				if (m + len[j + 1] <= 80)
				{
					System.out.print(" ");
				}
				j++;
			}
			if ((m + len[j] <= 80) && j == n - 1)
			{
				System.out.print((p + j));
				System.out.print("\n");
				break;
			}
			if (m + len[j] > 80)
			{
				System.out.print("\n");
				j = j;
				m = 0;
			}
		}
		return 0;
	}







}

