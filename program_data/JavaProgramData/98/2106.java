package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] words = new char[10000][41];
		String p;
		int i;
		int n;
		int l = 0;
		int[] len = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			words[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}

		for (i = 0;i < n;i++)
		{
			len[i] = String.valueOf(words[i]).length();
		}


		for (i = 0;i < n;i++)
		{
			p = words[i];
			if (l + len[i] + 1 <= 80)
			{
				if (i != 0)
				{
					System.out.print(" ");
					System.out.print(p);
				l += len[i] + 1;
				}
				else
				{
					System.out.print(p);

				l += len[i];
				}

				continue;
			}

			else
			{

				System.out.print("\n");
				System.out.print(p);
				l = 0;
				l += len[i];
				continue;
			}
		}


		return 0;
	}


}

