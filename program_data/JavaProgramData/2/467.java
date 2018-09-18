package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[1000][26];
		char t;
		int[] b = new int[1000];
		int[] num = new int[26];
		int n;
		int i;
		int j;
		int k;
		int max;
		int[] l = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		max = 0;
		for (i = 1; i <= n; i++)
		{
			b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = new Scanner(System.in).nextLine();
			l[i] = String.valueOf(a[i]).length();
			for (j = 1; j <= l[i]; j++)
			{
				num[a[i][j] - 'A']++;
			}
		}
		for (i = 0; i <= 25; i++)
		{
			if (num[i] > max)
			{
				max = num[i];
				t = i + 'A';
			}
		}
		System.out.print(t);
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= l[i]; j++)
			{
				if (a[i][j] == t)
				{
					System.out.print(b[i]);
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

