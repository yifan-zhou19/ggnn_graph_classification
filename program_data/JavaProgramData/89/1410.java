package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int flag = 0;
		int[] a = new int[10000];
		int[] b = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (i == 0 && j == 0)
			{
				break;
			}
			a[i] = a[i] + 1;
			b[j] = b[j] + 1;
		}
		for (i = 0 ; i < n ; i++)
		{
			if (a[i] == 0 && b[i] >= n - 1)
			{
				System.out.print(i);
				System.out.print("\n");
				flag = 1;
				break;
			}
		}
		if (flag == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}

}

