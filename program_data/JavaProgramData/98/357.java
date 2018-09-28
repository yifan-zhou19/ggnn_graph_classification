package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] len = new int[10000];
		int tempzifushu = 0;
		int dancishu = -1;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char[][] a = new char[1000][1000];
		for (i = 0;i <= n - 1;i++)
		{
			len[i] = 0;
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		len[0] = String.valueOf(a[0]).length() + 1;
		for (i = 0;i <= n - 2;i++)
		{
			len[i + 1] = String.valueOf(a[i + 1]).length() + 1 + len[i];
		}
		for (i = 0;i <= n - 2;i++)
		{
			if ((len[i] <= 81 + tempzifushu) && (len[i + 1] >= 82 + tempzifushu))
			{
				tempzifushu = len[i];
				for (j = dancishu + 1;j <= i - 1;j++)
				{
					System.out.print(a[j]);
					System.out.print(" ");
				}
				System.out.print(a[i]);
				System.out.print("\n");
				dancishu = i;
			}
		}
		for (i = dancishu + 1;i <= n - 2;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[n - 1]);
		return 0;
	}
}

