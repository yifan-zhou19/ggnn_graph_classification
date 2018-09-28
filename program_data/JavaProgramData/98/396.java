package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] w = new char[315][45];
		int i;
		int j;
		int k;
		int n;
		int g;
		int m = 0;
		int[] len = new int[315];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i <= n - 1;i++)
		{
			w[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len[i] = String.valueOf(w[i]).length();
		}


		for (j = 0;j <= n - 1;)
		{

			if (m == 0)
			{
				m = m + len[j];
				System.out.print(w[j]);
				j = j + 1;
			}
			else
			{

			if (m + len[j] + 1 <= 80)
			{
				m = m + len[j] + 1;

					System.out.print(" ");
					System.out.print(w[j]);
					j = j + 1;


			}
			else
			{
				System.out.print("\n");
				m = 0;

			}
			}
		}
			return 0;
	}

}

