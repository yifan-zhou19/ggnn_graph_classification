package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[200];
		int i;
		int s = 0;
		int cnt = 0;
		int q;
		int j;
		while (true)
		{
				s = 0;
				cnt = 0;
				a[1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[1] == -1)
				{
					break;
				}
				for (i = 2;a[i - 1] != 0;i++)
				{
									  a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
									  cnt++;
				}
				for (i = 1;i <= cnt - 1;i++)
				{
									 for (j = i + 1;j <= cnt;j++)
									 {
														  if (a[i] == 2 * a[j] || 2 * a[i] == a[j])
														  {
														  s++;
														  }
									 }
				}
				System.out.print(s);
				System.out.print("\n");

		}
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		return 0;
	}
}

