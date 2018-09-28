package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????????
	//*??? ?? 1300012814  **
	//*???2013.10,30  **
	//********************************
	public static int Main()
	{
		int n;
		int num = 0;
		int[] a = new int[100000];
		int b;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0; i < n; i++)
		{
		a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i = 0;
		while (i < n - num)
		{
		if (a[i] == b)
		{
		for (int j = i; j <= n - 2 - num; j++)
		{
		a[j] = a[j + 1];
		}
			num++;
		}
		else
		{
			i++;
		}
		}
		System.out.print(a[0]);
		for (int i = 1; i <= n - 1 - num; i++)
		{
			System.out.print(" ");
			System.out.print(a[i]);
		}

		return 0;
	}

}

