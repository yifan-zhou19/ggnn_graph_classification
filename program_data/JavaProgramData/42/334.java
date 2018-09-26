package <missing>;

public class GlobalMembers
{
	//??-????????
	//2010?11?01?
	//1000012753 ???


	public static int Main()
	{
		int n;
		int[] a = new int[100002];
		int i;
		int m = 0;
		int j;
		int k;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}

		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 1; i <= n - m; i++)
		{
			if (k == a[i])
			{
				m++;

				for (j = i; j <= n - m; j++)
				{
					a[j] = a[j + 1];
				}

				i--;
			}
		}

		System.out.print(a[1]);

		for (i = 2; i <= n - m; i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}

		System.out.print("\n");

		return 0;
	}



}

