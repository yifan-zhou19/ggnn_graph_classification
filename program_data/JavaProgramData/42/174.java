package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[100001];
		int n;
		int i;
		int k;
		int sum;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++) //?????
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sum = 1; //sum????????1
		for (i = 1; i <= n; i++)
		{
			if (a[i] != k) //??????sum??
			{
				a[sum] = a[i];
				if (sum != 1)
				{
					System.out.print(' ');
				}
				System.out.print(a[sum]);
				sum++;
			}
		}
		return 0;
	}
}

