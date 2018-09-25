package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] number = new int[1001];
		int[] num = new int[27];
		int[] ascii = new int[27];
		char[][] a = new char[1001][27];
		char p;
		int i;
		int j;
		int m;
		int n;
		int t1;
		int t;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = 26;
		for (i = 0;i < m;i++)
		{
			number[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0;j < String.valueOf(a[i]).length();j++)
			{
				num[a[i][j] - 'A']++;
			}
		}
		for (i = 0;i < n;i++)
		{
			ascii[i] = i;
		}
		for (i = 0;i < n;i++)
		{
			for (j = n - 1;j > 0;j--)
			{
				if (num[j] > num[j - 1])
				{
					t = num[j];
					num[j] = num[j - 1];
					num[j - 1] = t;
					t1 = ascii[j];
					ascii[j] = ascii[j - 1];
					ascii[j - 1] = t1;
				}
			}
		}
		p = 'A' + ascii[0];
		System.out.print(p);
		System.out.print("\n");
		System.out.print(num[0]);
		System.out.print("\n");
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < String.valueOf(a[i]).length();j++)
			{
				if (a[i][j] == p)
				{
					System.out.print(number[i]);
					System.out.print("\n");
					break;
				}
			}
		}
		return 0;
	}

}

