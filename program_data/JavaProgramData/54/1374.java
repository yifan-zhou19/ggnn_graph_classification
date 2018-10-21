package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void apple(int,int); //:????
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		apple(n, k); //:????
		return 0;
	}

	public static void apple(int n,int k)
	{
		int[] a = new int[100];
		int i;
		for (a[n] = n + k;;a[n] = a[n] + n) //:?a[n]??
		{
			for (i = n - 1;i > 0 && a[i + 1] % (n - 1) == 0;i--) //:??????????????,????
			{
				a[i] = (a[i + 1] * n) / (n - 1) + k;
			}
			if (i == 0)
			{
				System.out.print(a[1]);
				System.out.print("\n");
				break;
			}
		}
	}



}

