package <missing>;

public class GlobalMembers
{
	public static int f(int n,int k)
	{
		int[] a = new int[100];
		for (int i = 0;i < 100;i++)
		{
			a[i] = k;
		}
		int i;
		do
		{
			a[n] += n;
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
		}while (i >= 1);
		return a[1];
	}
	public static int Main()
	{
		int n;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.print(f(n, k));
		System.out.print("\n");
		return 0;
	}

}

