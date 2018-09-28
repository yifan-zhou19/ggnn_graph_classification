package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100];
		int i;
		int n; //????n ?????? k
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		do
		{
			a[n + 1] = a[n + 1] + 1; //a[n+1]?????????????
			a[n] = a[n + 1] * n + k;
			for (i = n - 1; i >= 1; i--)
			{
			if (a[i + 1] % (n - 1) != 0)
			{
			  break;
			}
			else
			{
			  a[i] = a[i + 1] * n / (n - 1) + k;
			}
			}
		} while (i >= 1);

		System.out.print(a[1]);
		System.out.print("\n");

		return 0;
	}
}

