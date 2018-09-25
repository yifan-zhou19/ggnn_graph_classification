package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char temp;
		char s;
		int i;
		int j;
		int[][] t = new int[27][2000];
		int m;
		int n;
		int[] a = new int[27];
		int[] num = new int[2000];
		int x;
		{
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 1; i <= n; i++)
			{
				num[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				temp = System.in.read();
				while (temp == '\n' || temp == ' ')
				{
					temp = System.in.read();
				}
				for (j = 1; 1; j++)
				{
					x = temp - 'A' + 1;
					t[x][a[x]] = num[i];
					a[x]++;
					temp = System.in.read();
					if (temp == '\n')
					{
						break;
					}
				}
			}
			m = 0;
			for (i = 1; i <= 26; i++)
			{
				if (a[i] > a[m])
				{
					m = i;
				}
			}
			s = m + 'A' - 1;
			System.out.print(s);
			System.out.print("\n");
			System.out.print(a[m]);
			System.out.print("\n");
			for (i = 0; i < a[m]; i++)
			{
				System.out.print(t[m][i]);
				System.out.print("\n");
			}
		}
	}
}

