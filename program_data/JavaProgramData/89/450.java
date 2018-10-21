package <missing>;

public class GlobalMembers
{
	//???2010?12?8?

	//???1000010586_???

	//?????????

	public static int pan(int[] a, int n)
	{
		int i;
		for (i = 0 ; i <= n - 1 ; i++)
		{
			if (a[i] == n - 1)
			{
				return i;
				break;
			}
		}
		if (i == n)
		{
			return -1;
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] a = new int[10000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0 && (j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true))).length() > 0)
		{
			if (i == 0 && j == 0)
			{
				break;
			}
			a[j]++;
		}
		if (pan(a, n) != -1)
		{
			System.out.print(pan(a, n));
			System.out.print("\n");
		}
		else if (pan(a, n) == -1)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}

}

