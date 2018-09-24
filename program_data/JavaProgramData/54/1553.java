package <missing>;

public class GlobalMembers
{
	//****************
	//?????******
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = new int[1001];
		int i = 1;
		int j = 1;
		for (i = 1;;i++)
		{
			a[n] = n * i + k;
			for (j = n - 1;j >= 1;j--)
			{
				if ((a[j + 1] % (n - 1)) != 0)
				{
					break;
				}
				else
				{
					a[j] = a[j + 1] * n / (n - 1) + k;
				}
			}

			if (a[1] != 0)
			{
				System.out.print(a[1]);
				System.out.print("\n");
			   break;
			}
		}
		return 0;
	}

}

