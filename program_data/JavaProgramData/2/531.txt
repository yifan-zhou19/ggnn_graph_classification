package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] count = new int[30];
		int[][] num = new int[30][1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n-- != 0)
		{
			int no;
			char c;
			no = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.in.read();
			while ((c = System.in.read()) != '\n')
			{
				num[c - 'A'][count[c - 'A']++] = no;
			}
		}
		int max = count[0];
		int set = 0;
		for (int i = 1; i < 26; i++)
		{
			if (max < count[i])
			{
				max = count[i];
				set = i;
			}
		}
		System.out.print((char)(set + 'A'));
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		for (int i = 0; i < max; i++)
		{
			System.out.print(num[set][i]);
			System.out.print("\n");
		}

		return 0;
	}
}

