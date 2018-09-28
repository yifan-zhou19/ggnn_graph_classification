package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int[] a = new int[301];
		int k;
		int i;
		int j;
		 while ((n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (m != 0 && n != 0 = Boolean.parseBoolean(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		 {
			for (i = 1; i <= n; i++)
			{
				a[i] = 1;
			}
			j = 0;
			k = 0;
			for (i = 1; i <= n + 1; i++)
			{
				if (a[i] == 1)
				{
					j = j + a[i];
				}
				if (j == m)
				{
					j = 0;
					a[i] = 0;
					k++;
				}
				if (k == n)
				{
					System.out.print(i);
					System.out.print("\n");
					break;
				}
				if (i == n + 1)
				{
					i = 0;
				}
			}

		 }
		return 0;
	}
}

