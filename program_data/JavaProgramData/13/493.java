package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[20001];
		int i;
		int j;
		int k;
		int m = 0;
		int n = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 2;i <= n;i++)
		{
					for (j = 1;j < i;j++)
					{
					 if (a[j] == a[i])
					 {
					 a[i] = 10000;

					 }
					}
		}
			System.out.print(a[1]);
			for (i = 2;i <= n - m;i++)
			{
				if (a[i] != 10000)
				{
					System.out.print(" ");
					System.out.print(a[i]);
				}
			}
			return 0;
	}

}

