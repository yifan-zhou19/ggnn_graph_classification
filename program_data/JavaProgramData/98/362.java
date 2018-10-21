package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[] l = new int[1000];
		int len = 0;
		char[][] word = new char[1000][45];
		String[] p = new String[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l[i] = String.valueOf(word[i]).length();
			p[i] = word[i];
		}
		System.out.print(word[1]);
		len += l[1] + 1;
		for (i = 2; i <= n; i++)
		{
			len += l[i];
			if (len <= 80)
			{
				System.out.print(' ');
				for (k = 0; k < l[i]; k++)
				{
					System.out.print((p[i] + k));
				}
				len++;
			}
			else
			{
				System.out.print("\n");
				for (k = 0; k < l[i]; k++)
				{
					System.out.print((p[i] + k));
				}
				len = l[i] + 1;
			}

		}


		return 0;
	}

}

