package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[20000];
		int flag = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (flag == 0)
			{
				System.out.print(a[0]);
			}
			flag = 1;
			for (j = 0;j < i;j++)
			{
				if (a[j] == a[i])
				{
					break;
				}
				if (j == i - 1 && a[j] != a[i])
				{
					System.out.print(" ");
					System.out.print(a[i]);
				}
			}
		}
		return 0;
	}
}

