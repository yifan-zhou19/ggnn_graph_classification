package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int order = int m;
		int n1;
		int n2;
		n1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		order(n1);
		System.out.print(" ");
		order(n2);
		return 0;
	}

	public static int order(int m)
	{
		int[] a = new int[1000];
		int i;
		int j;
		int temp;
		for (i = 1;i <= m;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 1;i <= m - 1;i++)
		{
			for (j = 1;j <= m - i;j++)
			{
				if (a[j] > a[j + 1])
				{
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
		for (i = 1;i <= m - 1;i++)
		{
			System.out.print(a[i]);
			System.out.print(" ");
		}
		System.out.print(a[m]);
			return 0;
	}
}

