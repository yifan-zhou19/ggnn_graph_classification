package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[999];
		int[] count = new int[27];
		int[] len = new int[999];
		int m;
		int i;
		int j;
		int max = 0;
		int per;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] ch = new char[999][26];
		char person;
		for (i = 1 ; i <= m ; i++)
		{
			num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			ch[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			len[i] = String.valueOf(ch[i]).length();
			for (j = 0 ; j <= len[i] - 1 ; j++)
			{
				count[ch[i][j] - 64]++;
			}
		}
		for (i = 1 ; i <= 26 ; i++)
		{
			if (count[i] > max)
			{
				max = count[i];
				per = i;
			}
		}
		person = per + 64;
		System.out.print(person);
		System.out.print("\n");
		System.out.print(count[per]);
		System.out.print("\n");
		for (i = 1 ; i <= m ; i++)
		{
			for (j = 0 ; j <= len[i] - 1 ; j++)
			{
				if (ch[i][j] == person)
				{
					System.out.print(num[i]);
					System.out.print("\n");
					break;
				}
			}
		}
		return 0;
	}

}

