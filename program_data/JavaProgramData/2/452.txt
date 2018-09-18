package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] num = new int[27];
		int[][] no = new int[27][1000];
		String s = new String(new char[27]);
		char ls;
		int l;
		int i;
		int max;
		int t;
		int j;
		int flag;
		int n;
		int w;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= t;i++)
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			s = ConsoleInput.readToWhiteSpace(true).charAt(0);
			l = s.length();
			for (j = 0;j <= l - 1;j++)
			{
				w = s.charAt(j) - 'A' + 1;
				num[w]++;
				no[w][num[w]] = n;
			}
		}
		max = 0;
		for (i = 1;i <= 26;i++)
		{
			if (num[i] > max)
			{
				max = num[i];
				flag = i;
			}
		}
		ls = (char) 64 + flag;
		System.out.print(ls);
		System.out.print("\n");
		System.out.print(num[flag]);
		System.out.print("\n");
		for (i = 1;i <= num[flag];i++)
		{
			System.out.print(no[flag][i]);
			System.out.print("\n");
		}
		w = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}
}

