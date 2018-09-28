package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int s = 0;
		char[][] word = new char[500][50];
		int[] l = new int[500];
		String q;
		int i;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			word[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (i = 0;i < n;i++)
		{
			l[i] = 0;
			q = word[i];
			while (q != '\0')
			{
				l[i]++;
				q = q.Substring(1);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (s > 0 && s + l[i] <= 80)
			{
				System.out.print(" ");
				System.out.print(word[i]);
			}
			if (s + l[i] > 80)
			{
				s = 0;
				System.out.print('\n');
			}
			if (s == 0)
			{
				System.out.print(word[i]);
			}
			s = s + l[i] + 1;
		}
		return 0;
	}
}

