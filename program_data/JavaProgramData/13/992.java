package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[20000];
		int[] flag = new int[20000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		System.out.print(a[0]);
		for (i = 1;i < n;i++)
		{
			for (j = 0;j < i;j++)
			{
				if (a[i] == a[j])
				{
					flag[i] = 1;
				}
			}
			if (flag[i] == 0)
			{
				System.out.print(" ");
				System.out.print(a[i]);
			}
		}
		return 0;
	}
}

