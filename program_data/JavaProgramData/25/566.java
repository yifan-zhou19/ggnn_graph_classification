package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int[] a = new int[1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (n == 0) //???0
		{
			System.out.print("1");
		}
		else
		{
			a[0] = 1;
			int t;
			int l = 1;
			for (int i = 0; i < n; i++)
			{
				for (int j = l - 1; j >= 0; j--)
				{
					a[j] = 2 * a[j];
					if (a[j] > 9) //??
					{
						t = a[j];
						a[j] = a[j] % 10;
						a[j + 1] = a[j + 1] + 1;
						if (j + 1 == l)
						{
							l++;
							break;
						}
						l++;
					}
				}
			}
		}
		int flag = 0;
		for (int m = 999; m >= 0; m--)
		{
			if (a[m] != 0 || flag != 0)
			{
				System.out.print(a[m], flag = 1);
			}
		}
		return 0;
	}
}

